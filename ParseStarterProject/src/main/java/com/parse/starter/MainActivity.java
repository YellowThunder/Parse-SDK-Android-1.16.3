/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseUser;


public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Parse.enableLocalDatastore(this);

    Parse.initialize(new Parse.Configuration(this)
            .applicationId("VsgIsfvBYTOOB9MLW8oefn4IaNMTAmSQ9soCARxd")
            .clientKey("W2MwXeyW8lxnrSf9jcm0mkWV6DuT5MajZ1Q5pNr6")
            .server("https://parseapi.back4app.com/parse/")
            .build()
    );

    ParseUser.enableRevocableSessionInBackground();

    ParseAnalytics.trackAppOpenedInBackground(getIntent());
  }
}
