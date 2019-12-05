package com.example.contact;

import androidx.test.espresso.ViewAction;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class KH_SaveButtonEnabledTest
{

    @Rule
    public ActivityTestRule<AddEditContact> addEditContactActivityRule = new ActivityTestRule<>(AddEditContact.class);
    private AddEditContact addEditContactActivity = null;

    @Before
    public void setUp() throws Exception
    {
        addEditContactActivity = addEditContactActivityRule.getActivity();
    }

    /**
    @Test
    public void checkForValues()
    {
        //Check if no fields are entered - save button disabled

        noFieldsEntered();

        //Check if name field is entered

        nameFieldEntered();
        cellFieldEntered();
        homeFieldEntered();
        workFieldEntered();
        emailFieldEntered();
        addressFieldEntered();

        //Check if all fields entered - save button enabled

        allFieldsEntered();
    }
    **/

    @Test
    public void noFieldsEntered()
    {
        //Populate text fields

        onView(withId(R.id.userNameInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.mobileNumInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.homeNumInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.workNumInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.addressInput)).perform(typeText(""), closeSoftKeyboard());

        //Immediately try to click on save button with no text fields entered
        //onView(withId(R.id.saveButtonContact)).perform(click());

        //Check if the save button can be clicked on/ is enabled
        if((withId(R.id.saveButtonContact)).matches(isDisplayed()))
        {
            System.out.println("The save button is enabled. There are no fields entered. This is an error.");
        }
        else
        {
            System.out.println("The save button is disabled. There are no fields entered. This is supposed to happen.");
        }
    }


    @Test
    public void nameFieldEntered()
    {
        //Populate text fields

        onView(withId(R.id.userNameInput)).perform(typeText("Name"), closeSoftKeyboard());
        onView(withId(R.id.mobileNumInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.homeNumInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.workNumInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.addressInput)).perform(typeText(""), closeSoftKeyboard());

        //Immediately try to click on save button with no text fields entered
        //onView(withId(R.id.saveButtonContact)).perform(click());

        //Check if the save button can be clicked on/ is enabled
        if((withId(R.id.saveButtonContact)).matches(isDisplayed()))
        {
            System.out.println("The save button is enabled. The name field is entered. This is supposed to happen.");
        }
        else
        {
            System.out.println("The save button is disabled. The name field is entered. This is an error.");
        }
    }

    @Test
    public void cellFieldEntered()
    {
        //Populate text fields

        onView(withId(R.id.userNameInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.mobileNumInput)).perform(typeText("Mobile"), closeSoftKeyboard());
        onView(withId(R.id.homeNumInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.workNumInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.addressInput)).perform(typeText(""), closeSoftKeyboard());

        //Immediately try to click on save button with no text fields entered
        //onView(withId(R.id.saveButtonContact)).perform(click());

        //Check if the save button can be clicked on/ is enabled
        if((withId(R.id.saveButtonContact)).matches(isDisplayed()))
        {
            System.out.println("The save button is enabled. The cell phone field is entered. This is supposed to happen.");
        }
        else
        {
            System.out.println("The save button is disabled. The cell phone field is entered. This is an error.");
        }
    }

    @Test
    public void homeFieldEntered()
    {
        //Populate text fields

        onView(withId(R.id.userNameInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.mobileNumInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.homeNumInput)).perform(typeText("Home"), closeSoftKeyboard());
        onView(withId(R.id.workNumInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.addressInput)).perform(typeText(""), closeSoftKeyboard());

        //Immediately try to click on save button with no text fields entered
        //onView(withId(R.id.saveButtonContact)).perform(click());

        //Check if the save button can be clicked on/ is enabled
        if((withId(R.id.saveButtonContact)).matches(isDisplayed()))
        {
            System.out.println("The save button is enabled. The home phone field is entered. This is supposed to happen.");
        }
        else
        {
            System.out.println("The save button is disabled. The home phone field is entered. This is an error.");
        }
    }

    @Test
    public void workFieldEntered()
    {
        //Populate text fields

        onView(withId(R.id.userNameInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.mobileNumInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.homeNumInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.workNumInput)).perform(typeText("Work"), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.addressInput)).perform(typeText(""), closeSoftKeyboard());

        //Immediately try to click on save button with no text fields entered
        //onView(withId(R.id.saveButtonContact)).perform(click());

        //Check if the save button can be clicked on/ is enabled
        if((withId(R.id.saveButtonContact)).matches(isDisplayed()))
        {
            System.out.println("The save button is enabled. The work phone field is entered. This is supposed to happen.");
        }
        else
        {
            System.out.println("The save button is disabled. The work phone field is entered. This is an error.");
        }
    }

    @Test
    public void emailFieldEntered()
    {
        //Populate text fields

        onView(withId(R.id.userNameInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.mobileNumInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.homeNumInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.workNumInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(typeText("Email"), closeSoftKeyboard());
        onView(withId(R.id.addressInput)).perform(typeText(""), closeSoftKeyboard());

        //Immediately try to click on save button with no text fields entered
        //onView(withId(R.id.saveButtonContact)).perform(click());

        //Check if the save button can be clicked on/ is enabled
        if((withId(R.id.saveButtonContact)).matches(isDisplayed()))
        {
            System.out.println("The save button is enabled. The email field is entered. This is supposed to happen.");
        }
        else
        {
            System.out.println("The save button is disabled. The email field is entered. This is an error.");
        }
    }

    @Test
    public void addressFieldEntered()
    {
        //Populate text fields

        onView(withId(R.id.userNameInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.mobileNumInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.homeNumInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.workNumInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.addressInput)).perform(typeText("Address"), closeSoftKeyboard());

        //Immediately try to click on save button with no text fields entered
        //onView(withId(R.id.saveButtonContact)).perform(click());

        //Check if the save button can be clicked on/ is enabled
        if((withId(R.id.saveButtonContact)).matches(isDisplayed()))
        {
            System.out.println("The save button is enabled. The address field is entered. This is supposed to happen.");
        }
        else
        {
            System.out.println("The save button is disabled. The address field is entered. This is an error.");
        }
    }

    @Test
    public void allFieldsEntered()
    {
        //Populate text fields

        onView(withId(R.id.userNameInput)).perform(typeText("Name"), closeSoftKeyboard());
        onView(withId(R.id.mobileNumInput)).perform(typeText("Mobile"), closeSoftKeyboard());
        onView(withId(R.id.homeNumInput)).perform(typeText("Home"), closeSoftKeyboard());
        onView(withId(R.id.workNumInput)).perform(typeText("Work"), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(typeText("Email"), closeSoftKeyboard());
        onView(withId(R.id.addressInput)).perform(typeText("Address"), closeSoftKeyboard());

        //Immediately try to click on save button with no text fields entered
        //onView(withId(R.id.saveButtonContact)).perform(click());

        //Check if the save button can be clicked on/ is enabled
        if((withId(R.id.saveButtonContact)).matches(isDisplayed()))
        {
            System.out.println("The save button is enabled. There are no fields entered. This is an error.");
        }
        else
        {
            System.out.println("The save button is disabled. There are no fields entered. This is supposed to happen.");
        }

    }

    @After
    public void tearDown() throws Exception
    {
        addEditContactActivity = null;
    }

}