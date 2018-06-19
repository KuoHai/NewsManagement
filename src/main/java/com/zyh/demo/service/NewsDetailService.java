package com.zyh.demo.service;

import com.zyh.demo.entity.NewsComment;
import com.zyh.demo.entity.NewsDetail;
import com.zyh.demo.util.Page;

import java.util.List;

public interface NewsDetailService {
    /**
     * 查询帖子集合
     *
     * @param newsTitle 模糊查询名称
     * @return 模糊查询帖子集合
     */
    Page<NewsDetail> selectNewsByNewsTitle(String newsTitle, int pageNo, int pageSize);

    //    Page<NewsDetail> selectAllNews(int pageNo, int pageSize);



    int deleteByPrimaryKey(Integer id);
}
