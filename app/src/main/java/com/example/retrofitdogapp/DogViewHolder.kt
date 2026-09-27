package com.example.retrofitdogapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitdogapp.databinding.ItemDogBinding
import com.squareup.picasso.Picasso

class DogViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val itemDogBinding: ItemDogBinding = ItemDogBinding.bind(view)

    fun bind(imageUrl: String?) {
        Picasso.get().load(imageUrl).into(itemDogBinding.ivDog)
    }
}
