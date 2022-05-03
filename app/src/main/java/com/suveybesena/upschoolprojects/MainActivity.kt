package com.suveybesena.upschoolprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.suveybesena.upschoolprojects.adapter.ClothesAdapter
import com.suveybesena.upschoolprojects.databinding.ActivityMainBinding
import com.suveybesena.upschoolprojects.model.Clothes

class MainActivity : AppCompatActivity(), OnClickHandlerInterface {
    private lateinit var databinding: ActivityMainBinding
    private lateinit var onClickHandlerInterface: OnClickHandlerInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        databinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val list = ArrayList<Clothes>()
        list.add(Clothes("Empire Dress", "$136.00", R.drawable.ic_clothes1))
        list.add(Clothes("Summer Vibes", "$199.99", R.drawable.ic_clothes2))
        list.add(Clothes("Flora Fun", "$150.99", R.drawable.ic_clothes3))
        list.add(Clothes("Empire Dress", "$120.99", R.drawable.ic_clothes4))

        onClickHandlerInterface = this

        val adapter = ClothesAdapter(list, onClickHandlerInterface)
        val gridLayoutManager = GridLayoutManager(this, 2)
        databinding.recyclerView.layoutManager = gridLayoutManager
        databinding.setVariable(BR.adapter, adapter)


    }

    override fun onClick(view: View, position: Int) {
        Log.v("TAG", "TIKLANDI - ${position}")
        Toast.makeText(baseContext, "TIKLANDI", Toast.LENGTH_LONG).show()
        //Toast.makeText(getBaseContext(), "TIKLANDI", Toast.LENGTH_LONG).show()
        //Toast.makeText(getApplicationContext(), "TIKLANDI", Toast.LENGTH_LONG).show()
        //Toast.makeText(applicationContext, "TIKLANDI", Toast.LENGTH_LONG).show()
    }
}