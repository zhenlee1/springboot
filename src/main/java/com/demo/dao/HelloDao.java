package com.demo.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HelloDao {
    public String hello(String name);
}
