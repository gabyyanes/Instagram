package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        // Register your parse models
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("BScWaWhZ44K3V3ZKRzMK9MMmYiUOwi2vhH6amhi3")
                .clientKey("wN4VNIzYPoZMgmRHrggWhbAe19lzhzzB5BQIYcqM")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
