package com.zyh.demo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * news_comment
 * @author
 *
 */
public class NewsComment implements Serializable {
    /**
     * 评论编号
     */
    private Integer id;

    /**
     * 新闻编号
     */
    private Integer newsid;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论人
     */
    private String author;

    /**
     * 评论时间
     */
    private Date createDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NewsComment)) {
            return false;
        }
        NewsComment comment = (NewsComment) o;
        return Objects.equals(id, comment.id) &&
                Objects.equals(newsid, comment.newsid) &&
                Objects.equals(content, comment.content) &&
                Objects.equals(author, comment.author) &&
                Objects.equals(createDate, comment.createDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, newsid, content, author, createDate);
    }

    public Integer getNewsid() {

        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "NewsComment{" +
                "id=" + id +
                ", newsid=" + newsid +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}