package ru.javabegin.micro.planner.plannerconfig

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
open class PlannerConfigApplication

fun main(args: Array<String>) {
        runApplication<PlannerConfigApplication>(*args)
}

