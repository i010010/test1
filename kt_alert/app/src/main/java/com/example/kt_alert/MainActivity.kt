package com.example.kt_alert

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ダイアログを作成して表示
        AlertDialog.Builder(this).apply {
            setTitle("Title")
            setMessage("Message")
            setPositiveButton("OK", DialogInterface.OnClickListener { _, _ ->
                // OKをタップしたときの処理
                Toast.makeText(context, "Dialog OK", Toast.LENGTH_LONG).show()
            })
            setNegativeButton("Cancel", null)
            show()
        }

    }
}
