package com.company.project.service;

import com.company.project.core.Service;
import com.company.project.model.Shop;
import com.company.project.model.ShopExample;

import java.util.List;


/**
 * Created by jiajingyu on 2020/08/18.
 */
public interface ShopService extends Service<Shop> {

    List<Shop> findByExample(ShopExample tShopExample );

    Shop queryShop(Integer id);
}
