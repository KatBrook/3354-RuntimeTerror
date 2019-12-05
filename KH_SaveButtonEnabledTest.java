package com.example.contact;

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

    public void noFieldsEntered()
    {
        assertNull(R.id.userNameInput);
        assertNull(R.id.mobileNumInput);
        assertNull(R.id.homeNumInput);
        assertNull(R.id.workNumInput);
        assertNull(R.id.emailInput);
        assertNull(R.id.addressInput);

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

    public void nameFieldEntered()
    {
        assertNotNull(R.id.userNameInput);
        assertNull(R.id.mobileNumInput);
        assertNull(R.id.homeNumInput);
        assertNull(R.id.workNumInput);
        assertNull(R.id.emailInput);
        assertNull(R.id.addressInput);

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

    public void cellFieldEntered()
    {
        assertNull(R.id.userNameInput);
        assertNotNull(R.id.mobileNumInput);
        assertNull(R.id.homeNumInput);
        assertNull(R.id.workNumInput);
        assertNull(R.id.emailInput);
        assertNull(R.id.addressInput);

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

    public void homeFieldEntered()
    {
        assertNull(R.id.userNameInput);
        assertNull(R.id.mobileNumInput);
        assertNotNull(R.id.homeNumInput);
        assertNull(R.id.workNumInput);
        assertNull(R.id.emailInput);
        assertNull(R.id.addressInput);

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

    public void workFieldEntered()
    {
        assertNull(R.id.userNameInput);
        assertNull(R.id.mobileNumInput);
        assertNull(R.id.homeNumInput);
        assertNotNull(R.id.workNumInput);
        assertNull(R.id.emailInput);
        assertNull(R.id.addressInput);

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

    public void emailFieldEntered()
    {
        assertNull(R.id.userNameInput);
        assertNull(R.id.mobileNumInput);
        assertNull(R.id.homeNumInput);
        assertNull(R.id.workNumInput);
        assertNotNull(R.id.emailInput);
        assertNull(R.id.addressInput);

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

    public void addressFieldEntered()
    {
        assertNull(R.id.userNameInput);
        assertNull(R.id.mobileNumInput);
        assertNull(R.id.homeNumInput);
        assertNull(R.id.workNumInput);
        assertNull(R.id.emailInput);
        assertNotNull(R.id.addressInput);

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

    public void allFieldsEntered()
    {
        assertNotNull(R.id.userNameInput);
        assertNotNull(R.id.mobileNumInput);
        assertNotNull(R.id.homeNumInput);
        assertNotNull(R.id.workNumInput);
        assertNotNull(R.id.emailInput);
        assertNotNull(R.id.addressInput);

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