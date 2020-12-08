package com.example.databindinig_test.utils

import android.widget.ImageView
import android.widget.ProgressBar
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

@BindingAdapter(value = ["setImageURL"])
fun ImageView.bindImageUrl(url: String) {
    url.let {
        Glide.with(context).load(it).into(this)
    }
}

