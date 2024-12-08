package com.example.mobile_app1

class CredentialsManager {
    private val emailPattern = ("[a-zA-Z0-9\\+\\%\\-\\+]{1,256}" +
            "\\@" +
            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
            "(" +
            "\\." +
            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
            ")+").toRegex()

    fun isEmailValid(email: String): Boolean {
        return email.matches(emailPattern)
    }

    fun isPasswordValid(password: String): Boolean {
        return password.length >= 8
    }

    fun validateLogin(email: String, password: String, isChecked: Boolean): Boolean {
        return isEmailValid(email) && isPasswordValid(password) && isChecked
    }

    fun isFullNameValid(fullName: String): Boolean {
        return fullName.isNotEmpty()
    }

    fun isPhoneNumberValid(phoneNumber: String): Boolean {
        return phoneNumber.isNotEmpty()
    }

    fun validateSignUp(
        fullName: String,
        email: String,
        phoneNumber: String,
        password: String,
        isChecked: Boolean
    ): Boolean {
        return isFullNameValid(fullName) &&
                isEmailValid(email) &&
                isPasswordValid(password) &&
                isPhoneNumberValid(phoneNumber) &&
                isChecked
    }
}
