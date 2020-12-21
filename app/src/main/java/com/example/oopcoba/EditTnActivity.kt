package com.example.oopcoba

import Database.AppCustomerRoomDB
import Database.Tanaman
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_edit_customer.*

class EditTnActivity : AppCompatActivity() {

    val db by lazy { AppCustomerRoomDB(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_tanaman)
        setupListener()
    }

    fun setupListener() {
        val btn_savetanaman = null
        btn_savetanaman.setOnClickListener {
            EditCsActivity.CoroutineScope(Dispatchers.IO).launch {
                with(db) {
                    TanamanDao().addTanaman(
                                tanaman = Tanaman(0, txt_stok.text.toString())

                }
                finish()
            }
        }
    }
}