package com.example.plugins

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.response.*

fun Application.configureStatusPage() {
    install(StatusPages) {
        status(HttpStatusCode.NotFound) {
            call.respond(
                message = "Page not Found",
                status = HttpStatusCode.NotFound
            )
        }
//        exception<AuthenticationException> {
//            call.respond(
//                message = "We caught an exception",
//                status = HttpStatusCode.OK
//            )
//        }
    }
}