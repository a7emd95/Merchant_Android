package com.example.yalladealz_merchant.responses;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {

//    @SerializedName("login_id")
//    private String loginId;
//
//    @SerializedName("branch_id")
//    private String branchId;
//
//    @SerializedName("status")
//    private boolean status;

    @SerializedName("token")
    private String token;

    public String getToken() {
        return token;
    }

//    public void setToken(String token) {
//        this.token = token;
//    }
//
//    public String getLoginId() {
//        return loginId;
//    }
//
//    public void setLoginId(String loginId) {
//        this.loginId = loginId;
//    }
//
//    public String getBranchId() {
//        return branchId;
//    }
//
//    public void setBranchId(String branchId) {
//        this.branchId = branchId;
//    }
//
//    public boolean isStatus() {
//        return status;
//    }
//
//    public void setStatus(boolean status) {
//        this.status = status;
//    }

    @Override
    public String toString() {
        return
                "LoginResponse{" +
                        "token = '" + token + '\'' +
                        "}";
    }
}