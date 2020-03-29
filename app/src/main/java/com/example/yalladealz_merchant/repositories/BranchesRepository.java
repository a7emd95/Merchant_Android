package com.example.yalladealz_merchant.repositories;

import android.app.Application;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.yalladealz_merchant.remote.RetrofitClient;
import com.example.yalladealz_merchant.responses.BranchesResponse;
import com.example.yalladealz_merchant.responses.CouponBranchResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BranchesRepository {

    private MutableLiveData<BranchesResponse> branches = new MutableLiveData<>();
    private MutableLiveData<CouponBranchResponse> couponBranches = new MutableLiveData<>();
    private Application application;

    public BranchesRepository(Application application) {
        this.application = application;
    }

    public void branches(String id){
        Call<BranchesResponse> call = RetrofitClient.getClient().getBranches(id);
        call.enqueue(new Callback<BranchesResponse>() {
            @Override
            public void onResponse(Call<BranchesResponse> call, Response<BranchesResponse> response) {
                if(response.isSuccessful()){
                    if(response.body() != null){
                        branches.postValue(response.body());

                    }
                }
            }

            @Override
            public void onFailure(Call<BranchesResponse> call, Throwable t) {

            }
        });
    }

    public LiveData<BranchesResponse> getBranches(){
        return branches;
    }

    public void coupons(String id){
        Call<CouponBranchResponse> call = RetrofitClient.getClient().getCouponsForBranches(id);
        call.enqueue(new Callback<CouponBranchResponse>() {
            @Override
            public void onResponse(Call<CouponBranchResponse> call, Response<CouponBranchResponse> response) {
                if(response.isSuccessful()){
                    if(response.body() != null) {
                        couponBranches.postValue(response.body());
                    }
                }
            }

            @Override
            public void onFailure(Call<CouponBranchResponse> call, Throwable t) {
                Toast.makeText(application, t.getMessage()+" ", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public LiveData<CouponBranchResponse> getBranchesCoupones(){
        return couponBranches;
    }

}
