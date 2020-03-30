
package com.example.yalladealz_merchant.model.singleMerchant;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContactPerson_ {

    @SerializedName("location")
    @Expose
    private Location___ location;

    public Location___ getLocation() {
        return location;
    }

    public void setLocation(Location___ location) {
        this.location = location;
    }

}
