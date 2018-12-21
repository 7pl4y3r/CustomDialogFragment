package com.example.alin.customalertdialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatDialogFragment
import android.view.LayoutInflater

class DialogFragment : AppCompatDialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder = AlertDialog.Builder(activity as Context)
        val inflater = (activity as FragmentActivity).layoutInflater as LayoutInflater
        val view = inflater.inflate(R.layout.dialog, null)

        builder.setView(view)
                .setTitle("My dialog")
                .setCancelable(true)
                .setNegativeButton("cancel") { dialog, which -> kotlin.run {

                    showMessage("Canceled", activity as Context, true)
                }}
            .setPositiveButton("add") {dialog, which -> kotlin.run {

                showMessage("added", activity as Context, true)

            }}

        return builder.create()
    }
}