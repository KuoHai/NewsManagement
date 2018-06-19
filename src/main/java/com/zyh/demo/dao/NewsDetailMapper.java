package com.zyh.demo.dao;

import com.zyh.demo.entity.NewsDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewsDetail record);

    int insertSelective(NewsDetail record);

    NewsDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsDetail record);

    int updateByPrimaryKey(NewsDetail record);

    List<NewsDetail> selectByNewsTitle (@Param("newsTitle")String likeTitle,@Param("start") int start,@Param("pageSize") int pageSize);

    List<NewsDetail> selectAll();

    int  totalCount ();
}