package com.ln.service;

import com.ln.dao.dwglMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by ln on 2017/9/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//这个是用来加载写好的配置文件，传入的值是数组形式多个配置文件如下 {"····","·······"}
@ContextConfiguration({"classpath:spring/spring-dao-config.xml"})
public class dwglserviceTest {
    @Autowired
    private dwglMapper dwglMapper;
    @Test
    public void getDwmc() throws Exception {
        int bh= 5744;
        String dwmc = dwglMapper.selectByPrimaryKey(bh).getDwmc();
        System.out.println(dwmc);
    }

}