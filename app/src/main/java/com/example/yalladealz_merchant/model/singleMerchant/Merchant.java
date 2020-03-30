
package com.example.yalladealz_merchant.model.singleMerchant;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Merchant {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("socialMediaLinks")
    @Expose
    private SocialMediaLinks socialMediaLinks;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("contactPerson")
    @Expose
    private ContactPerson contactPerson;
    @SerializedName("website")
    @Expose
    private String website;
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
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("accountType")
    @Expose
    private String accountType;
    @SerializedName("branches")
    @Expose
    private List<Branch> branches = null;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("totalRedeedmedCouponsRevenue")
    @Expose
    private Integer totalRedeedmedCouponsRevenue;
    @SerializedName("coupons")
    @Expose
    private List<Coupon_> coupons = null;
    @SerializedName("balance")
    @Expose
    private List<Balance_> balance = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SocialMediaLinks getSocialMediaLinks() {
        return socialMediaLinks;
    }

    public void setSocialMediaLinks(SocialMediaLinks socialMediaLinks) {
        this.socialMediaLinks = socialMediaLinks;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ContactPerson getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(ContactPerson contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public Integer getTotalRedeedmedCouponsRevenue() {
        return totalRedeedmedCouponsRevenue;
    }

    public void setTotalRedeedmedCouponsRevenue(Integer totalRedeedmedCouponsRevenue) {
        this.totalRedeedmedCouponsRevenue = totalRedeedmedCouponsRevenue;
    }

    public List<Coupon_> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Coupon_> coupons) {
        this.coupons = coupons;
    }

    public List<Balance_> getBalance() {
        return balance;
    }

    public void setBalance(List<Balance_> balance) {
        this.balance = balance;
    }

}
