package com.android.quepoq.remindmethere

import android.support.v7.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
  fun getRepository() = (application as ReminderApp).getRepository()
}