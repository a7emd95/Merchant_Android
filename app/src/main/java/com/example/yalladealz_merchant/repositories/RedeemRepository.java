package com.example.yalladealz_merchant.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.yalladealz_merchant.model.RedeemCoupon;
import android.app.Application;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.yalladealz_merchant.remote.APIInterface;
import com.example.yalladealz_merchant.remote.RetrofitClient;
import com.example.yalladealz_merchant.responses.RedeemCouponResponse;
import com.example.yalladealz_merchant.responses.RedeemResponse;
import com.example.yalladealz_merchant.utils.SharedUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RedeemRepository implements RedeemInterface.RedeemIface {

    private APIInterface apiInterface;
    private Application application;
    private RedeemInterface redeemInterface;
    private MutableLiveData<RedeemResponse> redeemResponseMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<String> stringMutableLiveData = new MutableLiveData<>();
    private static MutableLiveData<String> redeemCouponData;

    public RedeemRepository(Application application) {
        this.application = application;
        apiInterface = RetrofitClient.getClient();
        redeemInterface = new RedeemInterface();

        redeemCouponData = new MutableLiveData<>();
    }

    public void getRedeem(int id) {
        redeemInterface.getData(id, this);
    }

    @Override
    public void onSucced(RedeemResponse redeemResponse) {
        redeemResponseMutableLiveData.postValue(redeemResponse);
    }

    @Override
    public void onError(String error) {
        stringMutableLiveData.postValue(error);
        Toast.makeText(application, error+" ", Toast.LENGTH_SHORT).show();

    }

    public LiveData<RedeemResponse> getData(){
        return redeemResponseMutableLiveData;
    }

    public LiveData<String> getError() {
        return stringMutableLiveData;
    }



    public LiveData<String> useRedeem(RedeemCoupon coupon){

        apiInterface.useRedeem(coupon).enqueue(new Callback<RedeemCouponResponse>() {
            @Override
            public void onResponse(Call<RedeemCouponResponse> call, Response<RedeemCouponResponse> response) {

                RedeemCouponResponse couponResponse = response.body();

                if(!couponResponse.getIs_coupon()){
                    redeemCouponData.postValue("Coupon not valid");
                }
                else if(couponResponse.getIs_expired()){
                    redeemCouponData.postValue("Coupon is expired");
                }
                else if(couponResponse.getIs_used()){
                    redeemCouponData.postValue("Coupon had been used");
                }
                else {
                    redeemCouponData.postValue("Done");
                }
            }

            @Override
            public void onFailure(Call<RedeemCouponResponse> call, Throwable t) {

            }
        });

        return redeemCouponData;
    }

}
