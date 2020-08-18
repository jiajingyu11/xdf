package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Shop;
import com.company.project.model.ShopExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMapper<T> extends Mapper<T> {
    long countByExample(ShopExample example);

    int deleteByExample(ShopExample example);

    List<Shop> selectByExample(ShopExample example);

    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);
}