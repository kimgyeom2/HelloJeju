package com.gy25m.domain.usecase

import com.gy25m.domain.repository.LoginRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(private  val loginRepository: LoginRepository) {


}