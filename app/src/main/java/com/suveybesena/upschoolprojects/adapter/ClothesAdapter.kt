package com.suveybesena.upschoolprojects.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.suveybesena.upschoolprojects.BR
import com.suveybesena.upschoolprojects.OnClickHandlerInterface
import com.suveybesena.upschoolprojects.R
import com.suveybesena.upschoolprojects.databinding.ItemClothesBinding
import com.suveybesena.upschoolprojects.model.Clothes

class ClothesAdapter(val clothesList: List<Clothes>, val onClickHandlerInterface: OnClickHandlerInterface) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    class ClothesViewHolder(val clothesBinding: ViewDataBinding, val onClickHandlerInterface: OnClickHandlerInterface) :
        RecyclerView.ViewHolder(clothesBinding.root) {
        fun onBind(clothesModel: Clothes, position: Int) {
            val binding = clothesBinding as ItemClothesBinding
            binding.setVariable(BR.itemClothes, clothesModel)
            binding.setVariable(BR.clickHandler,onClickHandlerInterface)
            binding.setVariable(BR.position,position)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val clothesBinding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context), R.layout.item_clothes, parent, false
        )
        return ClothesViewHolder(clothesBinding, onClickHandlerInterface)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ClothesViewHolder).onBind(clothesList.get(position),position)
    }

    override fun getItemCount(): Int {
        return clothesList.size
    }

}