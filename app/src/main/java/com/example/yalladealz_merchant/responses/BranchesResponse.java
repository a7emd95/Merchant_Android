
package com.example.yalladealz_merchant.responses;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class BranchesResponse {

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

        @SerializedName("branch_address")
        private String mBranchAddress;
        @SerializedName("branch_city")
        private String mBranchCity;
        @SerializedName("branch_id")
        private Long mBranchId;
        @SerializedName("branch_name")
        private String mBranchName;
        @SerializedName("branch_status")
        private Boolean mBranchStatus;
        @SerializedName("location_latitude")
        private String mLocationLatitude;
        @SerializedName("location_longitude")
        private String mLocationLongitude;
        @SerializedName("main_branch")
        private Boolean mMainBranch;
        @SerializedName("merchant_id")
        private Long mMerchantId;

        public String getBranchAddress() {
            return mBranchAddress;
        }

        public void setBranchAddress(String branchAddress) {
            mBranchAddress = branchAddress;
        }

        public String getBranchCity() {
            return mBranchCity;
        }

        public void setBranchCity(String branchCity) {
            mBranchCity = branchCity;
        }

        public Long getBranchId() {
            return mBranchId;
        }

        public void setBranchId(Long branchId) {
            mBranchId = branchId;
        }

        public String getBranchName() {
            return mBranchName;
        }

        public void setBranchName(String branchName) {
            mBranchName = branchName;
        }

        public Boolean getBranchStatus() {
            return mBranchStatus;
        }

        public void setBranchStatus(Boolean branchStatus) {
            mBranchStatus = branchStatus;
        }

        public String getLocationLatitude() {
            return mLocationLatitude;
        }

        public void setLocationLatitude(String locationLatitude) {
            mLocationLatitude = locationLatitude;
        }

        public String getLocationLongitude() {
            return mLocationLongitude;
        }

        public void setLocationLongitude(String locationLongitude) {
            mLocationLongitude = locationLongitude;
        }

        public Boolean getMainBranch() {
            return mMainBranch;
        }

        public void setMainBranch(Boolean mainBranch) {
            mMainBranch = mainBranch;
        }

        public Long getMerchantId() {
            return mMerchantId;
        }

        public void setMerchantId(Long merchantId) {
            mMerchantId = merchantId;
        }

    }

}
