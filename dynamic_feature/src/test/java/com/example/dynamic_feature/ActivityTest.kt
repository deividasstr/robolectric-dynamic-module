package com.example.dynamic_feature

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.example.dynamicrobolectrictest.R as baseR



@RunWith(AndroidJUnit4::class)
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