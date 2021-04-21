package com.ptit.zaloclone.message

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions

@BindingAdapter("app:avatar")
fun setUserAvatar(imageView: ImageView, imageUrl: String){
    Glide.with(imageView.context)
        .load(imageUrl)
        .apply(RequestOptions.circleCropTransform().override(200))
        .into(imageView)
}