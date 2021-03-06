package com.example.test2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Activity開始時にIntentを取得し、文字列をセットする
        val intent: Intent = getIntent()
        val message: String = intent.getStringExtra(MainActivity().EXTRA_MESSAGE)
        val textView = findViewById(R.id.text_view_id) as TextView
        textView.setText(message)

    }
}
