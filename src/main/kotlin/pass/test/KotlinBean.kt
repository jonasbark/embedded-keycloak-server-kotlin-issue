package pass.test

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class KotlinBean {
    fun greet(username: String?) {
        log.info("Hello {}", username)
    }

    companion object {
        private val log = LoggerFactory.getLogger(KotlinBean::class.java)
    }
}