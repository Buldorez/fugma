package com.example.figma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.figma.DataBase.Api
import com.example.figma.DataBase.MyRetrofit
import com.example.figma.DataBase.login
import retrofit2.Call
import retrofit2.Response

class SignInActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
    }

    fun signin(view: android.view.View) {
        if(email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty())
        {
            val log = MyRetrofit().getRetrofit()
            val getApi = log.create(Api::class.java)
            var hashMap: HashMap<String,String> = HashMap<String,String>()
            hashMap.put("email",email.text.toString())
            hashMap.put("password",password.text.toString())
            val log_call:retrofit2.Call<login> = getApi.getAuth(hashMap)
            log_call.enqueue(object: retrofit2.Callback<login>{
                override fun onResponse(call: Call<login>, response: Response<login>) {
                    if (response.isSuccessful){
                        val intent = Intent(this@SignInActivity, MenuActivity::class.java)
                        startActivity(intent)
                    }

                }

                override fun onFailure(call: Call<login>, t: Throwable) {
                    Toast.makeText(this@SignInActivity, t.message, Toast.LENGTH_SHORT).show()
                }
            })

        }
        else
        {
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас есть незаполненные поля")
                .setPositiveButton("Ok", null)
                .create()
                .show()
        }
    }
}