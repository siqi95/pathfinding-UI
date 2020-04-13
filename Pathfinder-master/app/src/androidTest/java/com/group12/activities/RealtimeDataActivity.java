package com.group12.activities.SearchActivity.java;

import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import androidx
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4ClassRunner::class)
public class SearchActivityTest {

    @Test
    public void Test_Button_Visibility() {
        // Context of the app under test.
        val activityScenario = ActivityScenario.launch(SearchActivity::class.java);
        onView(withId(R.id.stop_search_bar)).check(matches(isDisplayed()));
        onView(withId(R.id.tvRoute)).check(matches(isDisplayed()));
        onView(withId(R.id.tvDestination)).check(matches(isDisplayed()));
        onView(withId(R.id.tvDue)).check(matches(isDisplayed()));
    }

    @Test
    public void Test_isdisplayed() {
        // Context of the app under test.
        val activityScenario = ActivityScenario.launch(SearchActivity::class.java);

        onView(withId(R.id.travel_params_search)).check(matches(withText(R.string.travel_parameters)));

    }

}
