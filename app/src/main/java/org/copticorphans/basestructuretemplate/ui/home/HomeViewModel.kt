/*************************************************
 * Created by Efendi Hariyadi on 6/18/20 9:16 PM
 * Copyright (c) 2020 . All rights reserved.
 * Last modified 6/18/20 9:16 PM
 ************************************************/

package org.copticorphans.basestructuretemplate.ui.home

import androidx.lifecycle.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.copticorphans.basestructuretemplate.remote.model.GithubUsersItemNetwork
import retrofit2.HttpException
import java.io.IOException

class HomeViewModel(private val githubRepository: HomeRepository) : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
    val userList = MutableLiveData<List<GithubUsersItemNetwork>>()
    val errorMessage = MutableLiveData<String>()
    fun vmGetUserList () {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                try {
                    val result = githubRepository.getGitHunbUserInfo()
                    userList.postValue(result)
                } catch (throwable: Throwable) {
                    when (throwable) {
                        is IOException -> {
                            errorMessage.postValue("Network Error")
                        }
                        is HttpException -> {
                            val codeError = throwable.code()
                            val errorMessageResponse = throwable.message()
                            errorMessage.postValue("Error $errorMessageResponse : $codeError")
                        }
                        else -> {
                            errorMessage.postValue("Uknown error")
                        }
                    }
                }
            }
        }
    }

//    val allUsers: LiveData<List<GithubUsersItemNetwork>> = liveData {
//        val retrivedTodo = githubRepository.getGitHunbUserInfo()
//        emit(retrivedTodo)
//    }
}