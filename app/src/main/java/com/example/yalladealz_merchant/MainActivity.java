package com.example.yalladealz_merchant;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.yalladealz_merchant.model.report.ReportResponse;
import com.example.yalladealz_merchant.model.singleMerchant.SingleMerchant;
import com.example.yalladealz_merchant.remote.APIInterface;
import com.example.yalladealz_merchant.remote.RetrofitClient;

import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frame, new RedeemFragment()).commit();

        APIInterface apiInterface = RetrofitClient.getClient();

        apiInterface.getMerchantDetails("5e7df19d7b4c7203fc7c23b8").enqueue(new Callback<SingleMerchant>() {
            @Override
            public void onResponse(Call<SingleMerchant> call, Response<SingleMerchant> response) {

            }

            @Override
            public void onFailure(Call<SingleMerchant> call, Throwable t) {

            }
        });



    }
}
