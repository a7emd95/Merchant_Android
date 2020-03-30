
package com.example.yalladealz_merchant.model.singleMerchant;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Balance {

    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("revenue")
    @Expose
    private Integer revenue;
    @SerializedName("restored")
    @Expose
    private Boolean restored;
    @SerializedName("month")
    @Expose
    private Integer month;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getRevenue() {
        return revenue;
    }

    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    public Boolean getRestored() {
        return restored;
    }

    public void setRestored(Boolean restored) {
        this.restored = restored;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

}
