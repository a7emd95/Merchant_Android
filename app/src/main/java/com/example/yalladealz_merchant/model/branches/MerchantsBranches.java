
package com.example.yalladealz_merchant.model.branches;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MerchantsBranches {

    @SerializedName("length")
    @Expose
    private Integer length;
    @SerializedName("branches")
    @Expose
    private List<Branch> branches = null;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

}
