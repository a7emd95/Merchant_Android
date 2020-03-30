
package com.example.yalladealz_merchant.model.singleMerchant;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContactPerson {

    @SerializedName("location")
    @Expose
    private Location_ location;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("jobTitle")
    @Expose
    private String jobTitle;
    @SerializedName("payOutBy")
    @Expose
    private String payOutBy;
    @SerializedName("email")
    @Expose
    private String email;

    public Location_ getLocation() {
        return location;
    }

    public void setLocation(Location_ location) {
        this.location = location;
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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPayOutBy() {
        return payOutBy;
    }

    public void setPayOutBy(String payOutBy) {
        this.payOutBy = payOutBy;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
