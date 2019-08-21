package com.xinx.espresso;

import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> rule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void login() {
        onView(withId(R.id.input_name)).perform(ViewActions.typeText("admin"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(ViewActions.typeText("123456"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(ViewActions.click());
        onView(withId(R.id.tv_hello)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}