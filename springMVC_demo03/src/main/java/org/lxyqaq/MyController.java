package org.lxyqaq;
/**
 * @ClassName org.lxyqaq.MyController
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/6 13:30
 * @Version 1.0
 */

import org.lxyqaq.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @RequestMapping:
 *    value ： 所有请求地址的公共部分，叫做模块名称
 *    位置： 放在类的上面
 */
@Controller
public class MyController {

    /**
     * @RequestMapping : 请求映射
     * 属性： method， 表示请求的方式。 它的值RequestMethod类枚举值。
     * 例如表示get请求方式， RequestMethod.GET
     * post方式， RequestMethod.POST
     * <p>
     * 你不用get方式，错误是：
     * HTTP Status 405 - Request method 'GET' not supported
     */
    //指定some.do使用get请求方式
    @RequestMapping(value = "/some.do", method = RequestMethod.GET)
    public ModelAndView doSome() { //doGet() -- service请求处理
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "欢迎使用springmvc做web开发");
        modelAndView.addObject("fun", "执行的是doSome()方法");
        modelAndView.setViewName("show");
        return modelAndView;
    }

    @RequestMapping(value = "/other.do", method = RequestMethod.POST)
    public ModelAndView doOther() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "--欢迎使用springmvc做web开发--");
        modelAndView.addObject("fun", "执行的是doOther方法");
        modelAndView.setViewName("other");
        return modelAndView;
    }

    @RequestMapping(value = "/first.do")
    public ModelAndView doFirst(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "====欢迎使用springmvc做web开发====" + request.getParameter("name"));
        modelAndView.addObject("fun", "执行的是doFirst方法");
        modelAndView.setViewName("other");
        return modelAndView;

    }

    /**
     * 请求中参数名和处理器方法的形参名不一样
     * @RequestParam: 逐个接收请求参数中， 解决请求中参数名形参名不一样的问题
     *      属性： 1. value 请求中的参数名称
     *            2. required 是一个boolean，默认是true
     *                true：表示请求中必须包含此参数。
     *      位置： 在处理器方法的形参定义的前面
     */
    @RequestMapping(value = "/receiveProperty.do")
    public ModelAndView doReceiveProperty(String name, String age) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("myName", name);
        modelAndView.addObject("myAge", age);
        modelAndView.setViewName("show");
        return modelAndView;

    }

    /**
     * 处理器方法形参是java对象， 这个对象的属性名和请求中参数名一样的
     * 框架会创建形参的java对象， 给属性赋值。 请求中的参数是name，框架会调用setName()
     * @return
     */
    @RequestMapping(value = "/receiveObject.do")
    public ModelAndView deReceiveObject(Student student) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("myName", student.getName());
        modelAndView.addObject("myAge", student.getAge());
        modelAndView.addObject("myStudent", student);
        modelAndView.setViewName("show");
        return modelAndView;
    }

}