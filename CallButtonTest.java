package com.example.contact;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;

import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.Intents.intending;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasAction;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasData;
import static androidx.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isEnabled;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


public class CallButtonTest
{
    //To launch the mentioned activity under testing
    //Initializes Espresso-Intents before each test, and releases Espresso-intents after each test run

    @Rule
    //public ActivityTestRule<ContactPage> contactPageActivityTestRule = new ActivityTestRule<ContactPage>(ContactPage.class);
    //private ContactPage contactPageActivity = null;

    public IntentsTestRule<ContactPage> contactPageIntentTestRule = new IntentsTestRule<>(ContactPage.class);
    private ContactPage contactPageIntent = null;

    @Before
    public void setUp() throws Exception
    {
        contactPageIntent = contactPageIntentTestRule.getActivity();

        //contactPageActivity = contactPageActivityTestRule.getActivity();
    }

    @Test
    public void testCallButtonPressedAndEnabled()
    {

        //I don't think this is working
        View view = contactPageIntent.findViewById(R.id.callButton);
        assertNotNull("callButton enabled", view); //callButton enabled

        // User action that results in an external "phone" activity being launched.
        //user.clickOnView(system.getView(R.id.callButton));
        onView(withId(R.id.callButton)).perform(click());

        // Using a canned RecordedIntentMatcher to validate that an intent resolving
        // to the "phone" activity has been sent.
        intended(toPackage("com.android.phone"));

    }

    @Test
    public void testCallButtonPressedAndDisabled()
    {
        //MA's code
        //View view = contactPageActivity.findViewById(R.id.cellCallButton);
        //assertNotNull(view);

        View view = contactPageIntent.findViewById(R.id.callButton);
        assertNull("callButton disabled", view); //callButton disabled

        // User action that results in an external "phone" activity being launched.
        //user.clickOnView(system.getView(R.id.callButton));
        onView(withId(R.id.callButton)).perform(click());

        // Using a canned RecordedIntentMatcher to validate that an intent resolving
        // to the "phone" activity has been sent.
        intended(toPackage("com.android.phone"));
    }

    @Test
    public void testCellCallButtonPressedAndEnabled()
    {

    }

    @Test
    public void testCellCallButtonPressedAndDisabled()
    {

    }

    @Test
    public void testHomeCallButtonPressedAndEnabled()
    {
        //View view = contactPageActivity.findViewById(R.id.homeCallButton);
        //assertNotNull(view);
    }

    @Test
    public void testHomeCallButtonPressedAndDisabled()
    {
        //View view = contactPageActivity.findViewById(R.id.homeCallButton);
        //assertNotNull(view);
    }

    @Test
    public void testWorkCallButtonPressedAndEnabled()
    {
        //View view = contactPageActivity.findViewById(R.id.workCallButton);
        //assertNotNull(view);
    }

    @Test
    public void testWorkCallButtonPressedAndDisabled()
    {
        //View view = contactPageActivity.findViewById(R.id.workCallButton);
        //assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception
    {
        //contactPageActivity = null;
    }
}