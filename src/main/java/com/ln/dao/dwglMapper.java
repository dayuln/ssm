package com.ln.dao;

import com.ln.model.dwgl;

public interface dwglMapper {
    int deleteByPrimaryKey(Integer bh);

    int insert(dwgl record);

    int insertSelective(dwgl record);

    dwgl selectByPrimaryKey(Integer bh);

    int updateByPrimaryKeySelective(dwgl record);

    int updateByPrimaryKey(dwgl record);
}