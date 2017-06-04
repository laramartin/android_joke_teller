package com.udacity.gradle.builditbigger.api;

import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.JokeTeller;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class JokeAsyncTaskTest {

    private JokeTeller jokeTeller = new JokeTeller() {
        @Override
        public void tellJoke(String joke) {
            // ignore this
        }
    };

    @Test
    public void verifyAsyncTask() {
        JokeAsyncTask asyncTask = new JokeAsyncTask();
        String result = asyncTask.doInBackground(jokeTeller);
        assertEquals("this is a joke", result);
    }
}