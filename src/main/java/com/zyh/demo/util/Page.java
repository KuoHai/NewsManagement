package com.zyh.demo.util;

import java.util.List;

/**
 * 关于分页的工具类
 * @author
 */
public class Page<E> {
    /**
     * 每页显示数量
     */
    private int pageSize = Constants.PAGESIZE;
    /**
     * 总记录数
     */
    private int totalCount;
    /**
     * 对应的分页数据集合
     */
    private List<E> rows;
    /**
     * 总页数
     */
    private int pageCount;

    /**
     * 起始页
     */
    private  int start;

    /**
     *  当前页
     * @return
     */
private int currPageNo;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCurrPageNo() {
        return currPageNo;
    }

    public void setCurrPageNo(int currPageNo) {
        this.currPageNo = currPageNo;
        this.start = (currPageNo-1)*pageSize;
    }

    public void setPageCount(int pageCount) {

        this.pageCount = pageCount;
    }
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        if (pageSize > 0){
            this.pageSize = pageSize;
        }
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        this.pageCount = (totalCount+pageSize-1)/pageSize;
    }

    public List<E> getRows() {
        return rows;
    }

    public void setRows(List<E> rows) {
        this.rows = rows;
    }

    public int getPageCount() {
        return pageCount;
    }

    /**
     * 设置总页数
     * 总页数 = （总记录数 + 每页显示数量 - 1）/每页显示数量
     */
    public void setPageCount() {
        this.pageCount = (totalCount+pageSize-1)/pageSize;
    }
}
