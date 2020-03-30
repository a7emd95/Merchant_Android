package com.example.yalladealz_merchant.repositories;

import android.app.Application;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.yalladealz_merchant.model.branches.MerchantsBranches;
import com.example.yalladealz_merchant.model.singleMerchant.SingleMerchant;
import com.example.yalladealz_merchant.remote.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BranchesRepository {

    private MutableLiveData<MerchantsBranches> branches = new MutableLiveData<>();
    private MutableLiveData<SingleMerchant> couponBranches = new MutableLiveData<>();
    private Application application;
    String Key = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1ZTdmYTM5MWZkNTJjODFhMzAyNTQ5ZDciLCJpYXQiOjE1ODU0MzU5MTAsImV4cCI6MTU4NjI5OTkxMH0.aj8pU_3RphsCS8k-J-FpRwBF_VV75-9Vpc6lxGa9cQQ";

    public BranchesRepository(Application application) {
        this.application = application;
    }

    public void branches(String id){
        Call<MerchantsBranches> call = RetrofitClient.getClient().getMerchantBranches(Key,id);
        call.enqueue(new Callback<MerchantsBranches>() {
            @Override
            public void onResponse(Call<MerchantsBranches> call, Response<MerchantsBranches> response) {

                if(response.body() != null){
                    branches.postValue(response.body());

                }
            }

            @Override
            public void onFailure(Call<MerchantsBranches> call, Throwable t) {

            }
        });

     /*   call.enqueue(new Callback<BranchesResponse>() {
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
        });*/
    }

    public LiveData<MerchantsBranches> getBranches(){
        return branches;
    }

    public void coupons(String id){
        Call<SingleMerchant> call = RetrofitClient.getClient().getMerchantDetails(Key,id);
        call.enqueue(new Callback<SingleMerchant>() {
            @Override
            public void onResponse(Call<SingleMerchant> call, Response<SingleMerchant> response) {
                if(response.isSuccessful()){
                    if(response.body() != null) {
                        couponBranches.postValue(response.body());
                    }
                }
            }

            @Override
            public void onFailure(Call<SingleMerchant> call, Throwable t) {
                Toast.makeText(application, t.getMessage()+" ", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public LiveData<SingleMerchant> getBranchesCoupones(){
        return couponBranches;
    }

}
