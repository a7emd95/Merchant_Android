package com.example.yalladealz_merchant.viewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.yalladealz_merchant.model.RedeemCoupon;
import com.example.yalladealz_merchant.repositories.RedeemRepository;
import com.example.yalladealz_merchant.responses.RedeemCouponResponse;
import com.example.yalladealz_merchant.responses.RedeemResponse;

public class RedeemViewModel extends AndroidViewModel {

    private Application application;
    private RedeemRepository redeemRepository;
    private RedeemResponse redeemResponse;
    private LiveData<RedeemResponse> redeemResponseLiveData;
    private LiveData<String> errorLiveData;

    public RedeemViewModel(@NonNull Application application) {
        super(application);
        this.application = application;
        redeemRepository = new RedeemRepository(application);

        redeemResponseLiveData = redeemRepository.getData();
        errorLiveData = redeemRepository.getError();

    }

    public void redeemResponse(int id) {
        redeemRepository.getRedeem(id);
    }

    public LiveData<RedeemResponse> getData(){
        return redeemResponseLiveData;
    }
    public LiveData<String> getError(){
        return errorLiveData;
    }

    public LiveData<String> useRedeem(RedeemCoupon coupon){
        return redeemRepository.useRedeem(coupon);
    }
}
