package com.gy25m.presentation.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import com.gy25m.presentation.databinding.ActivityLoginBinding
import com.gy25m.presentation.ui.login.viewmodel.LoginViewModel
import com.gy25m.presentation.ui.main.MainActivity
import com.kakao.sdk.common.KakaoSdk
import com.kakao.sdk.user.UserApiClient
import com.navercorp.nid.NaverIdLoginSDK
import com.navercorp.nid.oauth.NidOAuthLogin
import com.navercorp.nid.profile.NidProfileCallback
import com.navercorp.nid.profile.data.NidProfileResponse

class LoginActivity : AppCompatActivity() {

    val viewModel: LoginViewModel by viewModels()
    val binding by lazy { ActivityLoginBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        KakaoSdk.init(this, "ca1beef60085eb4f1b338dde9d5e2ec5")
        NaverIdLoginSDK.initialize(this, "FHFwURdGjATH1Zdy6xZI", "2m0BoyiSnL", "HelloJEju")
        binding.apply {
            btnKakaoLogin.setOnClickListener { loginKakao() }
            btnNaverLogin.setOnClickListener { loginNaver() }
        }

    }

    fun loginKakao(){
        UserApiClient.instance.loginWithKakaoTalk(this) { token, error ->
            if (error != null) {
                Log.e("gyeom", "로그인 실패", error)
            }
            else if (token != null) {
                Log.i("gyeom", "로그인 성공 ${token.accessToken}")
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }
        UserApiClient.instance.me { user, error ->
            if (error != null) {
                Log.e("gyeom", "사용자 정보 요청 실패", error)
            }
            else if (user != null) {
                Log.i("gyeom", "사용자 정보 요청 성공" +
                        "\n회원번호: ${user.id}" +
                        "\n이메일: ${user.kakaoAccount?.email}" +
                        "\n닉네임: ${user.kakaoAccount?.profile?.nickname}" +
                        "\n프로필사진: ${user.kakaoAccount?.profile?.thumbnailImageUrl}")
            }
        }
    }

    fun loginNaver(){
        NaverIdLoginSDK.authenticate(this,launcher)
    }

    private val launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        when(result.resultCode) {
            RESULT_OK -> {
                // 네이버 로그인 인증이 성공했을 때 수행할 코드 추가
                NidOAuthLogin().callProfileApi(naverUserInfo)
                val aa = NaverIdLoginSDK.getAccessToken()
                val bb = NaverIdLoginSDK.getRefreshToken()
                val cc = NaverIdLoginSDK.getExpiresAt().toString()
                val dd = NaverIdLoginSDK.getTokenType()
                val ee = NaverIdLoginSDK.getState().toString()
                Log.e("gyeom", "$aa/$bb/$cc/$dd/$ee")
            }
            RESULT_CANCELED -> {
                // 실패 or 에러
                val errorCode = NaverIdLoginSDK.getLastErrorCode().code
                val errorDescription = NaverIdLoginSDK.getLastErrorDescription()
                Log.e("gyeom", "errorCode:$errorCode, errorDesc:$errorDescription")
            }
        }
    }

    val naverUserInfo=object : NidProfileCallback<NidProfileResponse> {
        override fun onError(errorCode: Int, message: String) {
            TODO("Not yet implemented")
        }

        override fun onFailure(httpStatus: Int, message: String) {
            TODO("Not yet implemented")
        }

        override fun onSuccess(result: NidProfileResponse) {
            Log.e("gyeom", result.profile?.name.toString())
        }

    }

}