package com.sogaa.system.service.businessfunctionrelation.dao;

import com.sogaa.system.service.businessfunctionrelation.bean.QuotationBase;
import com.sogaa.system.service.businessfunctionrelation.bean.QuotationBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuotationBaseMapper {
    int countByExample(QuotationBaseExample example);

    int deleteByExample(QuotationBaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(QuotationBase record);

    int insertSelective(QuotationBase record);

    List<QuotationBase> selectByExample(QuotationBaseExample example);

    QuotationBase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") QuotationBase record, @Param("example") QuotationBaseExample example);

    int updateByExample(@Param("record") QuotationBase record, @Param("example") QuotationBaseExample example);

    int updateByPrimaryKeySelective(QuotationBase record);

    int updateByPrimaryKey(QuotationBase record);
}