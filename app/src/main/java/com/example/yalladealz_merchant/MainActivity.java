package com.example.yalladealz_merchant;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.yalladealz_merchant.model.branches.MerchantsBranches;
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


        // start api test
      /*  APIInterface apiInterface = RetrofitClient.getClient();

         String Key = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1ZTdmYTM5MWZkNTJjODFhMzAyNTQ5ZDciLCJpYXQiOjE1ODU0MzU5MTAsImV4cCI6MTU4NjI5OTkxMH0.aj8pU_3RphsCS8k-J-FpRwBF_VV75-9Vpc6lxGa9cQQ";

        apiInterface.getMerchantBranches(Key,"5e7df19d7b4c7203fc7c23b8").enqueue(new Callback<MerchantsBranches>() {
            @Override
            public void onResponse(Call<MerchantsBranches> call, Response<MerchantsBranches> response) {

            }

            @Override
            public void onFailure(Call<MerchantsBranches> call, Throwable t) {

            }
        });*/
        //end api test


    }
}
