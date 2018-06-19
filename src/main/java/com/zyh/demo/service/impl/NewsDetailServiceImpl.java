package com.zyh.demo.service.impl;

import com.zyh.demo.dao.NewsDetailMapper;
import com.zyh.demo.entity.NewsDetail;
import com.zyh.demo.service.NewsDetailService;
import com.zyh.demo.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsDetailServiceImpl implements NewsDetailService {
    @Autowired
    NewsDetailMapper newsDetailMapper;

/*

    @Override
    public Page<NewsDetail> selectAllNews(int pageNo, int pageSize) {
        Page<NewsDetail> detailPage = new Page<>();
        detailPage.setPageNo(pageNo);
        detailPage.setPageSize(pageSize);
        detailPage.setTotalCount(newsDetailMapper.totalCount());
        detailPage.setRows(newsDetailMapper.selectAll());
        return detailPage;
    }
*/

    @Override
    public Page<NewsDetail> selectNewsByNewsTitle(String newsTitle, int pageNo, int pageSize) {
        Page<NewsDetail> detailPage = new Page<>();

        detailPage.setPageSize(pageSize);
        detailPage.setCurrPageNo(pageNo);

        detailPage.setTotalCount(newsDetailMapper.totalCount());

        int totalPageCount = detailPage.getPageCount();
        if (pageNo < 1) {
            detailPage.setCurrPageNo(1);
        } else if (pageNo > totalPageCount && totalPageCount!=0) {
            detailPage.setCurrPageNo(totalPageCount);
        }
        detailPage.setRows(newsDetailMapper.selectByNewsTitle(newsTitle, detailPage.getStart(), pageSize));
        return detailPage;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return newsDetailMapper.deleteByPrimaryKey(id);
    }


}