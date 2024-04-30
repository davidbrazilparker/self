package com.davidbrazilparker.pages.landing

import com.davidbrazilparker.pages.BaseTemplate
import io.ktor.server.html.*
import kotlinx.html.HTML
import kotlinx.html.h1

class LandingTemplate: Template<HTML> {
    override fun HTML.apply() {
        insert(BaseTemplate()) {
            content {
                h1 {+"Welcome to my website"}
            }
        }
    }
}