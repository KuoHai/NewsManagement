package com.zyh.demo.web;

import com.zyh.demo.entity.NewsDetail;
import com.zyh.demo.service.NewsDetailService;
import com.zyh.demo.util.Constants;
import com.zyh.demo.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author zyh
 */
@Controller
@RequestMapping
public class NewsDetailController {

    @Autowired
    private NewsDetailService newsDetailService;

    @RequestMapping(value = "/news")
    public String findAllNews(Integer pageNo, Model model,
                              String newsTitle) {
        if (pageNo == null) {
            pageNo = 1;
        }
        Page<NewsDetail> news = newsDetailService.selectNewsByNewsTitle(newsTitle, pageNo, Constants.PAGESIZE);

        model.addAttribute("pageNum", news);
        if (newsTitle != null) {
            model.addAttribute("newsTitle", newsTitle);
        }

        return "news";
    }

    @RequestMapping(value = "/delete")
    public String deleteById (int id  , Model model){
        newsDetailService.deleteByPrimaryKey(id);
        model.addAttribute("id",id);
        return "redirect:news";
    }
}
