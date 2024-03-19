package com.gy25m.presentation.ui.login.viewmodel

import androidx.lifecycle.ViewModel
import com.gy25m.domain.usecase.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class LoginViewModel @Inject constructor(private val loginUseCase: LoginUseCase):ViewModel() {
}