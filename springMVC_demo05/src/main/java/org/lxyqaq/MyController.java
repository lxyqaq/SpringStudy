package org.lxyqaq;
/**
 * @ClassName org.lxyqaq.MyController
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/6 13:30
 * @Version 1.0
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import org.lxyqaq.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @RequestMapping: value ： 所有请求地址的公共部分，叫做模块名称
 * 位置： 放在类的上面
 */
@Controller
public class MyController {

    @RequestMapping(value = "/some")
    public ModelAndView doSome(HttpServletRequest request, String name, Integer age) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("myName", name);
        modelAndView.addObject("myAge", age);
        modelAndView.setViewName("show");
        return modelAndView;
    }

}