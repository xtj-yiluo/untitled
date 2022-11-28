package com.sogaa.system.dao.mapper;

import com.sogaa.system.bean.person;

import java.util.List;

import com.sogaa.system.bean.personExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("personMapper")
public interface personMapper {
    int countByExample(personExample example);

    int deleteByExample(personExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(person record);

    int insertSelective(person record);

    List<person> selectByExample(personExample example);

    person selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") person record, @Param("example") personExample example);

    int updateByExample(@Param("record") person record, @Param("example") personExample example);

    int updateByPrimaryKeySelective(person record);

    int updateByPrimaryKey(person record);
}