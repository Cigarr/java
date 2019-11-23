package com.bjsxt.mapper;

import com.bjsxt.cigar.Sys_Reply;
import com.bjsxt.cigar.Sys_Topic;

import java.util.List;

/**
 * @Auther: cigar
 * @Date: 2019/11/18 0018
 * @Description: com.bjsxt.mapper
 * @Version: 1.0
 */
public interface Sys_ReplyMapper {
    //添加评论
    public int insert(Sys_Reply sys_Reply);

    //查询全部帖子及评论
        //1、
    public List<Sys_Reply> selectByNoN(int topicid);

    //2、
    public List<Sys_Reply> queryAll();






}
