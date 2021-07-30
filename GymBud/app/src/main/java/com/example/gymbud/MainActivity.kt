package com.example.gymbud

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bundle = intent.extras
        val userName = bundle!!.getString("USER_NAME")
        val userId = bundle!!.getString("USER_ID")
        tv_user_name.text = userName


        val user_image = intent.getStringExtra("USER_IMAGE")
        Glide.with(this).load(user_image).circleCrop().into(iv_user_image)
    }

    fun passToFitness(view: View) {
        startActivity(Intent(this, FitnessActivity::class.java))
    }

    fun passToWorkout(view: View) {
        startActivity(Intent(this, WorkoutActivity::class.java))
    }
}