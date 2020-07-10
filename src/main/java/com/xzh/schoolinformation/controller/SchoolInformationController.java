package com.xzh.schoolinformation.controller;

import com.github.pagehelper.PageInfo;
import com.xzh.schoolinformation.pojo.School;
import com.xzh.schoolinformation.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/school")
public class SchoolInformationController {
    @Autowired
    SchoolService schoolService;

    @GetMapping("/findAll.do")
    public String findSchoolsAll(@RequestParam(name = "page",required = true,defaultValue = "1")Integer page,
                                 @RequestParam(name = "size",required = true,defaultValue = "10")Integer size,
                                 Model model){
        List<School> list=schoolService.findAll(page,size);
        PageInfo<School> pageInfo=new PageInfo(list);
       model.addAttribute("pageInfo",pageInfo);
         return  "showSchoolList";
    }

    @PostMapping("/save.do")
    public String saveSchool( School school){
          schoolService.addSchool(school);
           return "redirect:/school/findAll.do";

    }
    @PostMapping("/update.do")
    public String updateSchool(School school,Integer id,Model model){
        School s3 = schoolService.findById(id);
        s3.setMajor_name(school.getMajor_name());
        s3.setMin_ranking(school.getMin_ranking());
        s3.setMin_score(school.getMin_score());
        s3.setAvg_score(school.getAvg_score());
        s3.setMax_score(school.getMax_score());
        s3.setCollege(school.getCollege());
        s3.setAdmission_persions(school.getAdmission_persions());
        schoolService.saveSchool(school);

        return "redirect:/school/findAll.do";
    }
    @GetMapping("/findById.do")
    public String findById(@RequestParam("id") Integer id,Model model){
        School schoolOne = schoolService.findById(id);
        model.addAttribute("upSchool",schoolOne);
        return "school_update";
    }

    @GetMapping("/deleteById.do")
    public String deleteById(@RequestParam("id") Integer id){
        schoolService.deleteById(id);
        return "redirect:/school/findAll.do";
    }
}
