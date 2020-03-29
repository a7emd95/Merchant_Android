package com.example.yalladealz_merchant.viewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AndroidViewModel;

import com.example.yalladealz_merchant.repositories.LoginRepository;

public class LoginModel extends AndroidViewModel {
    private LoginRepository repository;

    public LoginModel(@NonNull Application application) {
        super(application);
        repository = new LoginRepository(application);
    }

    public void login(String email, String password, FragmentManager manager) {
        repository.login(email, password, manager);

    }
}
