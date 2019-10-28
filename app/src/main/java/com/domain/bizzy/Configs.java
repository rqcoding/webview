package com.domain.bizzy;


import android.app.Application;

import com.parse.Parse;
import com.parse.ParseUser;

public class Configs extends Application {


    // IMPORTANT: Replace the red strings below with your own Application ID and Client Key of your app on back4app.com
    public static String PARSE_APP_ID = "iuo4I785ZcwQuW8htwL1iwqlD2AQJ6vpWxXrbCKf";
    public static String PARSE_CLIENT_KEY = "6iH54z0sggotZ8EvbQRfeJnzJiPXeCkOze5EQgtJ";
    //-----------------------------------------------------------------------------



    // IMPORTANT: REPLACE THE STRING BELOW WITH YOUR OWN WEBSITE PATH (IT'S WHERE YOU'LL UPLOAD ALL FILES OF THE website FOLDER)
    public static String WEBSITE_PATH = "http://www.fvimagination.com/bizzy/";








    /****** DO NOT EDIT THE CODE BELOW! *******/
    boolean isParseInitialized = false;

    public void onCreate() {
        super.onCreate();

        if (!isParseInitialized) {
            Parse.initialize(new Parse.Configuration.Builder(this)
                    .applicationId(String.valueOf(PARSE_APP_ID))
                    .clientKey(String.valueOf(PARSE_CLIENT_KEY))
                    .server("https://parseapi.back4app.com")
                    .build()
            );
            Parse.setLogLevel(Parse.LOG_LEVEL_VERBOSE);
            ParseUser.enableAutomaticUser();
            isParseInitialized = true;
        }

    }// end onCreate()


}// @end
