package com.gy25m.hellojeju.usecase

import com.gy25m.hellojeju.repository.LoginRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(private  val loginRepository: LoginRepository) {


}