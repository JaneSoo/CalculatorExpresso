package com.example.janesoo.calculator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ExampleInstrumentedTest {


    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

//    @Test
//    public void sum_activity() {
//        String result = "3";
//        onView(withId(R.id.one)).perform(click());
//        onView(withId(R.id.plus)).perform(click());
//        onView(withId(R.id.two)).perform(click());
//        onView(withId(R.id.equal)).perform(click());
//        onView(withId(R.id.view)).check(matches(withText(result)));
//
//    }
//
//    @Test
//    public void minus_activity() {
//        String result = "-1";
//        onView(withId(R.id.one)).perform(click());
//        onView(withId(R.id.minus)).perform(click());
//        onView(withId(R.id.two)).perform(click());
//        onView(withId(R.id.equal)).perform(click());
//        onView(withId(R.id.view)).check(matches(withText(result)));
//
//    }
//
//    @Test
//    public void multi_activity() {
//        String result = "2";
//        onView(withId(R.id.one)).perform(click());
//        onView(withId(R.id.multi)).perform(click());
//        onView(withId(R.id.two)).perform(click());
//        onView(withId(R.id.equal)).perform(click());
//        onView(withId(R.id.view)).check(matches(withText(result)));
//
//    }
//
//    @Test
//    public void divide_activity() {
//        String result = "0";
//        onView(withId(R.id.one)).perform(click());
//        onView(withId(R.id.devide)).perform(click());
//        onView(withId(R.id.two)).perform(click());
//        onView(withId(R.id.equal)).perform(click());
//        onView(withId(R.id.view)).check(matches(withText(result)));
//
//    }


    @Test
    public void fullTestCalculator(){
        String result_sum = "3";
        onView(withId(R.id.one)).perform(click());
        onView(withId(R.id.plus)).perform(click());
        onView(withId(R.id.two)).perform(click());
        onView(withId(R.id.equal)).perform(click());
        onView(withId(R.id.view)).check(matches(withText(result_sum)));

        String result_minus = "-1";
        onView(withId(R.id.one)).perform(click());
        onView(withId(R.id.minus)).perform(click());
        onView(withId(R.id.two)).perform(click());
        onView(withId(R.id.equal)).perform(click());
        onView(withId(R.id.view)).check(matches(withText(result_minus)));

        String result_multi = "0";
        onView(withId(R.id.one)).perform(click());
        onView(withId(R.id.devide)).perform(click());
        onView(withId(R.id.two)).perform(click());
        onView(withId(R.id.equal)).perform(click());
        onView(withId(R.id.view)).check(matches(withText(result_multi)));

        String result_divide = "0";

        onView(withId(R.id.one)).perform(click());
        onView(withId(R.id.devide)).perform(click());
        onView(withId(R.id.two)).perform(click());
        onView(withId(R.id.equal)).perform(click());
        onView(withId(R.id.view)).check(matches(withText(result_divide)));

    }


//
//    @Test
//    public void changeText_newActivity(){
//        onView(withId(R.id.text)).perform(typeText(STRING_TO_BE_TYPE),closeSoftKeyboard());
//        onView(withId(R.id.open_activity)).perform(click());
//    }
}

