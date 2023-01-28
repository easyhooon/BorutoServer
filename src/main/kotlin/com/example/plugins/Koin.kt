package com.example.plugins

import com.example.di.koinModule
import io.ktor.application.*
import org.koin.ktor.ext.Koin


fun Application.configureKoin() {
    install(Koin){
        //comment out 주석 처리 version Update not use this logger anymore
        //slf4jLogger()
        modules(koinModule)
    }
}