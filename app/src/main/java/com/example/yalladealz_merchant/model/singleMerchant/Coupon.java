
package com.example.yalladealz_merchant.model.singleMerchant;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coupon {

    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("couponId")
    @Expose
    private String couponId;
    @SerializedName("month")
    @Expose
    private Integer month;
    @SerializedName("date")
    @Expose
    private String date;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
