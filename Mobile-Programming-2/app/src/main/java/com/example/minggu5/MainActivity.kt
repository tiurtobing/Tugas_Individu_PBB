package com.example.minggu5

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MESSAGE = "com.example.minggu4.extra.MESSAGE"
    }

    private val LOG_TAG = MainActivity::class.simpleName

    private var messageEditText: EditText? = null
    private var buttonMain: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        messageEditText = findViewById(R.id.editText_main)
        buttonMain = findViewById(R.id.button_main)

        buttonMain?.setOnClickListener{
            launchSecondActivity()
        }

        Log.d(LOG_TAG, "-------")
        Log.d(LOG_TAG, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy")
        Log.d(LOG_TAG, "sesi telah berakhir")
    }

    fun launchSecondActivity() {
        Log.d(LOG_TAG, "Tombol diklik")

        val message: String = messageEditText?.text.toString()

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }
}