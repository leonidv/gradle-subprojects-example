package example

import io.github.oshai.kotlinlogging.KotlinLogging
import org.apache.commons.lang3.StringUtils

class Library {
    companion object {
        private val log = KotlinLogging.logger {  };
        fun hello(name : String) {
            log.info { StringUtils.capitalize(name) }
        }
    }
}