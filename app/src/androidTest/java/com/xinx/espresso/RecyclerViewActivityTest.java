package com.xinx.espresso;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public class RecyclerViewActivityTest {

    @Rule
    public ActivityTestRule<RecyclerViewActivity> rule = new ActivityTestRule<>(RecyclerViewActivity.class);

    @Test
    public void click_recycler_view_item() {

    }
}