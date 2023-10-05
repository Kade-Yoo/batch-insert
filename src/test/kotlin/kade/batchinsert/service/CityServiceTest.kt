package kade.batchinsert.service

import kade.batchinsert.domain.City
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
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
        val city = cityService.findById(id)
        assertEquals(city.id, 1L)
    }
}