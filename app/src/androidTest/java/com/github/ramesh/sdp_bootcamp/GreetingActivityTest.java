package com.github.ramesh.sdp_bootcamp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class GreetingActivityTest {

    @Rule
    public ActivityScenarioRule<GreetingActivity> testRule = new ActivityScenarioRule<>(GreetingActivity.class);

    @Test
    public void greeting_test(){
        String testUsername = "David";

        Intent greetingIntent = new Intent(ApplicationProvider.getApplicationContext(), GreetingActivity.class);
        greetingIntent.putExtra("username", testUsername);

        ActivityScenario.launch(greetingIntent);

        onView(withId(R.id.greetTextView)).check(matches(withText("Hello " + testUsername + "!")));

    }
}
