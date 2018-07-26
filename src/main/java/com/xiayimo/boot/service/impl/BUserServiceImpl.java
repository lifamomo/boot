package com.xiayimo.boot.service.impl;

import com.xiayimo.boot.mapper.BUserMapper;
import com.xiayimo.boot.model.BUser;
import com.xiayimo.boot.service.BUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Transactional
@Service
public class BUserServiceImpl implements BUserService {

    @Autowired
    private BUserMapper bUserMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(BUser record) {
        return 0;
    }

    @Override
    public int insertSelective(BUser record) {
        return 0;
    }

    @Override
    public BUser selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(BUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(BUser record) {
        return 0;
    }

    @Override
    public BUser selectByMap(Map<String, Object> map) {
        return bUserMapper.selectByMap(map);
    }
}
