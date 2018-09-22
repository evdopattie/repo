package com.itheima.service;

import com.itheima.domain.Items;

import java.util.List;

public interface ItemsService {

    public List<Items> findAll();

    public Items findById(int id);
}
