package com.company.project.dao;

import com.company.project.model.Shop;
import org.apache.ibatis.annotations.Param;


/**
 * @Auther: jiajingyu
 * @Date: 2020/8/18 11:26
 * @Description:
 */
public interface ShopDao   {
    Shop queryShop(@Param("id") Integer id);
}