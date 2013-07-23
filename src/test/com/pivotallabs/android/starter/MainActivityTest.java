package com.pivotallabs.android.starter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.fest.assertions.api.ANDROID.assertThat;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void activityShouldLoadTheLayout() throws Exception {
        MainActivity activity = new MainActivity();
        activity.onCreate(null);

        assertThat(activity.textView).hasText("Hello world!");
    }
}
