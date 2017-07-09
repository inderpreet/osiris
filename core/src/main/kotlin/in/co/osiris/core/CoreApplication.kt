package `in`.co.osiris.core

import `in`.co.osiris.core.tutes.ClassesRunner
import `in`.co.osiris.core.tutes.ControlFlowRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class CoreApplication {

}

fun main(args: Array<String>) {
    SpringApplication.run(CoreApplication::class.java, *args)
    ControlFlowRunner.run()
    ClassesRunner.run()
}