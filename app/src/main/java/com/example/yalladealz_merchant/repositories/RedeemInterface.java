package com.example.yalladealz_merchant.repositories;

import com.example.yalladealz_merchant.remote.APIInterface;
import com.example.yalladealz_merchant.remote.RetrofitClient;
import com.example.yalladealz_merchant.responses.RedeemResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RedeemInterface {

    RetrofitClient retrofitClient;
    APIInterface apiInterface;

    public RedeemInterface() {
        retrofitClient = new RetrofitClient();
        apiInterface = RetrofitClient.getClient();
    }

    public interface RedeemIface{

        void onSucced(RedeemResponse redeemResponse);
        void onError(String error);
    }

    public void getData(int branch_id, RedeemIface redeemIface){
        Call<RedeemResponse> call = apiInterface.getRedeem(branch_id);
        call.enqueue(new Callback<RedeemResponse>() {
            @Override
            public void onResponse(Call<RedeemResponse> call, Response<RedeemResponse> response) {
                redeemIface.onSucced(response.body());
            }

            @Override
            public void onFailure(Call<RedeemResponse> call, Throwable t) {

                redeemIface.onError(t.getMessage());

            }
        });
    }
}
