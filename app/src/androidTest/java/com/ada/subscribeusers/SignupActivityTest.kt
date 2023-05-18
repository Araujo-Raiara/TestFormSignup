package com.ada.subscribeusers

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import org.junit.Test

class SignupActivityTest {

    private val activityScenario: ActivityScenario<SignupActivity> =
        ActivityScenario.launch(SignupActivity::class.java)

    @Test
    fun testSubscribe() {
        val name = "Raiara"
        val email = "raiara@gmail.com"
        val password = "abc"

        onView(ViewMatchers.withId(R.id.et_name_signup))
            .perform(ViewActions.typeText(name))
        onView(ViewMatchers.withId(R.id.et_email_id_signup))
            .perform(ViewActions.typeText(email))
        onView(ViewMatchers.withId(R.id.et_password_signup))
            .perform(ViewActions.typeText(password))
        onView(ViewMatchers.withId(R.id.btn_signup))
            .perform(ViewActions.click())
        activityScenario.close()
    }
}