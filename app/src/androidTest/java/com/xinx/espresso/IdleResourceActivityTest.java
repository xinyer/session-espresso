package com.xinx.espresso;


import android.support.test.espresso.IdlingRegistry;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class IdleResourceActivityTest {

    @Rule
    public ActivityTestRule<IdleResourceActivity> rule = new ActivityTestRule<>(IdleResourceActivity.class);

    @Before
    public void setUp() throws Exception {
        IdlingRegistry.getInstance().register(rule.getActivity().idlingResource);
    }

    @After
    public void tearDown() throws Exception {
        IdlingRegistry.getInstance().unregister(rule.getActivity().idlingResource);
    }

    @Test
    public void idle_resource() {
        onView(ViewMatchers.withId(R.id.textView)).check(matches(withText("Hello")));
    }
}