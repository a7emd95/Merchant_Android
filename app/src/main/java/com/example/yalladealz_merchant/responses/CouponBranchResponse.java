
package com.example.yalladealz_merchant.responses;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class CouponBranchResponse {

    @SerializedName("brances")
    private List<Brance> mBrances;
    @SerializedName("error")
    private Long mError;

    public List<Brance> getBrances() {
        return mBrances;
    }

    public void setBrances(List<Brance> brances) {
        mBrances = brances;
    }

    public Long getError() {
        return mError;
    }

    public void setError(Long error) {
        mError = error;
    }

    public class Brance {

        @SerializedName("branch_id")
        private Long mBranchId;
        @SerializedName("coupons")
        private List<Coupon> mCoupons;

        public Long getBranchId() {
            return mBranchId;
        }

        public void setBranchId(Long branchId) {
            mBranchId = branchId;
        }

        public List<Coupon> getCoupons() {
            return mCoupons;
        }

        public void setCoupons(List<Coupon> coupons) {
            mCoupons = coupons;
        }


        public class Coupon {

            @SerializedName("coupon_code")
            private String mCouponCode;
            @SerializedName("days")
            private String mDays;
            @SerializedName("end_time")
            private String mEndTime;
            @SerializedName("expire_date")
            private String mExpireDate;
            @SerializedName("id")
            private Long mId;
            @SerializedName("is_used")
            private Boolean mIsUsed;
            @SerializedName("item_id")
            private Long mItemId;
            @SerializedName("live_deal")
            private Boolean mLiveDeal;
            @SerializedName("start_date")
            private String mStartDate;
            @SerializedName("start_time")
            private String mStartTime;

            public String getCouponCode() {
                return mCouponCode;
            }

            public void setCouponCode(String couponCode) {
                mCouponCode = couponCode;
            }

            public String getDays() {
                return mDays;
            }

            public void setDays(String days) {
                mDays = days;
            }

            public String getEndTime() {
                return mEndTime;
            }

            public void setEndTime(String endTime) {
                mEndTime = endTime;
            }

            public String getExpireDate() {
                return mExpireDate;
            }

            public void setExpireDate(String expireDate) {
                mExpireDate = expireDate;
            }

            public Long getId() {
                return mId;
            }

            public void setId(Long id) {
                mId = id;
            }

            public Boolean getIsUsed() {
                return mIsUsed;
            }

            public void setIsUsed(Boolean isUsed) {
                mIsUsed = isUsed;
            }

            public Long getItemId() {
                return mItemId;
            }

            public void setItemId(Long itemId) {
                mItemId = itemId;
            }

            public Boolean getLiveDeal() {
                return mLiveDeal;
            }

            public void setLiveDeal(Boolean liveDeal) {
                mLiveDeal = liveDeal;
            }

            public String getStartDate() {
                return mStartDate;
            }

            public void setStartDate(String startDate) {
                mStartDate = startDate;
            }

            public String getStartTime() {
                return mStartTime;
            }

            public void setStartTime(String startTime) {
                mStartTime = startTime;
            }

        }

    }
}
