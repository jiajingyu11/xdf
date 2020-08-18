package com.company.project.service.impl;

import com.company.project.core.AbstractService;
import com.company.project.dao.ShopDao;
import com.company.project.dao.ShopMapper;
import com.company.project.model.Shop;
import com.company.project.model.ShopExample;
import com.company.project.service.ShopService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jiajingyu on 2020/08/18.
 */
@Service
@Transactional
public class ShopServiceImpl extends AbstractService<Shop> implements ShopService {

    @Resource
    private ShopDao shopDao;
    @Resource
    private ShopMapper shopMapper;

    public List<Shop> findByExample(ShopExample tShopExample) {
        return shopMapper.selectByExample(tShopExample);
    }

    @Override
    public Shop queryShop(Integer id) {
        return shopDao.queryShop(id);
    }

}
