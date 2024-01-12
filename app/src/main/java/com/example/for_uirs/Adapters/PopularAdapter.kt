package com.example.for_uirs.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.for_uirs.DetailsActivity
import com.example.for_uirs.Models.PopularModel
import com.example.for_uirs.databinding.FragmentHomeBinding
import com.example.for_uirs.databinding.HomeWorksItemsBinding

class PopularAdapter(
    val context : Context,
    val list: ArrayList<PopularModel>

): RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PopularAdapter.PopularViewHolder {
        val binding = HomeWorksItemsBinding.inflate(LayoutInflater.from(context), parent, false)
        return PopularViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PopularAdapter.PopularViewHolder, position: Int) {

        val listModel = list[position]

        holder.workName.text = listModel.getWorkName()
        holder.workPrice.text = listModel.getWorkPrice()
        listModel.getWorkImage()?.let { holder.workImage.setImageResource(it) }

        holder.item.setOnClickListener{
            val intent = Intent(context, DetailsActivity :: class.java)
            intent.putExtra("workImage", listModel.getWorkImage())
            intent.putExtra("workName", listModel.getWorkName())
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class PopularViewHolder(binding : HomeWorksItemsBinding): RecyclerView.ViewHolder(binding.root) {

        val workImage = binding.homeWorkImage
        val workName = binding.homeWorkName
        val workPrice = binding.homeWorkPrice

        val item = binding.root

    }

}