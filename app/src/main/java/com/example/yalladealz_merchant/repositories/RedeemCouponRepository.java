package com.example.yalladealz_merchant.repositories;

import android.util.Log;

import com.example.yalladealz_merchant.interfaces.RedeemCouponFace;
import com.example.yalladealz_merchant.remote.APIInterface;
import com.example.yalladealz_merchant.remote.RetrofitClient;
import com.example.yalladealz_merchant.responses.RedeemCouponResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
//updated api RedeemCoupon
public class RedeemCouponRepository {
    APIInterface apiInterface;
    private RedeemCouponFace redeemCouponFace;

    public RedeemCouponRepository(RedeemCouponFace redeemCouponFace) {
        this.redeemCouponFace = redeemCouponFace;
        apiInterface = RetrofitClient.getClient();
    }

    public void getCouponRedeem() {
        Call<RedeemCouponResponse> call = apiInterface.getMessageRedeemResponse();
        call.enqueue(new Callback<RedeemCouponResponse>() {
            @Override
            public void onResponse(Call<RedeemCouponResponse> call, Response<RedeemCouponResponse> response) {
                if (response.isSuccessful())
                    redeemCouponFace.onSucceed(response.body());
                else Log.d("ahmed", "Error on response getCouponRedeem");
            }

            @Override
            public void onFailure(Call<RedeemCouponResponse> call, Throwable t) {
                redeemCouponFace.onFailed(t);
                Log.d("ahmed", "Error on Failure getCouponRedeem");
            }
        });
    }
}
