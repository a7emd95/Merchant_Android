
package com.example.yalladealz_merchant.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;
public class RedeemResponse {

    @SerializedName("coupons")
    private List<Object> mCoupons;
    @SerializedName("total_amount")
    private Long mTotalAmount;
    @SerializedName("total_coupons")
    private Long mTotalCoupons;

    public List<Object> getCoupons() {
        return mCoupons;
    }

    public void setCoupons(List<Object> coupons) {
        mCoupons = coupons;
    }

    public Long getTotalAmount() {
        return mTotalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        mTotalAmount = totalAmount;
    }

    public Long getTotalCoupons() {
        return mTotalCoupons;
    }

    public void setTotalCoupons(Long totalCoupons) {
        mTotalCoupons = totalCoupons;
    }

    @Override
    public String toString() {
        return "RedeemResponse{" +
                "mCoupons=" + mCoupons +
                ", mTotalAmount=" + mTotalAmount +
                ", mTotalCoupons=" + mTotalCoupons +
                '}';
    }
}
