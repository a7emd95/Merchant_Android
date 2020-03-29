package com.example.yalladealz_merchant.viewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.yalladealz_merchant.repositories.BranchesRepository;
import com.example.yalladealz_merchant.responses.BranchesResponse;
import com.example.yalladealz_merchant.responses.CouponBranchResponse;

public class BranchesViewModel extends AndroidViewModel {

    private BranchesRepository branchesRepository;
    private LiveData<BranchesResponse> branchesResponseLiveData;
    private LiveData<CouponBranchResponse> couponBranchesResponseLiveData;

    public BranchesViewModel(@NonNull Application application) {
        super(application);
        branchesRepository = new BranchesRepository(application);
        branchesResponseLiveData = branchesRepository.getBranches();
        couponBranchesResponseLiveData = branchesRepository.getBranchesCoupones();

    }

    public void branch(String id){
        branchesRepository.branches(id);
    }

    public LiveData<BranchesResponse> getBranches(){
        return branchesResponseLiveData;
    }

    public void coupons(String id){
        branchesRepository.coupons(id);
    }

    public LiveData<CouponBranchResponse> getBranchesCoupones(){
        return couponBranchesResponseLiveData;
    }
}
