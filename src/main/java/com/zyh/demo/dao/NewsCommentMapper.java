package com.zyh.demo.dao;

import com.zyh.demo.entity.NewsComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewsComment record);

    int insertSelective(NewsComment record);

    NewsComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsComment record);

    void save(NewsComment comment);

    int updateByPrimaryKey(NewsComment record);


    NewsComment findCommentById( int id);

    List<NewsComment> findByNewsId(int newsId);
}