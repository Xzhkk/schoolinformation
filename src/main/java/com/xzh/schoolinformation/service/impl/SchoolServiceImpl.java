package com.xzh.schoolinformation.service.impl;

import com.github.pagehelper.PageHelper;
import com.xzh.schoolinformation.dao.SchoolMapper;
import com.xzh.schoolinformation.pojo.School;
import com.xzh.schoolinformation.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SchoolServiceImpl  implements SchoolService {

    @Autowired
    @SuppressWarnings("all")
    SchoolMapper schoolMapperl;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<School> findAll(int page,int size) {
        PageHelper.startPage(page,size);
        return schoolMapperl.selectAll();
    }

    /**
     * 查询单个
     * @param id
     * @return
     */
    @Override
    public School findById(int id) {
        return schoolMapperl.findById(id);
    }

    /**
     * 删除单个
      * @param id
     */
    @Override
    @Transactional
    public void deleteById(Integer id) {
       schoolMapperl.deleteByID(id);
    }

    /**
     * 插入操作
     * @param school
     * @return
     */
    @Override
    @Transactional
    public int addSchool(School school) {
        return schoolMapperl.addSchool(school);
    }

    @Override
    @Transactional
    public int saveSchool(School school) {
        return schoolMapperl.updateSchool(school);

    }


}
