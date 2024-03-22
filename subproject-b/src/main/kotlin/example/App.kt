package example

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

fun main(args: Array<out String?>) {
    SpringApplicationBuilder(SpringBootConsoleApplication::class.java)
        .web(WebApplicationType.NONE)
        .run(*args);
}

@SpringBootApplication
open class SpringBootConsoleApplication : CommandLineRunner{
    override fun run(vararg args: String?) {
        if (args.isNotEmpty()) {
            args.filterNotNull().forEach {println(Library.hello(it)) }
        } else {
            println("No persons? Ok, I can suggest why https://www.youtube.com/watch?v=Fpu5a0Bl8eY")
        }
    }

}