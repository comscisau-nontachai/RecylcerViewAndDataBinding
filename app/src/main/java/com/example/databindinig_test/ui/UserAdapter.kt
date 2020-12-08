package com.example.databindinig_test.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.databindinig_test.data.model.UserModel
import com.feyverly.databindinig_test.databinding.ItemRvUsersBinding

class UserAdapter(val items:List<UserModel>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>(){

    class UserViewHolder(val binding : ItemRvUsersBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item:UserModel){
            binding.apply {
                data = item
                executePendingBindings()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(ItemRvUsersBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

}