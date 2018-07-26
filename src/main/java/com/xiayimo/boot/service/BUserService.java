package com.xiayimo.boot.service;

import com.xiayimo.boot.model.BUser;
import org.springframework.stereotype.Service;

import java.util.Map;


public interface BUserService {

    public int deleteByPrimaryKey(Integer id);

    public int insert(BUser record);

    public int insertSelective(BUser record);

    public BUser selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(BUser record);

    public int updateByPrimaryKey(BUser record);

    public BUser selectByMap(Map<String,Object> map);
}
