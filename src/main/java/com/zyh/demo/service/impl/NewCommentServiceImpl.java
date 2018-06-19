package com.zyh.demo.service.impl;

import com.zyh.demo.dao.NewsCommentMapper;
import com.zyh.demo.entity.NewsComment;
import com.zyh.demo.service.NewsCommentService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewCommentServiceImpl implements NewsCommentService {

    @Autowired
    private NewsCommentMapper mapper;

    private static Logger logger = (Logger) LoggerFactory.getLogger(NewCommentServiceImpl.class);


    @Override
    public int insertSelective(NewsComment record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<NewsComment> findByNewsId(int newsId) {
        return mapper.findByNewsId(newsId);
    }

    @Override
    public NewsComment findCommentById(int id) {
       return mapper.findCommentById(id);
    }
}
