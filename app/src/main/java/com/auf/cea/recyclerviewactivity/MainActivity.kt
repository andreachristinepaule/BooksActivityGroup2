package com.auf.cea.recyclerviewactivity

import adapter.SimpleRVAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.auf.cea.recyclerviewactivity.databinding.ActivityMainBinding
import com.auf.cea.recyclerviewactivity.models.BooksModel

class MainActivity : AppCompatActivity() {
        private lateinit var binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            //https://www.rd.com/list/books-read-before-die/
            var bookList = arrayListOf(
                BooksModel(
                    "Anna Karenina", "Leo Tolstoy",
                    "Ah, Anna Karenina. Lusty love affair or best romance of all time? Most critics pin it as one of most iconic literary love stories, and for good reason",
                    "Leo Tolstoy’s sweeping Russian tale of star-crossed lovers is littered with swoon-worthy quotes like, “He stepped down, trying not to look long at her, as if she were the sun, yet he saw her, like the sun, even without looking.” Described by Fyodor Dostoevsky as “flawless,” this one belongs on any book collector’s shelf.",
                    "1878"
                ),
                BooksModel(
                    "To Kill a Mockingbird", "Harper Lee",
                    "Harper Lee’s To Kill a Mockingbird upends the quiet solitude of a segregated Southern town with a story of innocence and virtue, bigotry and hate, love and forgiveness",
                    "Eight-year-old Scout Finch and her father, Atticus, find themselves enmeshed in the trial of a Black man accused of raping a White woman. In one of the most deeply sad books, Lee tells the events, revelations, and lessons through the eyes of a young child. Widely read and widely taught, To Kill a Mockingbird continues to spark discussions of race in classrooms and libraries across the country.",
                    "1960"
                ),
                BooksModel(
                    "Where the sidewalk ends", "Shel Silverstein",
                    "Eight-year-old Scout Finch and her father, Atticus, find themselves enmeshed in the trial of a Black man accused of raping a White woman. In one of the most deeply sad books, Lee tells the events, revelations, and lessons through the eyes of a young child. Widely read and widely taught, To Kill a Mockingbird continues to spark discussions of race in classrooms and libraries across the country.",
                    "Where the Sidewalk Ends is truly one of the best poetry books of all time because of its staying power for children and adults alike. Whimsical and masterful, the stories of this American poet, author, singer, and folk artist have something for everyone.",
                    "1974"
                ),
                BooksModel(
                    "Valley of the Dolls", "Jacqueline Susann",
                    "Sex and drugs have a common allure, but they also have a common endgame: a downward spiral",
                    "In Valley of the Dolls, Jacqueline Susann offers in lurid detail the stories of three young women who want nothing more than to reach the pinnacle of life. But just as they see it in their grasp, they lose it all in a coil of sex, lust, romance, and abandonment. This page-turner is one of those classic beach reads you won’t be able to put down, and it paved the way for similar scintillating vacation books.",
                    "1966"
                ),
                BooksModel(
                    "The Shining", "Stephen King",
                    "The master of suspense must be included in any list of books you should read in a lifetime",
                    "That’s why you’ll find Stephen King’s The Shining here. Brought to life in cinematic perfection by Jack Nicholson, Jack Torrance is a middle-aged man looking for a fresh start. He thinks he’s found it when he lands a job as the off-season caretaker at an idyllic old hotel, the Overlook. But as snow piles higher outside, the secluded location begins to feel more confining and sinister, less freeing and more provoking. Horror fans, take note: This is one of the scariest books of all time.",
                    "1977"
                ),
                BooksModel(
                    "The Little Prince", "Antoine de Saint-Exupéry",
                    "The Little Prince is a timeless tale of a prince’s journey from planet to planet in search of adventure",
                    "What he finds, however, are interactions with adults who leave him frustrated or dismayed. In the Sahara Desert, he runs into the book’s narrator, and the two start an eight-day journey filled with lessons. Don’t let this book’s size fool you—it’s one of the most compelling short books we’ve ever read. It’s also one of the most widely read classics all over the world. Whether you prefer reading in English, French, or another language, you’re bound to find a copy.",
                    "1943"
                ),
                BooksModel(
                    "The Fellowship of the Ring", "J.R.R. Tolkien",
                    "In The Fellowship of the Ring, the first book in the Lord of the Rings trilogy, journey to Middle-earth",
                    "Frodo is tasked with destroying the One Ring, the most powerful Ring in Mordor, but along the way, his quest is filled with many of Tolkien’s unique and captivating characters, as well as an adventure of epic proportions.",
                    "1954"
                ),
                BooksModel(
                    "The Handmaid’s Tale", "Margaret Atwood",
                    "Offred, a handmaid in the Republic of Gilead, has been removed from the home, family, and life that she knew only to be forced into service as a housemaid—and a working pair of ovaries",
                    "As the population of Gilead falls, a woman’s value becomes contingent upon her fertility and ability to reproduce, and those who can procreate are stripped of their independence. Margaret Atwood’s The Handmaid’s Tale is one part cautionary tale and one part enthralling narrative.",
                    "1985"
                ),
                BooksModel(
                    "A Wrinkle in Time", "Madeleine L’Engle",
                    "While this book may have seen an uptick in interest thanks to the 2018 film starring Oprah Winfrey, Mindy Kaling, and Reese Witherspoon, Madeleine L’Engle’s A Wrinkle in Time has long been held as a must-read for its fantastical telling of splitting the fabric of time and space",
                    "A Newbery Medal winner, this science-fantasy novel follows troublesome and stubborn Meg Murry as she confronts her father’s mysterious disappearance with a collection of peculiar neighbors: Mrs. Whatsit, Mrs. Who, and Mrs. Which. Elements of love, trust, and overcoming fear are woven into this enchanting coming-of-age story.",
                    "1962"
                ),
                BooksModel(
                    "Pride and Prejudice", "Jane Austen",
                    "Jane Austen’s classic Pride and Prejudice adorned shelves of many a learned reader in the 1800s and 1900s, but its timeless story and lessons earn it a spot in many home libraries",
                    " When eligible young men arrive in their neighborhood, Mr. and Mrs. Bennett must prepare their five eager daughters for the role of a lifetime: wife. While the Bennett sisters’ wit and humor keep the pages flipping, the classic story, which is widely considered one of the best romance novels, also serves as a harbinger for hasty mistakes and erred judgments.",
                    "1813"
                )

            )
            val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
            val simpleRvAdapter = SimpleRVAdapter(bookList)
            binding.rvSimpleName.layoutManager = layoutManager
            binding.rvSimpleName.adapter = simpleRvAdapter
        }
}