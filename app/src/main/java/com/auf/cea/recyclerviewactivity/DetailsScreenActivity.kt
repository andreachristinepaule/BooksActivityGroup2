package com.auf.cea.recyclerviewactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.auf.cea.recyclerviewactivity.databinding.ActivityDetailsScreenBinding
import com.auf.cea.recyclerviewactivity.models.BooksModel

class DetailsScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bookData = intent.getSerializableExtra("bookDetails") as? BooksModel

        binding.txtAuthor.text = String.format("by %s (%s)", bookData?.author, bookData?.datePublished)
        binding.txtName.text = bookData?.name
        binding.txtFullDesc.text = bookData?.fullDescription

        binding.btnShopNow.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(bookData?.buyLink)
            startActivity(intent)
        }

    }
}