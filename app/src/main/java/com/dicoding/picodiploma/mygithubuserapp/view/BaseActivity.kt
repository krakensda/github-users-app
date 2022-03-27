package com.dicoding.picodiploma.mygithubuserapp.view

import androidx.appcompat.app.AppCompatActivity
import com.dicoding.picodiploma.mygithubuserapp.util.Event
import com.google.android.material.snackbar.Snackbar

abstract class BaseActivity : AppCompatActivity() {
    protected fun showSnackBar(event: Event<String>) =
        event.getContentIfNotHandled()?.let { snackBarText ->
            Snackbar.make(window.decorView.rootView, snackBarText, Snackbar.LENGTH_SHORT).show()
        }
}