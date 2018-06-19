package com.zyh.demo.web;

import com.alibaba.fastjson.JSON;
import com.zyh.demo.dao.NewsCommentMapper;
import com.zyh.demo.dao.NewsDetailMapper;
import com.zyh.demo.entity.NewsComment;
import com.zyh.demo.entity.NewsDetail;
import com.zyh.demo.service.NewsDetailService;
import com.zyh.demo.util.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class NewsDetailControllerTest {

    @Autowired
    private NewsCommentMapper dao;

    @Autowired
    private NewsDetailService service;
    @Test
    public void findAllNews() {
        List<NewsComment> list = dao.findByNewsId(1);
        System.out.println(JSON.toJSONString(list));
    }
}