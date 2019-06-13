package com.example.dynamic_feature

import com.example.dynamicrobolectrictest.ImportantInterface
import org.junit.Before
import org.junit.Test

class DynamicClassTest {

    private lateinit var theClass: DynamicClass

    @Before
    fun setUp() {
        theClass = DynamicClass(object : ImportantInterface{})
    }

    @Test
    fun test() {
        theClass.toString()
    }
}