package com.example.yalladealz_merchant.responses;

import com.google.gson.annotations.SerializedName;

public class RedeemCouponResponse {

//    private Boolean is_coupon;
//    private Boolean is_expired;
//    private Boolean is_used;
    @SerializedName("message")
    private String message;

    public String getMessage() {
        return message;
    }


//    public Boolean getIs_coupon() {
//        return is_coupon;
//    }
//
//    public Boolean getIs_expired() {
//        return is_expired;
//    }
//
//    public Boolean getIs_used() {
//        return is_used;
//    }
}
