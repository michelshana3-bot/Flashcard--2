package com.example.flashcard

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val flashcardQuestion = findViewById<TextView>(R.id.flashcard_question)
            val flashcardAnswer=findViewById<TextView>(R.id.flashcard_answer)
        flashcardQuestion.setOnClickListener{
            flashcardQuestion.visibility= View.INVISIBLE
            flashcardAnswer.visibility=View.VISIBLE
        }
    }
}