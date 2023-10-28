package kade.batchinsert.service

import kade.batchinsert.domain.City
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(properties = ["spring.config.location=classpath:/application.yml"])
class CityServiceTest {

    @Autowired
    lateinit var cityService: CityService

    @Test
    fun save() {
        val city = City(name = "San Francisco", state = "CA", country = "US")
        cityService.save(city)
    }

    @Test
    fun findById() {
        val id = 1L

        val city = City(name = "San Francisco", state = "CA", country = "US")
        cityService.save(city)

        val city2 = City(name = "San Francisco", state = "CA", country = "US")
        cityService.save(city)

        val findById = city2.id.let { cityService.findById(it) }
        assertEquals(findById.id, 1L)
    }
}