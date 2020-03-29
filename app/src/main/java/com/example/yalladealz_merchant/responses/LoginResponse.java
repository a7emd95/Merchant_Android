package com.example.yalladealz_merchant.responses;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {

    @SerializedName("login_id")
    private String loginId;

    @SerializedName("branch_id")
    private String branchId;

    @SerializedName("status")
    private boolean status;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return
                "LoginResponse{" +
                        "login_id = '" + loginId + '\'' +
                        ",branch_id = '" + branchId + '\'' +
                        ",status = '" + status + '\'' +
                        "}";
    }
}