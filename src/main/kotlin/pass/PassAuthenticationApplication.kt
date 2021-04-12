package pass

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration
import org.springframework.boot.runApplication
import pass.test.KotlinBean
import javax.annotation.PostConstruct

@SpringBootApplication(
    exclude = [LiquibaseAutoConfiguration::class],
    scanBasePackageClasses = [KotlinBean::class, PassAuthenticationApplication::class]
)
class PassAuthenticationApplication(
    private val filter2: KotlinBean,
) {

    @PostConstruct
    fun test() {
        println("Hello ${filter2.greet("TIMMEY")}")
    }
}

@Suppress("SpreadOperator")
fun main(args: Array<String>) {
    runApplication<PassAuthenticationApplication>(*args)
}
