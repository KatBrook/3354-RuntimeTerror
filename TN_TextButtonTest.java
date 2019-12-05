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

public class TN_TextButtonTest
{
    //Create new intent based on the ContactPage class.
    //Create new ContactPage object, instantiate it as null.
    public IntentsTestRule<ContactPage> contactPageIntentTestRule = new IntentsTestRule<>(ContactPage.class);
    private ContactPage contactPageIntent = null;

    //Instantiate contactPageIntent.
    @Before
    public void setUp()
    {
        contactPageIntent = contactPageIntentTestRule.getActivity();
    }

    //Method for testing main text button.
    @Test
    public void textButtonPressed()
    {
        //If main text button is displayed, proceed.
        //Otherwise, indicate that button is not displayed.
        if(withId(R.id.textButton).matches(isDisplayed()))
        {
            //Click on the text button, and instantiate new intent actionView.
            onView(withId(R.id.textButton)).perform(click());
            Intent actionView = new Intent(Intent.ACTION_VIEW);

            //If the intent does not equal actionView, the button is disabled.
            //Otherwise, the button will take the user to the SMS app.
            if(contactPageIntent.getIntent() != actionView)
            {
                System.out.println("Text button is disabled");
            } else
            {
                intended(toPackage("com.android.sms"));
            }
        } else
        {
            System.out.println("Text button is not displayed");
        }
    }


    @Test
    public void cellTextButtonPressed()
    {
        //If cell text button is displayed, proceed.
        //Otherwise, indicate that button is not displayed.
        if(withId(R.id.cellTextButton).matches(isDisplayed()))
        {
            //Click on the text button, and instantiate new intent actionView.
            onView(withId(R.id.cellTextButton)).perform(click());
            Intent actionView = new Intent(Intent.ACTION_VIEW);

            //If the intent does not equal actionView, the button is disabled.
            //Otherwise, the button will take the user to the SMS app.
            if(contactPageIntent.getIntent() != actionView)
            {
                System.out.println("Cell text button is disabled");
            } else
            {
                intended(toPackage("com.android.sms"));
            }
        } else
        {
            System.out.println("Cell text button is not displayed");
        }
    }

    @Test
    public void homeTextButtonPressed()
    {
        //If home text button is displayed, proceed.
        //Otherwise, indicate that button is not displayed.
        if(withId(R.id.homeTextButton).matches(isDisplayed()))
        {
            //Click on the text button, and instantiate new intent actionView.
            onView(withId(R.id.homeTextButton)).perform(click());
            Intent actionView = new Intent(Intent.ACTION_VIEW);

            //If the intent does not equal actionView, the button is disabled.
            //Otherwise, the button will take the user to the SMS app.
            if(contactPageIntent.getIntent() != actionView)
            {
                System.out.println("Home text button is disabled");
            } else
            {
                intended(toPackage("com.android.sms"));
            }
        } else
        {
            System.out.println("Home text button is not displayed");
        }
    }

    @Test
    public void workTextButton()
    {
        //If work text button is displayed, proceed.
        //Otherwise, indicate that button is not displayed.
        if(withId(R.id.workTextButton).matches(isDisplayed()))
        {
            //Click on the text button, and instantiate new intent actionView.
            onView(withId(R.id.workTextButton)).perform(click());
            Intent actionView = new Intent(Intent.ACTION_VIEW);

            //If the intent does not equal actionView, the button is disabled.
            //Otherwise, the button will take the user to the SMS app.
            if(contactPageIntent.getIntent() != actionView)
            {
                System.out.println("Work text button is disabled");
            } else
            {
                intended(toPackage("com.android.sms"));
            }
        } else
        {
            System.out.println("Work text button is not displayed");
        }
    }

    //Reset the contactPageIntent to null.
    @After
    public void tearDown()
    {
        contactPageIntent = null;
    }
}
