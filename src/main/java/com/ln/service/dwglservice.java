package com.ln.service;

import com.ln.dao.dwglMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ln on 2017/9/13.
 */
@Service
public class dwglservice {
    @Autowired
    private dwglMapper dwglMapper;

    @Transactional
    public String getDwmc(){
        int bh=5744;
        String dwmc=dwglMapper.selectByPrimaryKey(bh).getDwmc();
        return dwmc;
    }
}
