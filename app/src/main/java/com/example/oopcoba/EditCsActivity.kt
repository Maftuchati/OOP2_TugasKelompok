package com.example.oopcoba

import Database.AppCustomerRoomDB
import Database.Customer
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_edit_customer.*
import com.example.oopcoba.setOnClickListener as setOnClickListener1

class EditCsActivity : AppCompatActivity() {

    val db by lazy { AppCustomerRoomDB(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_customer)
        setupListener()
    }

    fun setupListener() {
        var btn_saveCustomer = null
        btn_saveCustomer.setOnClickListener1 {
            CoroutineScope(Dispatchers.IO).launch {
                with(db) {
                    CustomerDao().addCustomer(
                        customer = Customer(
                            0,
                            txt_merk.text.toString(),
                            Integer.parseInt(txt_stok.text.toString()),
                            Integer.parseInt(txt_harga.text.toString())
                        )
                    )
                }
                finish()
            }
        }
    }

    class CoroutineScope(any: Any) {
        fun launch(function: () -> Unit): Any {
            TODO("Not yet implemented")
        }

    }

}

fun Nothing?.setOnClickListener(any: Any) {

}
