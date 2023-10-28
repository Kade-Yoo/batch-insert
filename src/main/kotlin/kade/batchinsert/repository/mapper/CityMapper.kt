package kade.batchinsert.repository.mapper

import kade.batchinsert.domain.City
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Options
import org.apache.ibatis.annotations.Select


@Mapper
interface CityMapper {

    @Insert("INSERT INTO city (id, name, state, country) VALUES(#{id}, #{name}, #{state}, #{country})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    fun insert(city: City)

    @Select("SELECT id, name, state, country FROM city WHERE id = #{id}")
    fun findById(id: Long): City
}