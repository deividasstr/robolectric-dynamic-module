package com.example.dynamicrobolectrictest

import android.app.Application
import androidx.test.core.app.ApplicationProvider
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class MainActivityTest {

    @Before
    fun before() {
        //RuntimeEnvironment.systemContext.getString(R.string.feature1)
        ApplicationProvider.getApplicationContext<Application>().getString(R.string.feature1)
    }

    @Test
    fun test() {

    }
}