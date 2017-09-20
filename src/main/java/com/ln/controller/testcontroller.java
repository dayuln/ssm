package com.ln.controller;

import com.ln.dao.dwglMapper;
import com.ln.model.dwgl;
import com.ln.service.dwglservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ln on 2017/9/13.
 */
@Controller
public class testcontroller {
//    @Autowired
//    private dwglMapper dwglMapper;
    @Resource
    private dwglservice dwglservice;
    /***
     * value表示在浏览器输入的地址如：http://localhost:8080/simple-demo/demo
     * method可以不写，默认为GET，当处理POST请求时必须要写method = RequestMethod.POST，否则找不到地址
     *
     * @return 返回的是页面的地址，在配置文件InternalResourceViewResolver中配置prefix和suffix相当于最后返回/WEB-INF/jsp/demo1.jsp
     */
    @ResponseBody
    @RequestMapping(value = "/simple-demo/demo",method = RequestMethod.GET)
    public String demo1View(HttpServletRequest request, Model model){
        String dwmc=dwglservice.getDwmc();
        List<dwgl> temp=new ArrayList<dwgl>();
        dwgl temp1=new dwgl();
        dwgl temp2=new dwgl();
        temp1.setLft(123);
        temp1.setRgt(456);
        temp2.setLft(789);
        temp2.setRgt(111);
        temp.add(temp1);
        temp.add(temp2);
        model.addAttribute("accountList",temp);
        return "demo1";
    }
}
