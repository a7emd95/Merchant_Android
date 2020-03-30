package com.example.yalladealz_merchant.repositories;

import android.app.Application;
import android.widget.Toast;

import androidx.fragment.app.FragmentManager;

import com.example.yalladealz_merchant.R;
import com.example.yalladealz_merchant.RedeemFragment;
import com.example.yalladealz_merchant.remote.APIInterface;
import com.example.yalladealz_merchant.remote.RetrofitClient;
import com.example.yalladealz_merchant.responses.LoginResponse;
import com.example.yalladealz_merchant.utils.SharedUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.yalladealz_merchant.utils.CommonMethod.replaceFragment;
import static com.example.yalladealz_merchant.utils.LogUtil.error;
import static com.example.yalladealz_merchant.utils.LogUtil.verbose;

public class LoginRepository {
    private Application application;
    private APIInterface apiInterface;

    public LoginRepository(Application application) {
        this.application = application;
        apiInterface = RetrofitClient.getClient();
    }

    public void login(String email, String password, FragmentManager manager) {
        apiInterface.login(email, password)
                .enqueue(new Callback<LoginResponse>() {
                    @Override
                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                        if (response.isSuccessful()) {
                            verbose("onLoginResponseSuccess: success: " + response.body().toString());
                            Toast.makeText(application, "Logged in", Toast.LENGTH_SHORT).show();
                            SharedUtils.saveClass(application, "token", response.body());
                            replaceFragment(manager, R.id.frame, new RedeemFragment());

                        }
                    }

                    @Override
                    public void onFailure(Call<LoginResponse> call, Throwable t) {
                        error("onLoginResponseFailure: failed cause of " + t.getMessage());


                    }
                });
    }
}
