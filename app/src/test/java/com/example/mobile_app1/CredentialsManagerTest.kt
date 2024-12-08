package com.example.mobile_app1
import org.junit.Assert.*
import org.junit.Test


class CredentialsManagerTest {

    private val credentialsManager = CredentialsManager()

    @Test
    fun testValidEmail() {
        assertTrue(credentialsManager.isEmailValid("example@email.com"))
        assertFalse(credentialsManager.isEmailValid("false_email"))
    }

    @Test
    fun testPassword() {
        assertTrue(credentialsManager.isValidPassword("olcay123"))
        assertFalse(credentialsManager.isValidPassword("no"))
    }

    @Test
    fun testCredentials() {
        assertTrue(credentialsManager.validateCredentials("olcay@test.com", "olcay123", true))
        assertFalse(credentialsManager.validateCredentials("false_email", "olcay123", true))
        assertFalse(credentialsManager.validateCredentials("olcay@test.com", "no", true))

        assertFalse(credentialsManager.validateCredentials("olcay@test.com", "olcay123", false))
    }

    @Test
    fun testTermsAccepted() {
        assertFalse(credentialsManager.termsAccepted(false))
    }


}