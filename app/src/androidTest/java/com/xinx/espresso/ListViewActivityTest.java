package com.xinx.espresso;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.is;


@RunWith(AndroidJUnit4.class)
public class ListViewActivityTest {

    @Rule
    public ActivityTestRule<ListViewActivity> rule = new ActivityTestRule<>(ListViewActivity.class);

    @Test
    public void click_list_view_item() {
        onData(is("A")).perform(click());
        onView(withId(R.id.tv_list_item)).check(matches(withText("A")));
    }
}