package com.bjsxt.mapper;

import com.bjsxt.cigar.Sys_Topic;

import java.util.List;

/**
 * @Auther: cigar
 * @Date: 2019/11/18 0018
 * @Description: com.bjsxt.mapper
 * @Version: 1.0
 */
public interface Sys_TopicMapper {

    //写帖子
    public int insert(Sys_Topic sys_Topic);

    //查全部帖子
    public List<Sys_Topic> queryAll();


    public List<Sys_Topic> selectAllN();

    //2、
    public Sys_Topic selectByNo(int topicid);

    public int update(int topicid);

}































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































