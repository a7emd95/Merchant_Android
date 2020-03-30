
package com.example.yalladealz_merchant.model.singleMerchant;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Id {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("socialMediaLinks")
    @Expose
    private SocialMediaLinks_ socialMediaLinks;
    @SerializedName("location")
    @Expose
    private Location__ location;
    @SerializedName("contactPerson")
    @Expose
    private ContactPerson_ contactPerson;
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
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("branches")
    @Expose
    private List<Object> branches = null;
    @SerializedName("coupons")
    @Expose
    private List<Object> coupons = null;
    @SerializedName("parentId")
    @Expose
    private String parentId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SocialMediaLinks_ getSocialMediaLinks() {
        return socialMediaLinks;
    }

    public void setSocialMediaLinks(SocialMediaLinks_ socialMediaLinks) {
        this.socialMediaLinks = socialMediaLinks;
    }

    public Location__ getLocation() {
        return location;
    }

    public void setLocation(Location__ location) {
        this.location = location;
    }

    public ContactPerson_ getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(ContactPerson_ contactPerson) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Object> getBranches() {
        return branches;
    }

    public void setBranches(List<Object> branches) {
        this.branches = branches;
    }

    public List<Object> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Object> coupons) {
        this.coupons = coupons;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

}
