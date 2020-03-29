package com.example.yalladealz_merchant.utils;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.ACCESS_FINE_LOCATION;

public class CommonMethod {
    public static boolean isNetworkAvailable(Context ctx) {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

//    public static void showAlert(String message, Activity context) {
//
//        AlertDialog alertDialog;
//        alertDialog = new AlertDialog.Builder(context)
//                .setMessage(message)
//                .setPositiveButton("Ok", (dialog, id) -> {
//
//                }).setIcon(R.drawable.ic_delete).show();
//
//        alertDialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(Color.WHITE);
//
//    }

    public static List<String> readJsonFile(Context context) {
        String stringJson;
        JSONArray citiesNames;
        List<String> cities = new ArrayList<>();

        try {
            InputStream is = context.getAssets().open("cities.json");

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            stringJson = new String(buffer, StandardCharsets.UTF_8);

            try {
                JSONObject jsonObject = new JSONObject(stringJson);
                citiesNames = jsonObject.names();
                for (int i = 0; i < citiesNames.length(); i++) {
                    cities.add(citiesNames.getString(i));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return cities;
    }

    public static void replaceFragment(FragmentManager manager, int containerId, Fragment fragment) {
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.replace(containerId, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public static void replaceFragmentWithBundle(FragmentManager manager, int containerId, Fragment fragment, String key, String data) {
        Bundle args = new Bundle();
        args.putString(key, data);
        fragment.setArguments(args);
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.replace(containerId, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public static void showToast(String message, Context context) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void requestLocationPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{ACCESS_FINE_LOCATION}, 1);
    }
}
