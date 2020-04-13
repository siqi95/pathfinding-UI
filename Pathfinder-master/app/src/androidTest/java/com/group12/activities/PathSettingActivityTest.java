package com.group12.activities.PathSettingActivity.java;

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
public class PathSettingActivityTest {

    @Test
    public void Test_Button_Visibility() {
        val activityScenario = ActivityScenario.launch(PathSettingActivity::class.java);

        onView(withId(R.id.PathRadioGroup)).check(matches(isDisplayed()));
        onView(withId(R.id.speedSwitch)).check(matches(isDisplayed()));
        onView(withId(R.id.envSwitch)).check(matches(isDisplayed()));
        onView(withId(R.id.comfortSwitch)).check(matches(isDisplayed()));
        onView(withId(R.id.saveSettingButton)).check(matches(isDisplayed()));

    }

    @Test
    public void Test_isdisplayed() {
        val activityScenario = ActivityScenario.launch(SearchActivity::class.java);

        onView(withId(R.id.speedSwitch)).check(matches(withText(R.string.Speed)));
        onView(withId(R.id.envSwitch)).check(matches(withText(R.string.Environment)));
        onView(withId(R.id.comfortSwitch)).check(matches(withText(R.string.Comfort)));
        onView(withId(R.id.saveSettingButton)).check(matches(withText(R.string.save_settings)));
    }

}
