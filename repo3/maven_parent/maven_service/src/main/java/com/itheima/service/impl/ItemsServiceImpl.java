package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService{

    @Resource
    private ItemsDao itemsDao;

    /**
     * 查询全部
     * @return
     */
    public List<Items> findAll(){
        return itemsDao.findAll();
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Items findById(int id){
        return itemsDao.findById(id);
    }

}
