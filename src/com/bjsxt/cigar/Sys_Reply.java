package com.bjsxt.cigar;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: cigar
 * @Date: 2019/11/18 0018
 * @Description: com.bjsxt.cigar
 * @Version: 1.0
 */
public class Sys_Reply {

    private  int replyid;
    private int topicid;
    private String author;
    private String content;
    private Date createdate;

    private Sys_Topic sys_Topic;

    public Sys_Reply() {
    }

    public Sys_Reply( int topicid, String author, String content, Date createdate) {
       // this.replyid = replyid;
        this.topicid = topicid;
        this.author = author;
        this.content = content;
        this.createdate = createdate;

    }

    public int getReplyid() {
        return replyid;
    }

    public void setReplyid(int replyid) {
        this.replyid = replyid;
    }

    public int getTopicid() {
        return topicid;
    }

    public void setTopicid(int topicid) {
        this.topicid = topicid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Sys_Topic getSys_Topic() {
        return sys_Topic;
    }

    public void setSys_Topic(Sys_Topic sys_Topic) {
        this.sys_Topic = sys_Topic;
    }

    @Override
    public String toString() {
        return
                "评论编号=" + replyid +
                ", 贴子编号=" + topicid +
                ", 作者='" + author + '\'' +
                ", 内容='" + content + '\'' +
                ", 发表时间=" + new SimpleDateFormat("yyyy-MM-dd").format(createdate) +
               " \n"

               ;
    }
}
