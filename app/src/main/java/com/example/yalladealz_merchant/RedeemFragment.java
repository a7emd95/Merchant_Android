package com.example.yalladealz_merchant;

import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.yalladealz_merchant.responses.BranchesResponse;
import com.example.yalladealz_merchant.responses.CouponBranchResponse;
import com.example.yalladealz_merchant.responses.RedeemCouponResponse;
import com.example.yalladealz_merchant.utils.CommonMethod;
import com.example.yalladealz_merchant.viewModels.BranchesViewModel;
import com.example.yalladealz_merchant.viewModels.RedeemCouponViewModel;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Ordering;
import com.ramijemli.percentagechartview.PercentageChartView;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

import static android.graphics.Color.rgb;

public class RedeemFragment extends Fragment {

    @BindView(R.id.view_id)
    PercentageChartView viewId;
    @BindView(R.id.txtRedeemed)
    TextView txtRedeemed;
    @BindView(R.id.txtUnits)
    TextView txtUnits;
    @BindView(R.id.txtCampaign)
    TextView txtCampaign;
    @BindView(R.id.txtPayment)
    TextView txtPayment;
    @BindView(R.id.btnRedeem)
    Button btnRedeem;
    @BindView(R.id.chart)
    PieChartView chart;

    List<SliceValue> pieData = new ArrayList<>();
    @BindView(R.id.branchName1)
    TextView branchName1;
    @BindView(R.id.branchRedeemed1)
    TextView branchRedeemed1;
    @BindView(R.id.branch1)
    LinearLayout branch1;
    @BindView(R.id.branchName2)
    TextView branchName2;
    @BindView(R.id.branchRedeemed2)
    TextView branchRedeemed2;
    @BindView(R.id.branch2)
    LinearLayout branch2;
    @BindView(R.id.branchName3)
    TextView branchName3;
    @BindView(R.id.branchRedeemed3)
    TextView branchRedeemed3;
    @BindView(R.id.branch3)
    LinearLayout branch3;
    @BindView(R.id.branchName4)
    TextView branchName4;
    @BindView(R.id.branchRedeemed4)
    TextView branchRedeemed4;
    @BindView(R.id.branch4)
    LinearLayout branch4;
    @BindView(R.id.branchName5)
    TextView branchName5;
    @BindView(R.id.branchRedeemed5)
    TextView branchRedeemed5;
    @BindView(R.id.branch5)
    LinearLayout branch5;


    // private RedeemViewModel model;
    private RedeemCouponViewModel redeemModel;
    private BranchesViewModel bModel;
    private List<BranchesResponse.Brance> branches;

    List<String> sortedNames = Lists.newArrayList();
    List<Integer> sortedData = Lists.newArrayList();
    Multimap<Integer, String> multiMap;
    List<Pair<Integer, String>> pairList = new ArrayList<>();


    public RedeemFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_redeem, container, false);
        ButterKnife.bind(this, v);
        //  model = ViewModelProviders.of(this).get(RedeemViewModel.class);
        redeemModel = ViewModelProviders.of(this).get(RedeemCouponViewModel.class);
        bModel = ViewModelProviders.of(this).get(BranchesViewModel.class);


        //model.redeemResponse(6);

