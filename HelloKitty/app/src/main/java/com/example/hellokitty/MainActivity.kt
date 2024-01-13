package com.example.hellokitty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //Мы объявили переменную типа TextView под именем mHelloTextView.
    private lateinit var helloTextView: TextView

    //Отредактируем код для щелчка кнопки.
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //Теперь система знает о существовании элемента TextView.
        helloTextView = findViewById(R.id.textView)

        //объявляем компонент ImageButton
        var imageButton: ImageButton = findViewById(R.id.imageButton)

        // и пишем код для обработчика щелчка -
        // обращаемся к элементу mHelloTextView
        // и через его метод setText() программно меняем текст на нужные слова.
        imageButton.setOnClickListener {
            helloTextView.setText("Hello Kitty")

        //обработчик щелчка кнопки
            imageButton.setOnClickListener{
                val intent = Intent(this@MainActivity,AboutActivity::class.java)
                startActivity(intent)
            }
        }
    }
}