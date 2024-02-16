package com.gy25m.hellojeju.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.gy25m.hellojeju.databinding.ActivityLoginBinding
import com.gy25m.hellojeju.ui.login.viewmodel.LoginViewModel
import com.gy25m.hellojeju.ui.main.MainActivity
import com.kakao.sdk.user.UserApiClient

class LoginActivity : AppCompatActivity() {

    val viewModel: LoginViewModel by viewModels()
    val binding by lazy { ActivityLoginBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {

        }

    }

    fun loginKakao(){
        UserApiClient.instance.loginWithKakaoTalk(this) { token, error ->
            if (error != null) {
                Log.e("gyeom", "로그인 실패", error)
            }
            else if (token != null) {
                Log.i("gyeom", "로그인 성공 ${token.accessToken}")
                startActivity(Intent(this,MainActivity::class.java))
                finish()
            }
        }
    }

}