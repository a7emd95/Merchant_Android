
package com.example.yalladealz_merchant.model.report;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Branch {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("cover")
    @Expose
    private String cover;
    @SerializedName("totalRedeedmedCoupons")
    @Expose
    private Integer totalRedeedmedCoupons;
    @SerializedName("totalRedeedmedCouponsRevenue")
    @Expose
    private Integer totalRedeedmedCouponsRevenue;
    @SerializedName("isArchived")
    @Expose
    private Boolean isArchived;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("coupons")
    @Expose
    private List<Coupon> coupons = null;
    @SerializedName("balance")
    @Expose
    private Balance_ balance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
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

    public Boolean getIsArchived() {
        return isArchived;
    }

    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Coupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Coupon> coupons) {
        this.coupons = coupons;
    }

    public Balance_ getBalance() {
        return balance;
    }

    public void setBalance(Balance_ balance) {
        this.balance = balance;
    }

}
