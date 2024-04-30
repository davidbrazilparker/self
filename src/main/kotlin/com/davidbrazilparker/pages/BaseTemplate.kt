package com.davidbrazilparker.pages

import io.ktor.server.html.*
import kotlinx.html.*

class BaseTemplate: Template<HTML> {
    val content = Placeholder<HtmlBlockTag>()

    override fun HTML.apply() {
        head {
            meta { charset="utf-8" }
            meta {
                name="viewport"
                content = "width=device-width, initial-scale=1"
            }
            link {
                href=""
                rel="stylesheet"
                integrity=""
                attributes["crossorigin"] = "anonymous"
            }
            link {
                href="/styles.css"
                rel="stylesheet"
            }
        }
        body {
            header {
                div { +"My Header" }
            }
            insert(content)
            footer {
                h3 { +"My Footer" }
            }
        }
    }
}