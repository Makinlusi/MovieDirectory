package com.abdimajeed.moviedirectory.moviedirectory.Util;

import android.app.Activity;
import android.content.SharedPreferences;


/**
 * Created by Majeed Akinlusi on 4/23/20.
 */
public class Prefs {
    SharedPreferences sharedPreferences;

    public Prefs(Activity activity) {
        sharedPreferences = activity.getPreferences(activity.MODE_PRIVATE);

    }

    public void setSearch(String search) {
        sharedPreferences.edit().putString("search", search).commit();
    }

    public String getSearch() {
        return sharedPreferences.getString("search", "Batman");
    }
}
