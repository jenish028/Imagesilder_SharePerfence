package com.example.imagesilder_shareperfence.Utills

import android.app.Activity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Shr(val context:Activity) {

    fun creratSHR(email: String, password: String) {
        var shr = context.getSharedPreferences("MyPreaf", AppCompatActivity.MODE_PRIVATE)
        var editer = shr.edit()
        editer.putString("e1", email)
        editer.putString("p1", password)
        editer.commit()
    }

    fun getSHR() {
        var shr = context.getSharedPreferences("MyPreaf", AppCompatActivity.MODE_PRIVATE)
        var email = shr.getString("e1", null)
        var password = shr.getString("p1", null)
        Toast.makeText(context, "$email $password ", Toast.LENGTH_SHORT).show()

    }
}