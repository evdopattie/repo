package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Resource
    private ItemsService itemsService;

    @RequestMapping("/findById")
    public String findById(HttpServletRequest request , int id){
        Items items= itemsService.findById(id);
        request.setAttribute("item",items);
        return "itemDetail";
    }


    @RequestMapping("/findAll")
    public String findAll(HttpServletRequest request){
        List<Items> itemsList = itemsService.findAll();
        request.setAttribute("itemsList",itemsList);
        return "itemsList";

    }

}
