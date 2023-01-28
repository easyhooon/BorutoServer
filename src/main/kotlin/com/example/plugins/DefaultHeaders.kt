package com.example.plugins

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import java.time.Duration

//the reason why we are able to see those images in our application even when our server is down
//is all because of that caching header
//this header is important because it will tell our http client that we want cache our data
//defaultHeader 를 지우면(CacheControl) 서버가 구동중이지 않을때 데이터를 불러올 수 없음
//then our httpclient will not cache those images
//이 헤더를 넣어줌으로서 image들을 cache 할 수 잇어 인터넷 연결이 안되거나, 서버가 다운된 상태에서도 image를 앱에서 보여줄 수 있음
fun Application.configureDefaultHeaders() {
    install(DefaultHeaders) {
        val oneYearInSeconds = Duration.ofDays(365).seconds
        header(
            name = HttpHeaders.CacheControl,
            value = "public, max-age=$oneYearInSeconds, immutable"
        )
    }
}