package com.xiayimo.boot.mapper;

import com.xiayimo.boot.model.BUser;

import java.util.Map;

public interface BUserMapper {
    public int deleteByPrimaryKey(Integer id);

    public int insert(BUser record);

    public int insertSelective(BUser record);

    public BUser selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(BUser record);

    public int updateByPrimaryKey(BUser record);

    public BUser selectByMap(Map<String,Object> map);
}