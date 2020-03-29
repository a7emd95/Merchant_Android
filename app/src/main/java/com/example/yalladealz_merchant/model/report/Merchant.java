
package com.example.yalladealz_merchant.model.report;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Merchant {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("totalRedeedmedCoupons")
    @Expose
    private Integer totalRedeedmedCoupons;
    @SerializedName("totalRedeedmedCouponsRevenue")
    @Expose
    private Integer totalRedeedmedCouponsRevenue;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTotalRedeedmedCoupons() {
        return totalRedeedmedCoupons;
    }

    public void setTotalRedeedmedCoupons(Integer totalRedeedmedCoupons) {
        this.totalRedeedmedCoupons = totalRedeedmedCoupons;
    }

    public Integer getTotalRedeedmedCouponsRevenue() {
        return totalRedeedmedCouponsRevenue;
    }

    public void setTotalRedeedmedCouponsRevenue(Integer totalRedeedmedCouponsRevenue) {
        this.totalRedeedmedCouponsRevenue = totalRedeedmedCouponsRevenue;
    }

}