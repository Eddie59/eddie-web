package com.em.eddieweb.web;

import com.em.eddieweb.domain.Student;
import com.em.eddieweb.service.impl.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

/**
 * StudentContrller class
 *
 * @author Administrator
 * @date
 */
@Controller
@RequestMapping("/student")
public class StudentContrller {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentService service;

    @GetMapping("/list")
    public ModelAndView list() {
        logger.info("---------------------------------------------");
        List<Student> data = service.getStudentPage();
        return new ModelAndView("/student/list", "data", data);
    }

    @GetMapping("/add")
    public ModelAndView add(@ModelAttribute Student student) {
        return new ModelAndView("/student/update", "data", student);
    }

    @GetMapping("/update/{id}")
    public ModelAndView update(@PathVariable("id") Integer id) {
        Student student = service.getStudentById(id);
        return new ModelAndView("/student/update", "data", student);
    }

    @PostMapping("/update")
    public ModelAndView update(@Valid Student data, BindingResult result) {
        if (result.hasErrors()) {
            //不清楚为啥前端会报错，可以data为null，又使用了${data.id}???
            return new ModelAndView("/student/update", "errors", result.getAllErrors());
        }
        service.save(data);
        return new ModelAndView("redirect:/student/list");
    }

    @GetMapping(value = "/view/{id}")
    public ModelAndView view(@PathVariable Integer id) {
        Student student = service.getStudentById(id);
        return new ModelAndView("/student/view", "data", student);
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        service.delete(id);
        return "redirect:/student/list";
    }
}
