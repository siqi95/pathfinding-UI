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
        val activityScenario = ActivityScenario.launch(SearchActivity::class.java);
        onView(withId(R.id.sliderText)).check(matches(isDisplayed()));
        onView(withId(R.id.travel_params_search)).check(matches(isDisplayed()));
        onView(withId(R.id.realtime_button)).check(matches(isDisplayed()));
        onView(withId(R.id.setting_button)).check(matches(isDisplayed()));
        onView(withId(R.id.search_bar)).check(matches(isDisplayed()));

    }

    @Test
    public void Test_isdisplayed() {
        val activityScenario = ActivityScenario.launch(SearchActivity::class.java);
        onView(withId(R.id.travel_params_search)).check(matches(withText(R.string.travel_parameters)));
    }

    @Test
    fun test_navPathSettingActivity(){
        val activityScenario = ActivityScenario.launch(SearchActivity::class.java);
        onView(withId(R.id.setting_button)).perform(click());
        onView(allOf(withId(R.id.saveSettingButton)), withText("save_settings")).check(matches(isDisplayed()));
        onView(allOf(withId(R.id.comfortSwitch)), withText("Comfort")).check(matches(isDisplayed()));
        onView(allOf(withId(R.id.envSwitch)), withText("Environment")).check(matches(isDisplayed()));
        onView(allOf(withId(R.id.speedSwitch)), withText("Speed")).check(matches(isDisplayed()));
    }

    @Test
    fun test_backPress_toSearchActivity(){
        val activityScenario = ActivityScenario.launch(SearchActivity::class.java);
        onView(withId(R.id.saveSettingButton)).perform(click());
        onView(allOf(withId(R.id.saveSettingButton)), withText("save_settings")).check(matches(isDisplayed()));
        onView(withId(R.id.sliderText)).check(matches(isDisplayed()));
        onView(withId(R.id.travel_params_search)).check(matches(isDisplayed()));
        onView(withId(R.id.realtime_button)).check(matches(isDisplayed()));
        onView(withId(R.id.setting_button)).check(matches(isDisplayed()));
        onView(withId(R.id.search_bar)).check(matches(isDisplayed()));
    }

    @Test
    fun test_navRealTimeDataActivity(){
        val activityScenario = ActivityScenario.launch(SearchActivity::class.java);
        onView(withId(R.id.realtime_button)).perform(click());
        onView(withId(R.id.PathRadioGroup)).check(matches(isDisplayed()));
        onView(withId(R.id.speedSwitch)).check(matches(isDisplayed()));
        onView(withId(R.id.envSwitch)).check(matches(isDisplayed()));
        onView(withId(R.id.comfortSwitch)).check(matches(isDisplayed()));
        onView(withId(R.id.saveSettingButton)).check(matches(isDisplayed()));
    }
}
