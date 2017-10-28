package com.runt9.afs.view

import com.runt9.afs.app.GlobalStyles
import tornadofx.*

class MainMenu : View("It Begins...") {
    override val root = hbox {
        label(title) {
            addClass(GlobalStyles.heading)
        }
    }
}