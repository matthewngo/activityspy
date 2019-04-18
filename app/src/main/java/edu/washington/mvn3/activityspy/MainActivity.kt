package edu.washington.mvn3.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(tag, "onCreate event fired")
        if (savedInstanceState != null) {
            Log.i(tag, savedInstanceState.toString())
        }
        setContentView(R.layout.activity_main)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(tag, "We're going down, Captain!")
    }

}
