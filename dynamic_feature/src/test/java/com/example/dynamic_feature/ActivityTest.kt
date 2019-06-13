package com.example.dynamic_feature

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.dynamicrobolectrictest.DynamicApp
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config(application = DynamicApp::class)
class ActivityTest {

    @get:Rule
    val actRule = ActivityTestRule(DynamicActivity::class.java)

    @Before
    fun before() {

    }

    @Test
    fun test() {
    }
}