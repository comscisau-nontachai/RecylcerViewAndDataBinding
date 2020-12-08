package com.example.databindinig_test.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.databindinig_test.data.model.UserModel
import com.example.databindinig_test.data.remote.UserApi
import kotlinx.coroutines.launch

class UserViewModel(private val api: UserApi) : ViewModel() {

    private val _data = MutableLiveData<List<UserModel>>()
    val data: LiveData<List<UserModel>> //for get to use value
        get() = _data

    init {
        getAllUser()
    }

    private fun getAllUser() {
        viewModelScope.launch {
            try {
                val response = api.getUser()
                if (response.isSuccessful) {
                    _data.value = response.body()
                }
            } catch (e: Exception) {
                Log.d("LOG_TAG", e.message?:"error")
            }
        }

    }
}