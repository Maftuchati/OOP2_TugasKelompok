package com.example.oopcoba

import Database.AppCustomerRoomDB
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class CustomerActivity:AppCompatActivity() {

    val db by lazy { AppCustomerRoomDB(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_customer)
        setupListener()
    }

    override fun onStart() {
        super.onStart()
        EditCsActivity.CoroutineScope(Dispatchers.IO).launch {
            val allCustomer = db.CustomerDao()
            Log.d("Customerctivity", "dbResponse: $allCustomer")
        }
    }

    fun setupListener() {
        val btn_createLaptop = null
        btn_createLaptop.setOnClickListener {
            startActivity(Intent(this, EditCsActivity::class.java))
        }
    }
}
