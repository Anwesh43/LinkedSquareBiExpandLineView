package com.anwesh.uiprojects.linkedsquarebiexpandlineview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.squarebiexpandlineview.SquareBiExpandLineView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SquareBiExpandLineView.create(this)
    }
}
