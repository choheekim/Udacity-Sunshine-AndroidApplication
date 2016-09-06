package com.example.chohee.sunshine.app;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Chohee on 9/5/16.
 */
public class SettingsActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }
}
