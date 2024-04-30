package com.davidbrazilparker.plugins

import com.davidbrazilparker.module
import io.ktor.client.request.*
import io.ktor.server.testing.*
import kotlin.test.Test

class RoutingKtTest {

    @Test
    fun testGetArticles() = testApplication {
        application {
            module()
        }
        client.get("/articles").apply {
            TODO("Please write your test here")
        }
    }
}