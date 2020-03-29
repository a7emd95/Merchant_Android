package com.example.yalladealz_merchant.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.content.SharedPreferences.Editor;

import com.example.yalladealz_merchant.responses.RedeemResponse;
import com.google.gson.Gson;

import java.lang.ref.WeakReference;

public class SharedUtils {

    public static void saveClass (Context context, String KEY, Object classs){
        WeakReference<Context> weakReference = new WeakReference<>(context);
        if(weakReference != null){
            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(weakReference.get());
            SharedPreferences.Editor editor = preferences.edit();
            Gson gson = new Gson();
            String data = gson.toJson(classs);
            editor.putString(KEY, data);
            editor.apply();
        }
    }

    public static Object getClass(Context context, String KEY){
        WeakReference<Context> weakReference = new WeakReference<>(context);
        if(weakReference != null){
            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(weakReference.get());
            Gson gson = new Gson();
            String data = sharedPreferences.getString(KEY, "");
            Object object = gson.fromJson(data, Object.class);
            return object;
        }
        return null;
    }


    public static void saveRedeem (Context context, RedeemResponse redeemResponse){
        WeakReference<Context> weakReference = new WeakReference<>(context);
        if(weakReference != null){
            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(weakReference.get());
            SharedPreferences.Editor editor = preferences.edit();
            Gson gson = new Gson();
            String data = gson.toJson(redeemResponse);
            editor.putString("REDEEM", data);
            editor.apply();
        }
    }

    public static RedeemResponse getRedeem(Context context){
        WeakReference<Context> weakReference = new WeakReference<>(context);
        if(weakReference != null){
            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(weakReference.get());
            Gson gson = new Gson();
            String data = sharedPreferences.getString("REDEEM", "");
            RedeemResponse response = gson.fromJson(data, RedeemResponse.class);
            return response;
        }
        return null;
    }


















    public static void save(Context context, String key, Object value) {

        WeakReference<Context> contextWeakReference = new WeakReference<Context>(context);
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(contextWeakReference.get());

        Editor editor = pref.edit();
        if (value instanceof Integer) {
            editor.putInt(key, (Integer) value);
        } else if (value instanceof Boolean) {
            editor.putBoolean(key, (Boolean) value);
        } else if (value instanceof String) {
            editor.putString(key, value.toString());
        }
        else if(value instanceof Float){
            editor.putFloat(key, (Float) value);
        }

        editor.commit();
    }

    public static Object getData(Context context, String key, Object defaultValue) {
        WeakReference<Context> contextWeakReference = new WeakReference<Context>(context);
        SharedPreferences pref = PreferenceManager
                .getDefaultSharedPreferences(contextWeakReference.get());

        if (defaultValue instanceof String) {
            return pref.getString(key, defaultValue.toString());
        } else if (defaultValue instanceof Integer) {
            return pref.getInt(key, (Integer) defaultValue);
        } else if (defaultValue instanceof Boolean) {
            return pref.getBoolean(key, (Boolean) defaultValue);
        }


        return defaultValue;

    }
}
