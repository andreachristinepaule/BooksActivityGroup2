package adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.auf.cea.recyclerviewactivity.DetailsScreenActivity
import com.auf.cea.recyclerviewactivity.databinding.ContentBooksRvBinding
import com.auf.cea.recyclerviewactivity.dialogs.DetailsFragment
import com.auf.cea.recyclerviewactivity.models.BooksModel

class SimpleRVAdapter(private var bookList: ArrayList<BooksModel>,private var context: Context) : RecyclerView.Adapter<SimpleRVAdapter.SimpleRVViewHolder>() {

    inner class SimpleRVViewHolder(val binding: ContentBooksRvBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(binding: ContentBooksRvBinding){
            binding.llCardView.setOnClickListener{
                val bookData = bookList[adapterPosition]
                val activity = context as AppCompatActivity
                val detailsFragment = DetailsFragment.newInstance(bookData)
                detailsFragment.show(activity.supportFragmentManager,null)
                Log.d(SimpleRVAdapter::class.simpleName, bookData.toString())
            }
            binding.btnReadFull.setOnClickListener{
                val bookData = bookList[adapterPosition]
                val intent = Intent(context, DetailsScreenActivity::class.java)
                intent.putExtra("bookDetails", bookData)
                context.startActivity(intent)
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
                binding.txtName.text = this.name
                binding.txtAuthor.text = String.format("by %s (%s)", author, datePublished)
                binding.txtShort.text = this.shortDescription
            }
        }
    }

    override fun getItemCount(): Int {
        return bookList.size
    }
}