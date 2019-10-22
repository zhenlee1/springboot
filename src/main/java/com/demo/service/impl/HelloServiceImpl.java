package com.demo.service.impl;

import com.demo.dao.TaskTableDao;
import com.demo.domain.TaskTable;
import com.demo.domain.TaskTableExample;
import com.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private TaskTableDao taskTableDao;
    @Override
    public String hello(String name) {
            return name+" hello";
    }

    @Override
    public List<TaskTable> queryTaskTable(String name) {
        TaskTableExample example = new TaskTableExample();
        example.createCriteria().andTaskTableNameEqualTo(name);
        List<TaskTable> taskTables=taskTableDao.selectByExample( example );
        return taskTables;
    }
}
