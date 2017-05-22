/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.multiwindowplayground.activities;

import android.os.Bundle;
import android.view.View;

import com.android.multiwindowplayground.R;

/**
 * This activity is the most basic, simeple use case and is to be launched without any special
 * flags
 * or settings.
 *
 * 这个活动是最基本的，简单的用例，是没有任何特殊标志或设置的情况下启动的。
 *
 * @see com.android.multiwindowplayground.MainActivity#onStartBasicActivity(View)
 */
public class BasicActivity extends LoggingActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logging);

        // Set the color and description
        setDescription(R.string.activity_description_basic);
        setBackgroundColor(R.color.gray);

    }
}
