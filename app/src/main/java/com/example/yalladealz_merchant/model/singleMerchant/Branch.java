
package com.example.yalladealz_merchant.model.singleMerchant;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Branch {

    @SerializedName("branchId")
    @Expose
    private String branchId;
    @SerializedName("_id")
    @Expose
    private Id id;

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

}
