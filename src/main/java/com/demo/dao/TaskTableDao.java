package com.demo.dao;

import java.util.HashMap;
import java.util.List;

import com.demo.domain.TaskTable;
import com.demo.domain.TaskTableExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface TaskTableDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    int countByExample(TaskTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    int deleteByExample(TaskTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    int deleteByPrimaryKey(Integer taskTableId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    int insert(TaskTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    int insertSelective(TaskTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    List<TaskTable> selectByExample(TaskTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    TaskTable selectByPrimaryKey(Integer taskTableId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    int updateByExampleSelective(@Param("record") TaskTable record, @Param("example") TaskTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    int updateByExample(@Param("record") TaskTable record, @Param("example") TaskTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    int updateByPrimaryKeySelective(TaskTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    int updateByPrimaryKey(TaskTable record);
    
    //获取所有要核查的数据表
  	public List<TaskTable> queryTaskTable();
    
  	//通过表确定所在数据源
  	public HashMap getTaskDbByTableId(int taskTableId);
  	
  	//根据name获取要核查的数据表
  	public List<TaskTable> getTaskTableByName(@Param("taskTableName") String taskTableName, @Param("taskDbId") int taskDbId);

    //分页获取用户信息
  	public List<TaskTable> queryTaskTablePageList(HashMap paraMap);

  	public Integer queryTaskTableCount(TaskTable record);


  	//根据核查对象获取所有要核查的数据表
  	public List<TaskTable> queryTaskTableByDB(int taskDbId);

  	//新增数据库下要核查的表 只改动关联关系
  	public void addTDB(@Param("taskTableId") int taskTableId, @Param("taskDbId") int taskDbId);

  	//删除数据库下要核查的数据表 只删除关联关系
  	public void delTDB(@Param("taskTableId") int taskTableId, @Param("taskDbId") int taskDbId);
    
  	//删除数据库时删除与之关联的表的关联关系
  	public void delTableByDb(int taskDbId);
  	
  	//分页获取用户信息
  	public List<TaskTable> queryTaskTablePageListByDb(HashMap paraMap); 
  	
  	public Integer queryTaskTableCountByDb(HashMap paraMap);
    
  	public List<HashMap> queryAllTablesByDb(Integer taskDbId);
}