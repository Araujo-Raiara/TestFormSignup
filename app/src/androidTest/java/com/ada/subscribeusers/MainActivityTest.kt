package com.ada.subscribeusers

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import org.junit.Test

class MainActivityTest {

    private val activityScenario: ActivityScenario<MainActivity> = ActivityScenario.launch(MainActivity::class.java)

    @Test
    fun testLogin() {
        val email = "teste@gmail.com"
        val password = "abc"
        Espresso.onView(ViewMatchers.withId(R.id.et_email_id_login))
            .perform(ViewActions.typeText(email))
        Espresso.onView(ViewMatchers.withId(R.id.et_password_login))
            .perform(ViewActions.typeText(password))
        Espresso.onView(ViewMatchers.withId(R.id.btn_login)).perform(ViewActions.click())
        activityScenario.close()
    }

    @Test
    fun testIfCredentialInvalid() {

        Espresso.onView(ViewMatchers.withId(R.id.et_email_id_login))
            .perform(ViewActions.typeText("blablal@gmail.com"))
        Espresso.onView(ViewMatchers.withId(R.id.et_password_login))
            .perform(ViewActions.typeText("123"))
        Espresso.onView(ViewMatchers.withId(R.id.btn_login)).perform(ViewActions.click())
        activityScenario.close()
    }
}
