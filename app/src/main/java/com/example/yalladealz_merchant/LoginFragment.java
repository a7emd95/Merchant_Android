package com.example.yalladealz_merchant;


import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.yalladealz_merchant.utils.ValidationUtil;
import com.example.yalladealz_merchant.viewModels.LoginModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    @BindView(R.id.input_email)
    EditText inputEmail;
    @BindView(R.id.input_pass)
    EditText inputPass;
    Unbinder unbinder;
    private LoginModel loginModel;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginModel = ViewModelProviders.of(this).get(LoginModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        unbinder = ButterKnife.bind(this, view);

    }

    @OnClick(R.id.btn_sign_in)
    public void onSignIn() {
        String email = inputEmail.getText().toString();
        String password = inputPass.getText().toString();

        if (TextUtils.isEmpty(email) || !ValidationUtil.validEmail(email)) {
            inputEmail.setError("Email is not valid or empty.");
            inputEmail.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(email) || !ValidationUtil.validEmail(email)) {
            inputPass.setError("Password is not valid or empty.");
            inputPass.requestFocus();
            return;
        }

        loginModel.login(email, password, getFragmentManager());


    }

    @Override
    public void onDestroy() {
        unbinder.unbind();
        super.onDestroy();
    }
}
