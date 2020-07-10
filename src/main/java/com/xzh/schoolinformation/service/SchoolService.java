package com.xzh.schoolinformation.service;

import com.xzh.schoolinformation.pojo.School;

import java.util.List;

public interface SchoolService {
    /**
     * 查询所有
     * @return
     */
    public List<School> findAll(int page,int size);

    /**
     * 查询单个
     */
    public School findById(int id);

    /**
     * 删除单个
     */
    public void deleteById(Integer id);

    /**
     * 插入信息
     */
    public int addSchool(School school);

    /**
     * 修改信息
     */
    public int saveSchool(School school);
}
