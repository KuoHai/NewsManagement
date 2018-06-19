package com.zyh.demo.web;

import com.zyh.demo.entity.NewsComment;
import com.zyh.demo.service.NewsCommentService;
import com.zyh.demo.service.NewsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.xml.stream.events.Comment;
import java.util.List;

/**
 * 回复相关控制器
 *
 * @author zyh
 */
@Controller
public class NewsCommentController {

    @Autowired
    private NewsCommentService service;
//
//    @RequestMapping("/comment")
//    public ModelAndView findCommentByNewSId(int id) {
//        ModelAndView mv = new ModelAndView("comment");
//        System.out.println(id);
//        List<NewsComment> comments = service.findByNewsId(id);
//        mv.addObject("comment", comments);
//        return mv;
//    }

    @RequestMapping("/comments")
    public String findCommentByNewsId(
            int id, Model model) {
        List<NewsComment> comments = service.findByNewsId(id);
        model.addAttribute("comment", comments);
        return "comment";
    }

    /**
     * 跳转到新增回复页面
     *
     * @param id    对应的新闻ID
     * @param model
     * @return
     */
    @RequestMapping(value = "toAdd", method = RequestMethod.GET)
    public String goAddComment(
            int id, Model model) {
        model.addAttribute("id", id);
        return "add";
    }

    /*@RequestMapping(value = "/comment/{id}", method = RequestMethod.GET)
    public String goUpdateComment(@PathVariable int id, Model model) {
        model.addAttribute(service.findCommentById(id));
        return "comment";
    }
*/

  /*  @RequestMapping(value = "/add")
    public String addComment(
            @RequestParam("id")
           int newsId, Model model) {
        model.addAttribute("newsId",newsId);
        return "add";
    }*/


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addCom(
            NewsComment comment, Model model) {
        service.insertSelective(comment);
        List<NewsComment> comments = service.findByNewsId(comment.getNewsid());
        model.addAttribute("comment",comments);
        return "comment";
    }

}

