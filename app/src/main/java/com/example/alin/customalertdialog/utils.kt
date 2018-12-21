package com.example.alin.customalertdialog

import android.content.Context
import android.widget.Toast

fun showMessage(message: String, context: Context, isLong: Boolean) {
    Toast.makeText(context, message,
        if (isLong) Toast.LENGTH_SHORT else Toast.LENGTH_LONG)
        .show()
}