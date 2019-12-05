package com.example.contact;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Test three activities; the test should pass if the activities are launched
 * otherwise it will fail
 *
 * Writer: Mohammad Asif
 * version: 1.0
 */

public class ContactPageTest {
    @Rule
    public ActivityTestRule<ContactPage> mActivityTestRule = new ActivityTestRule<ContactPage>(ContactPage.class );
    private ContactPage mActivity = null;

    @Before
    public void setUp() throws Exception
    {
        mActivity = mActivityTestRule.getActivity();

    }

    @Test
    public void testCallButton()
    {
        View view = mActivity.findViewById( R.id.cellCallButton );
        assertNotNull( view );
    }
    @Test
    public void testSMSButton()
    {
        View view = mActivity.findViewById( R.id.cellTextButton );
        assertNotNull( view );
    }

    @Test
    public  void testEmailButton()
    {
       View view = mActivity.findViewById( R.id.emailButton ) ;
       assertNotNull( view );
    }

    @After
    public void tearDown() throws Exception
    {
        mActivity = null;
    }
}

// End of test class