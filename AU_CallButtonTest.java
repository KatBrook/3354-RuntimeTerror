package com.example.contact;

import android.content.Intent;

import androidx.test.espresso.intent.rule.IntentsTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.intent.Intents.intended;

import static androidx.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;

public class AU_CallButtonTest
{
    //To launch the mentioned activity under testing.
    //Initializes Espresso-Intents before each test, and releases Espresso-intents after each test run.
    public IntentsTestRule<ContactPage> contactPageIntentTestRule = new IntentsTestRule<>(ContactPage.class);
    private ContactPage contactPageIntent = null;

    //Instantiate contactPageIntent with getActivity().
    @Before
    public void setUp()
    {
        contactPageIntent = contactPageIntentTestRule.getActivity();
    }

    //Test method for when the main call button is pressed.
    @Test
    public void callButtonPressed()
    {
        //Check if the call button is displayed.
        //Otherwise, indicate that the call button is not displayed.
        if(withId(R.id.callButton).matches(isDisplayed()))
        {
            //Click on the call button.
            onView(withId(R.id.callButton)).perform(click());
            //Instantiate new intent.
            Intent actionDial = new Intent(Intent.ACTION_DIAL);

            //If contactPageIntent does not perform actionDial, button is disabled.
            //Otherwise, proceed with call function to phone app.
            if(contactPageIntent.getIntent() != actionDial)
            {
                System.out.println("Call button is disabled");
            } else
            {
                intended(toPackage("com.android.phone"));
            }
        } else
        {
            System.out.println("Call button is not displayed");
        }
    }

    //Test method for when the cell call button is pressed.
    @Test
    public void cellCallButtonPressed()
    {
        //Check if the cell call button is displayed.
        //Otherwise, indicate that the cell call button is not displayed.
        if(withId(R.id.cellCallButton).matches(isDisplayed()))
        {
            //Click on the call button.
            onView(withId(R.id.cellCallButton)).perform(click());
            //Instantiate new intent.
            Intent actionDial = new Intent(Intent.ACTION_DIAL);

            //If contactPageIntent does not perform actionDial, button is disabled.
            //Otherwise, proceed with call function to phone app.
            if(contactPageIntent.getIntent() != actionDial)
            {
                System.out.println("Cell call button is disabled");
            } else
            {
                intended(toPackage("com.android.phone"));
            }
        } else
        {
            System.out.println("Cell call button is not displayed");
        }
    }

    //Test method for when the home call button is pressed.
    @Test
    public void homeCallButtonPressed()
    {
        //Check if the home call button is displayed.
        //Otherwise, indicate that the home call button is not displayed.
        if(withId(R.id.homeCallButton).matches(isDisplayed()))
        {
            //Click on the call button.
            onView(withId(R.id.homeCallButton)).perform(click());
            //Instantiate new intent.
            Intent actionDial = new Intent(Intent.ACTION_DIAL);

            //If contactPageIntent does not perform actionDial, button is disabled.
            //Otherwise, proceed with call function to phone app.
            if(contactPageIntent.getIntent() != actionDial)
            {
                System.out.println("Home call button is disabled");
            } else
            {
                intended(toPackage("com.android.phone"));
            }
        } else
        {
            System.out.println("Home call button is not displayed");
        }
    }

    //Test method for when the work call button is pressed.
    @Test
    public void workCallButton()
    {
        //Check if the work call button is displayed.
        //Otherwise, indicate that the work call button is not displayed.
        if(withId(R.id.workCallButton).matches(isDisplayed()))
        {
            //Click on the call button.
            onView(withId(R.id.workCallButton)).perform(click());
            //Instantiate new intent.
            Intent actionDial = new Intent(Intent.ACTION_DIAL);

            //If contactPageIntent does not perform actionDial, button is disabled.
            //Otherwise, proceed with call function to phone app.
            if(contactPageIntent.getIntent() != actionDial)
            {
                System.out.println("Work call button is disabled");
            } else
            {
                intended(toPackage("com.android.phone"));
            }
        } else
        {
            System.out.println("Work call button is not displayed");
        }
    }

    //After function.
    @After
    public void tearDown()
    {
        contactPageIntent = null;
    }
}