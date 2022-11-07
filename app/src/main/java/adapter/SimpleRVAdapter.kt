package adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.auf.cea.recyclerviewactivity.databinding.ContentBooksRvBinding
import com.auf.cea.recyclerviewactivity.models.BooksModel

class SimpleRVAdapter(private var bookList: ArrayList<BooksModel>) : RecyclerView.Adapter<SimpleRVAdapter.SimpleRVViewHolder>() {

    inner class SimpleRVViewHolder(val binding: ContentBooksRvBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(binding: ContentBooksRvBinding){
            binding.llCardView.setOnClickListener{
                val user = bookList[adapterPosition]
                Log.d(SimpleRVAdapter::class.simpleName, user.toString())
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleRVViewHolder {
        val binding = ContentBooksRvBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SimpleRVViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SimpleRVViewHolder, position: Int) {
        with(holder){
            holder.bind(holder.binding)
            with(bookList[position]){
                binding.txtName.text = this.name.toString()
                binding.txtAuthor.text = this.author
                binding.txtDatePublished.text = this.datePublished
                binding.txtShort.text = this.shortDescription
            }
        }
    }

    override fun getItemCount(): Int {
        return bookList.size
    }
}