package com.github.chipmunk.chipmunk

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChipmunkApplication

fun main(args: Array<String>) {
	runApplication<ChipmunkApplication>(*args)
}
