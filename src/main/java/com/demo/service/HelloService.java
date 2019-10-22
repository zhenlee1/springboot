package com.demo.service;

import com.demo.domain.TaskTable;

import java.util.List;

public interface HelloService {
    public String hello(String name);
    public List<TaskTable> queryTaskTable(String name);
}
