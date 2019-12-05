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
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class EditContactTextFieldsTest
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
    public void ensureTextChangesWork() //testHintVisibility
    {

        // check hint visibility
        //onView(withId(R.id.userNameInput)).check(matches(withHint("Name")));

        //Type a name in the name text field and then press the save button.
        onView(withId(R.id.userNameInput)).perform(typeText("Adam Yuri"), closeSoftKeyboard());
        onView(withId(R.id.saveButtonContact)).perform(click());

        //Check that the name text field was changed.
        onView(withId(R.id.userNameInput)).check(matches(withText("Adam Yuri")));
    }

    @Test
    public void changeText_newActivity()
    {
        //Click on edit button to edit a contact
        //onView(withId(R.id.editContactButton)).perform(click());

        //Type a name in the name text field and then press the save button.
        onView(withId(R.id.userNameInput)).perform(typeText("NewText"), closeSoftKeyboard());
        onView(withId(R.id.saveButtonContact)).perform(click());

        //This view is in a different Activity, no need to tell Espresso.
        //View the changed name in the contact page
        onView(withId(R.id.primaryText)).check(matches(withText("NewText")));
    }

    @After
    public void tearDown() throws Exception
    {
        addEditContactActivity = null;
    }

}