package com.example.yalladealz_merchant.remote;

import com.example.yalladealz_merchant.model.RedeemCoupon;
import com.example.yalladealz_merchant.model.branches.MerchantsBranches;
import com.example.yalladealz_merchant.model.report.ReportResponse;
import com.example.yalladealz_merchant.model.singleMerchant.SingleMerchant;
import com.example.yalladealz_merchant.responses.BranchesResponse;
import com.example.yalladealz_merchant.responses.CouponBranchResponse;
import com.example.yalladealz_merchant.responses.RedeemCouponResponse;

import com.example.yalladealz_merchant.responses.LoginResponse;
import com.example.yalladealz_merchant.responses.RedeemResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIInterface {

    @FormUrlEncoded
    @POST("/merchant-api/get-redeem-coupons")
    Call<RedeemResponse> getRedeem(@Field("branch_id") int branch_id);

    @POST("/api/merchants/login")
    @FormUrlEncoded
    Call<LoginResponse> login(@Field("email") String email, @Field("password") String password);
//    //old redeem coupon api
//    @POST("/merchant-api/redeem-coupon")
//    Call<RedeemCouponResponse> useRedeem(@Body RedeemCoupon coupon);

    //new redeem coupon api
    @POST("api/coupons/redeem")
    Call<RedeemCouponResponse> getMessageRedeemResponse();

    @GET("/merchants/{id}/branches")
    Call<BranchesResponse> getBranches(@Path("id") String id);

    @GET("/merchants/{id}/branches/coupons")
    Call<CouponBranchResponse> getCouponsForBranches(@Path("id") String id);

    // coupons report update
    @GET("merchants/coupons/report")
    Call<ReportResponse> getCouponReport(@Header("authorization") String authorization,@Query("month") String month,@Query("year") String year);

    // get merchant details
    @GET("merchants/{id}")
    Call<SingleMerchant> getMerchantDetails(@Header("authorization") String authorization, @Path("id") String id);

    //@Header("authorization") String authorization

    //get Merchant Branches api
    @GET("/merchants/{id}/branches")
    Call<MerchantsBranches> getMerchantBranches(@Header("authorization") String authorization, @Path("id") String id);





}
