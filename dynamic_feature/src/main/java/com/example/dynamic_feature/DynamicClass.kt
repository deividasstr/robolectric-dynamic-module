package com.example.dynamic_feature

import com.example.dynamicrobolectrictest.ImportantInterface

class DynamicClass (private val important: ImportantInterface) {

    init {
        important.toString()
    }
}