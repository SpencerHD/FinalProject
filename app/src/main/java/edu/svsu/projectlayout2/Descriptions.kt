package edu.svsu.projectlayout2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_description.*

class Descriptions : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        val myIntent = Intent()
        val name = intent.extras!!.getString("NAME").toString()
        val desc = intent.extras!!.getString("DESC").toString()
        val price = intent.extras!!.getString("PRICE").toString()
        if (txtName != null) {
            txtName.setText(name)
        }
        if (txtDesc != null) {
            txtDesc.setText(desc)
        }
        if (txtPrice != null) {
            txtPrice.setText(price)
        }
    }
}
