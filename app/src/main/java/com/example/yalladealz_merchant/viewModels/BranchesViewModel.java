package com.example.yalladealz_merchant.viewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.yalladealz_merchant.model.branches.MerchantsBranches;
import com.example.yalladealz_merchant.model.singleMerchant.SingleMerchant;
import com.example.yalladealz_merchant.repositories.BranchesRepository;

public class BranchesViewModel extends AndroidViewModel {

    private BranchesRepository branchesRepository;
    private LiveData<MerchantsBranches> branchesResponseLiveData;
    private LiveData<SingleMerchant> couponBranchesResponseLiveData;

    public BranchesViewModel(@NonNull Application application) {
        super(application);
        branchesRepository = new BranchesRepository(application);
        branchesResponseLiveData = branchesRepository.getBranches();
        couponBranchesResponseLiveData = branchesRepository.getBranchesCoupones();

    }

    public void branch(String id){
        branchesRepository.branches(id);
    }

    public LiveData<MerchantsBranches> getBranches(){
        return branchesResponseLiveData;
    }

    public void coupons(String id){
        branchesRepository.coupons(id);
    }

    public LiveData<SingleMerchant> getBranchesCoupones(){
        return couponBranchesResponseLiveData;
    }
}
