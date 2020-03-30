package com.example.yalladealz_merchant.interfaces;

import com.example.yalladealz_merchant.responses.RedeemCouponResponse;

public interface RedeemCouponFace {
    void onSucceed(RedeemCouponResponse redeemCouponResponse);

    void onFailed(Throwable throwable);

}
