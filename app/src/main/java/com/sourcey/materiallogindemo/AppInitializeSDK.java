package com.sourcey.materiallogindemo;

import com.kii.cloud.storage.*;
import android.app.Application;
import com.sourcey.materiallogindemo.Utils.AppConstants;

/**
 * Created by GuillermoArturo on 02/04/2016.
 */
public class AppInitializeSDK extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        // Configures the SDK to use the specified Application ID and Key.
        // It must be called prior to any API calls.
        // It is ok to call this method multiple times
        Kii.initialize(getApplicationContext(), "\n" +
                AppConstants.APP_ID, "\n" +
                AppConstants.APP_KEY, AppConstants.APP_SITE, false);
    }
}
