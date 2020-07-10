package com.xzh.schoolinformation;

import com.sun.javafx.collections.SetListenerHelper;
import com.xzh.schoolinformation.pojo.School;
import com.xzh.schoolinformation.service.SchoolService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SchoolinformationApplicationTests {
    @Autowired
    private SchoolService schoolService;

    @Test
    public void testFindAll(){
        List<School> all = schoolService.findAll(1,1);
        System.out.println(all);

    }

    @Test
    public void testFindById(){
        School school=schoolService.findById(50);
        System.out.println(school);
    }

    @Test
    public void testDeleteById(){
        schoolService.deleteById(53);
    }

    @Test
     public void testAdd(){
        School school=new School();
        school.setCollege("轻化工学院");
        school.setMajor_name("食品科学与工程学院");
        school.setAdmission_persions(72);
        school.setMax_score(543);
        school.setAvg_score(528);
        school.setMin_score(522);
        school.setMin_ranking(50273);
        schoolService.addSchool(school);


        School school1 = schoolService.findById(54);
        System.out.println(school1);


    }





}
