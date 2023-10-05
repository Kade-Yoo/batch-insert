package kade.batchinsert

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BatchInsertApplication

fun main(args: Array<String>) {
    runApplication<BatchInsertApplication>(*args)
}