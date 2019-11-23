package com.bjsxt.cigar;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Auther: cigar
 * @Date: 2019/11/18 0018
 * @Description: com.bjsxt.cigar
 * @Version: 1.0
 */
public class Sys_Topic {

    private int topicid;
    private String title;
    private String content;
    private String author;
    private Date createdate;
    private int clickamount;

    private List<Sys_Reply> sys_ReplyList;

    public Sys_Topic() {
    }

    public Sys_Topic(String title, String content, String author, Date createdate, int clickamount) {
      //  this.topicid = topicid;
        this.title = title;
        this.content = content;
        this.author = author;
        this.createdate = createdate;
        this.clickamount = clickamount;

    }

    public int getTopicid() {
        return topicid;
    }

    public void setTopicid(int topicid) {
        this.topicid = topicid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public int getClickamount() {
        return clickamount;
    }

    public void setClickamount(int clickamount) {
        this.clickamount = clickamount;
    }

    public List<Sys_Reply> getSys_replyList() {
        return sys_ReplyList;
    }

    public void setSys_replyList(List<Sys_Reply> sys_replyList) {
        this.sys_ReplyList = sys_replyList;
    }

    @Override
    public String toString() {
        return
                "贴子编号=" + topicid +
                ", 标题='" + title + '\'' +
                ", 内容='" + content + '\'' +
                ", 作者='" + author + '\'' +
                ", 发帖时间=" + new SimpleDateFormat("yyyy-MM-dd").format(createdate) +
                ", 点击量=" + clickamount +
                ", 评论=" + sys_ReplyList +
                "\n";
    }


public String toAString() {
        return "贴吧表{" +
                "贴子编号=" + topicid +
                ", 标题='" + title + '\'' +
                ", 内容='" + content + '\'' +
                ", 作者='" + author + '\'' +
                ", 发帖时间=" + new SimpleDateFormat("yyyy-MM-dd").format(createdate) +
                ", 点击量=" + clickamount +

                '}'+"\n";
    }
}
