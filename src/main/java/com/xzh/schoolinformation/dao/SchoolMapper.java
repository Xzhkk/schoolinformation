package com.xzh.schoolinformation.dao;

import com.xzh.schoolinformation.pojo.School;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface SchoolMapper {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from school_information order by min_ranking and college")
    public List<School> selectAll();

    /**
     * 查询单个
     */
    @Select("select * from school_information where id=#{id}")
    School findById(@Param("id") int id);

    /**
     * 删除单条信息
     */
    @Delete("delete from school_information where id=#{id}")
    public void deleteByID(@Param("id") int id);

    /**
     * 新增信息
     */
    @Insert("insert into school_information (college,major_name,admission_persions,max_score,avg_score,min_score,min_ranking)" +
            "values (#{college},#{major_name},#{admission_persions},#{max_score},#{avg_score},#{min_score},#{min_ranking}) ")
    @Options(useGeneratedKeys=true,keyColumn="id")
    int addSchool(School school);

   @Update("update  school_information set college=#{college},major_name=#{major_name},admission_persions=#{admission_persions},max_score=#{max_score},avg_score=#{avg_score},min_score=#{min_score},min_ranking=#{min_ranking} where id=#{id}")
    public int updateSchool(School school);




}
