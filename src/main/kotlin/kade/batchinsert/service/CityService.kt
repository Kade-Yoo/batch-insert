package kade.batchinsert.service

import kade.batchinsert.domain.City
import kade.batchinsert.repository.mapper.CityMapper
import org.springframework.stereotype.Service

@Service
class CityService(
    private val cityMapper: CityMapper
) {
    fun save(city: City) {
        cityMapper.insert(city)
    }

    fun findById(id: Long) = cityMapper.findById(id)
}