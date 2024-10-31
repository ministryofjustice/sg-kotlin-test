package uk.gov.justice.digital.hmpps.sgkotlintest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SgKotlinTest

fun main(args: Array<String>) {
  runApplication<SgKotlinTest>(*args)
}
