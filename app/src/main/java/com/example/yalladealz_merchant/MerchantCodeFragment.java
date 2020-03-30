package com.example.yalladealz_merchant;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.example.yalladealz_merchant.model.RedeemCoupon;
import com.example.yalladealz_merchant.responses.LoginResponse;
import com.example.yalladealz_merchant.responses.RedeemCouponResponse;
import com.example.yalladealz_merchant.utils.SharedUtils;
import com.example.yalladealz_merchant.viewModels.RedeemCouponViewModel;
//import com.example.yalladealz_merchant.viewModels.RedeemViewModel;
import com.google.android.material.snackbar.Snackbar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class MerchantCodeFragment extends Fragment {

    public static EditText codeEt;
    @BindView(R.id.clear)
    ImageView clear;
    @BindView(R.id.searchBtn)
    Button searchBtn;

   // private RedeemViewModel redeemViewModel;
    private RedeemCouponViewModel redeemCouponViewModel;

    public MerchantCodeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_merchant_code, container, false);
        ButterKnife.bind(this, view);

        codeEt = (EditText) view.findViewById(R.id.codeEt);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Enter code");
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back_form_code);

        setHasOptionsMenu(true);

       // redeemViewModel = ViewModelProviders.of(this).get(RedeemViewModel.class);
        redeemCouponViewModel = ViewModelProviders.of(this).get(RedeemCouponViewModel.class);

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.camera_code_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.camera) {

            getActivity().startActivity(new Intent(getContext(), CameraActivity.class));

        }
        else if(item.getItemId() == android.R.id.home){
            getActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
            Toast.makeText(getContext(), "Clicked", Toast.LENGTH_SHORT).show();
        }

        return true;
    }


    @OnClick({R.id.clear, R.id.searchBtn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.clear: {

                codeEt.setText("");

                break;
            }
            case R.id.searchBtn: {

                RedeemCoupon coupon = new RedeemCoupon();
                coupon.setCoupon(codeEt.getEditableText().toString().trim());

//                LoginResponse loginResponse = (LoginResponse) SharedUtils.getClass(getContext(), "user");
//                coupon.setLogin_id(loginResponse.getLoginId());
//                coupon.setBranch_id(loginResponse.getBranchId());

//                redeemViewModel.useRedeem(coupon).observe(this, new Observer<String>() {
//                    @Override
//                    public void onChanged(String s) {
//
//                        Snackbar.make(view.findViewById(R.id.merchant_frame), s, Snackbar.LENGTH_SHORT).show();
//                    }
//                });
                redeemCouponViewModel.redeemLiveData.observe(this, new Observer<RedeemCouponResponse>() {
                    @Override
                    public void onChanged(RedeemCouponResponse redeemCouponResponse) {
                        Snackbar.make(view.findViewById(R.id.merchant_frame), redeemCouponResponse.getMessage(), Snackbar.LENGTH_SHORT).show();
                    }
                });

                break;
            }
        }
    }
}
