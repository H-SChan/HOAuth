package io.hsc.hoauth

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HoAuthApplication

fun main(args: Array<String>) {
    runApplication<HoAuthApplication>(*args)
}
