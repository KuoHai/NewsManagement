package com.zyh.demo.service;

import com.zyh.demo.dao.NewsCommentMapper;
import com.zyh.demo.entity.NewsComment;
import org.springframework.beans.factory.annotation.Autowired;
import sun.dc.pr.PRError;

import java.util.List;

public interface NewsCommentService {

    int insertSelective(NewsComment record);


    List<NewsComment> findByNewsId(int newsId);

    NewsComment findCommentById(int id);


}
