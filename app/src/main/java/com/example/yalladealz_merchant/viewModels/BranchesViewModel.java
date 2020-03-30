package com.example.yalladealz_merchant.viewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.yalladealz_merchant.model.branches.MerchantsBranches;
import com.example.yalladealz_merchant.model.report.ReportResponse;
import com.example.yalladealz_merchant.model.singleMerchant.SingleMerchant;
import com.example.yalladealz_merchant.repositories.BranchesRepository;

import retrofit2.http.Query;

public class BranchesViewModel extends AndroidViewModel {

    private BranchesRepository branchesRepository;
    private LiveData<MerchantsBranches> branchesResponseLiveData;
    private LiveData<SingleMerchant> couponBranchesResponseLiveData;
    private LiveData<ReportResponse> couponReportLiveData;

    public BranchesViewModel(@NonNull Application application) {
        super(application);
        branchesRepository = new BranchesRepository(application);
        branchesResponseLiveData = branchesRepository.getBranches();
        couponBranchesResponseLiveData = branchesRepository.getBranchesCoupones();
        couponReportLiveData = branchesRepository.getCouponsReport();

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

    public void getCouponsReport(String month, String year){
        branchesRepository.couponsReport(month, year);
    }

    public LiveData<ReportResponse> couponesReport(){
        return couponReportLiveData;
    }


}
