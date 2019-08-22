package com.xinx.espresso;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public class ListViewActivityTest {

    @Rule
    public ActivityTestRule<ListViewActivity> rule = new ActivityTestRule<>(ListViewActivity.class);

    @Test
    public void click_list_view_item() {

    }
}