//        model.getData().observe(this, new Observer<RedeemResponse>() {
//            @Override
//            public void onChanged(RedeemResponse redeemResponse) {
//
//                //  loadData(redeemResponse);
//            }
//        });
        redeemModel.getCouponRedeem();
        redeemModel.redeemLiveData.observe(this, new Observer<RedeemCouponResponse>() {
            @Override
            public void onChanged(RedeemCouponResponse redeemCouponResponse) {
                //Coupon response is created
               // loadData(redeemCouponResponse);
            }
        });

        bModel.branch("6");
        bModel.coupons("6");
        bModel.getBranches().observe(this, new Observer<BranchesResponse>() {
            @Override
            public void onChanged(BranchesResponse branchesRespons) {
                branches = new ArrayList<>();
                branches.addAll(branchesRespons.getBrances());
                multiMap = LinkedListMultimap.create();

                bModel.getBranchesCoupones().observe(getActivity(), new Observer<CouponBranchResponse>() {
                    @Override
                    public void onChanged(CouponBranchResponse couponBranchResponse) {

                        List<CouponBranchResponse.Brance> CouponBranch = new ArrayList<>();
                        CouponBranch.addAll(couponBranchResponse.getBrances());

                        for (CouponBranchResponse.Brance brance : CouponBranch) {
                            String name = new String();

                            for (int n = 0; n < branches.size(); n++) {
                                if (brance.getBranchId() == branches.get(n).getBranchId()) {
                                    name = branches.get(n).getBranchName();
                                }

                            }

                            int i = 0;
                            for (CouponBranchResponse.Brance.Coupon coupon : brance.getCoupons()) {
                                if (coupon.getIsUsed()) {
                                    ++i;
                                }
                            }
                            pairList.add(new Pair<>(i, name));

                        }

                        chatView();
                    }
                });
            }
        });

        return v;
    }

    @OnClick(R.id.btnRedeem)
    public void onViewClicked() {

        CommonMethod.replaceFragment(getFragmentManager(), R.id.frame, new MerchantCodeFragment());

    }

    private void loadData(RedeemCouponResponse redeemResponse) {
        if (redeemResponse != null) {
            Toast.makeText(getContext(), redeemResponse.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void chatView() {

        Collections.sort(pairList, new Ordering<Pair<Integer, String>>() {
            @Override
            public int compare(@NullableDecl Pair<Integer, String> left, @NullableDecl Pair<Integer, String> right) {
                if (left.first > right.first) {
                    return -1;
                } else if (left.first == right.first) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });

        List<Integer> colorList = new ArrayList<>();
        colorList.add(rgb(255, 0, 0));
        colorList.add(rgb(0, 0, 255));
        colorList.add(rgb(0, 128, 0));
        colorList.add(rgb(255, 255, 0));
        colorList.add(rgb(0, 128, 128));

        int item = 0;

        if (pieData != null) {
            pieData.clear();
        }
        for (int in = 0; in < pairList.size(); in++) {
            if (pairList.get(in).first > 0) {
                if (item >= 5) {
                    break;
                }
                switch (item) {
                    case 0:
                        branch1.setVisibility(View.VISIBLE);
                        branchName1.setText(pairList.get(item).second);
                        branchRedeemed1.setText(pairList.get(item).first + " Coupones");
                        break;
                    case 1:
                        branch2.setVisibility(View.VISIBLE);
                        branchName2.setText(pairList.get(item).second);
                        branchRedeemed2.setText(pairList.get(item).first + " Coupones");
                        break;
                    case 2:
                        branch3.setVisibility(View.VISIBLE);
                        branchName3.setText(pairList.get(item).second);
                        branchRedeemed3.setText(pairList.get(item).first + " Coupones");
                        break;
                    case 3:
                        branch4.setVisibility(View.VISIBLE);
                        branchName4.setText(pairList.get(item).second);
                        branchRedeemed4.setText(pairList.get(item).first + " Coupones");
                        break;
                    case 4:
                        branch5.setVisibility(View.VISIBLE);
                        branchName5.setText(pairList.get(item).second);
                        branchRedeemed5.setText(pairList.get(item).first + " Coupones");
                        break;
                }


                pieData.add(new SliceValue(pairList.get(in).first, colorList.get(item)
                ).setLabel(pairList.get(in).second));

                ++item;
            }

        }

        PieChartData pieChartData = new PieChartData(pieData);
        pieChartData.setHasLabels(true).setValueLabelTextSize(14);
        pieChartData.setHasCenterCircle(true).setCenterText1("Redeemed").setCenterText1FontSize(18)
                .setCenterText1Color(R.color.colorPrimary);
        chart.setPieChartData(pieChartData);

    }
}
