package com.example.oopcoba

import Database.AppCustomerRoomDB
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class TanamanActivity : AppCompatActivity(){

    val db by lazy { AppCustomerRoomDB(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_tanaman)
        setupListener()
    }

    override fun onStart() {
        super.onStart()
        EditCsActivity.CoroutineScope(Dispatchers.IO).launch {
            val allTanaman = db.TanamanDao()
            Log.d("TanamanActivity", "dbResponse: $allTanaman")
        }
    }

    fun setupListener() {
        var btn_createUser = null
        btn_createUser.setOnClickListener {
            startActivity(Intent(this, EditTnActivity::class.java))
        }
    }

}