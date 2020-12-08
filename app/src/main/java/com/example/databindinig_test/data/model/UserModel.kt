package com.example.databindinig_test.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserModel(
        val id : Int,
        val avatar_url:String,
        val login:String
) : Parcelable