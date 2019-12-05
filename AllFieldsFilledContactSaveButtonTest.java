package com.example.contact;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class AllFieldsFilledContactSaveButtonTest {

    @Rule
    public ActivityTestRule<AddEditContact> cActivityTestRule = new ActivityTestRule<>(AddEditContact.class);

    @Test
    public void addEditContactTest()
    {
        ViewInteraction editText = onView(allOf(withId(R.id.userNameInput), withText("Name"), childAtPosition(allOf(withId(R.id.nameLayout),
                                        childAtPosition(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class), 1)), 1), isDisplayed()));
        editText.check(matches(withText("Katrina Holbrook")));

        ViewInteraction editText2 = onView(allOf(withId(R.id.mobileNumInput), withText("Mobile Phone Number"), childAtPosition(allOf(withId(R.id.mobileLayout),
                                        childAtPosition(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class), 2)), 1), isDisplayed()));
        editText2.check(matches(withText("123-456-7890")));

        ViewInteraction editText3 = onView(allOf(withId(R.id.homeNumInput), withText("Home Phone Number"), childAtPosition(allOf(withId(R.id.homeLayout),
                                        childAtPosition(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class), 3)), 1), isDisplayed()));
        editText3.check(matches(withText("512-123-4567")));

        ViewInteraction editText4 = onView(allOf(withId(R.id.workNumInput), withText("Work Phone Number"), childAtPosition(allOf(withId(R.id.workLayout),
                                        childAtPosition(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class), 4)), 1), isDisplayed()));
        editText4.check(matches(withText("111-999-7777")));

        ViewInteraction editText5 = onView(allOf(withId(R.id.emailInput), withText("Email Address"), childAtPosition(allOf(withId(R.id.emailLayout),
                                        childAtPosition(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class), 5)), 1), isDisplayed()));
        editText5.check(matches(withText("fake@gmail.com")));

        ViewInteraction editText6 = onView(allOf(withId(R.id.addressInput), withText("Postal Address"), childAtPosition(allOf(withId(R.id.addressLayout),
                                        childAtPosition(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class), 6)), 1), isDisplayed()));
        editText6.check(matches(withText("2200 Waterview Parkway")));

        ViewInteraction imageView = onView(allOf(withId(R.id.contactPhoto), childAtPosition(
                                    childAtPosition(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class), 0), 0), isDisplayed()));
        imageView.check(matches(isDisplayed()));

        ViewInteraction button = onView(allOf(withId(R.id.saveButtonContact), childAtPosition(childAtPosition(IsInstanceOf.<View>instanceOf(android.widget.RelativeLayout.class), 1), 1), isDisplayed()));
        button.check(matches(isDisplayed()));
    }

    private static Matcher<View> childAtPosition(final Matcher<View> parentMatcher, final int position)
    {

        return new TypeSafeMatcher<View>()
        {
            @Override
            public void describeTo(Description description)
            {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view)
            {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent) && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
