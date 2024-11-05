package com.example.pruebaclass

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class UserTest {

    @Test
    fun pruebaEsAdulto() {
        val user = User("John", 20)
        assertTrue(user.isAdult())
    }

    @Test
    fun pruebaNoEsAdulto() {
        val user = User("Marlen", 15)
        assertFalse(user.isAdult())
    }

    @Test
    fun pruebaEsJoven() {
        val user = User("Tapia", 16)
        assertTrue(user.isTeenager())
    }

    @Test
    fun pruebaNoEsJoven() {
        val user = User("Martha", 19)
        assertFalse(user.isTeenager())
    }

    @Test
    fun pruebaEsChaneque() {
        val user = User("Mika", 10)
        assertTrue(user.isChild())
    }

    @Test
    fun pruebaNoesChaneque() {
        val user = User("Alia", 15)
        assertFalse(user.isChild())
    }
}