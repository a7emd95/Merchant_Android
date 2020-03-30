package com.example.yalladealz_merchant.viewModels;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.yalladealz_merchant.interfaces.RedeemCouponFace;
import com.example.yalladealz_merchant.repositories.RedeemCouponRepository;
import com.example.yalladealz_merchant.responses.RedeemCouponResponse;

public class RedeemCouponViewModel extends ViewModel implements RedeemCouponFace {
    MutableLiveData<RedeemCouponResponse> redeemMutableLiveData = new MutableLiveData<>();
    public LiveData<RedeemCouponResponse>  redeemLiveData = redeemMutableLiveData;
    RedeemCouponRepository redeemCouponRepository;

    public RedeemCouponViewModel() {
        redeemCouponRepository = new RedeemCouponRepository(this);
    }

    public void getCouponRedeem() {
        redeemCouponRepository.getCouponRedeem();
    }

    @Override
    public void onSucceed(RedeemCouponResponse redeemCouponResponse) {

        redeemMutableLiveData.postValue(redeemCouponResponse);
    }

    @Override
    public void onFailed(Throwable throwable) {
        Log.d("ahmed", "Error on Failure getCouponRedeem");
    }
}
