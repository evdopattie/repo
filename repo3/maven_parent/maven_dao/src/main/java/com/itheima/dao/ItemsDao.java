package com.itheima.dao;

import com.itheima.domain.Items;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("itemsDao")
public interface ItemsDao {

    /**
     * 查询全部
     * @return
     */
    public List<Items> findAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
  public Items findById(int id);
}
