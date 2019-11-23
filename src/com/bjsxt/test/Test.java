package com.bjsxt.test;


import com.bjsxt.Util.Util;
import com.bjsxt.cigar.Sys_Reply;
import com.bjsxt.cigar.Sys_Topic;
import com.bjsxt.mapper.Sys_ReplyMapper;
import com.bjsxt.mapper.Sys_TopicMapper;
import org.apache.ibatis.session.SqlSession;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther: cigar
 * @Date: 2019/11/18 0018
 * @Description: com.bjsxt.test
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        int index = 0;
        System.out.println("---------欢迎来到sxt贴吧-----------");

        Scanner sc = new Scanner(System.in);
        int count = 2;
        int count1 = 1;
      while (true){
          SqlSession sqlSession = Util.getsqlSession();
          System.out.println("请选择你要对贴吧进行的操作；1、查询帖子；2、发表帖子；3、发表帖子评论；4、查看全部帖子和评论；5、退出贴吧");
          int i = sc.nextInt();
          switch (i){
              case 1 :
                  //查询帖子
                //  System.out.println("当前共有"+count+"条帖子");
                  index++;
                  Sys_TopicMapper mapper0 = sqlSession.getMapper(Sys_TopicMapper.class);
                  List<Sys_Topic> sys_topics0 = mapper0.queryAll();
                  for (Sys_Topic sysTopic :sys_topics0 ){

                      System.out.println(sysTopic.toAString());
                  }

                  sqlSession.close();


                  break;
              case 2 :
                  // 添加
                    count++;
                  Sys_TopicMapper mapper1 = sqlSession.getMapper(Sys_TopicMapper.class);
                  java.util.Date utilDate0 = new java.util.Date(); //获取当前时间
                  System.out.println("请输入标题");
                  String next = sc.next();
                  System.out.println("请输入内容");
                  String next1 = sc.next();

                  Sys_Topic sys_topic1 = new Sys_Topic( next, next1, "会飞的猪",new java.sql.Date(utilDate0.getTime()), 0);
                  int insert0 = mapper1.insert(sys_topic1);
                  sqlSession.commit();
                  System.out.println(insert0);
                  sqlSession.close();
                  break;
              case 3 :
                  //帖子评论
                  count1++;
                  Sys_ReplyMapper Reply = sqlSession.getMapper(Sys_ReplyMapper.class);
                  Sys_TopicMapper mapper = sqlSession.getMapper(Sys_TopicMapper.class);
                  java.util.Date utilDate1 = new java.util.Date(); //获取当前时间
                  System.out.println("请输入你要评论的帖子的编号");
                  int i1 = sc.nextInt();
                  int update = mapper.update(i1);
                  sqlSession.commit();
                  System.out.println(update);
                  System.out.println("请输入评论内容");
                  String next2 = sc.next();
                  Sys_Reply sys_reply = new Sys_Reply(i1,"渴望飞翔的猪", next2,new java.sql.Date(utilDate1.getTime()));
                  int insert1 = Reply.insert(sys_reply);
                  sqlSession.commit();
                  System.out.println(insert1);
                  sqlSession.close();
                  break;
              case 4 :
                  // 查询帖子  包括评论
                  Sys_TopicMapper mapper2 = sqlSession.getMapper(Sys_TopicMapper.class);
                  List<Sys_Topic> sys_topics1 = mapper2.selectAllN();
                  for (Sys_Topic topic:sys_topics1){
                      System.out.println(topic);
                        }
                  Sys_ReplyMapper ReplyMapper = sqlSession.getMapper(Sys_ReplyMapper.class);
                  Sys_TopicMapper TopicMapper = sqlSession.getMapper(Sys_TopicMapper.class);
                  List<Sys_Reply> sys_replies = ReplyMapper.queryAll();
                  for (Sys_Reply sys_reply1:sys_replies){
                      int topicid = sys_reply1.getTopicid();
                      Sys_Topic sys_topic = TopicMapper.selectByNo(topicid);
                      sys_reply1.setSys_Topic(sys_topic);
                  }
                  sqlSession.close();
                  break;
              case 5 :
                  System.out.println("--------欢迎再次光临尚学堂贴吧-----------");
                  return;
              default:
                  System.out.println("输入有误，即将退出");
                  Thread thread = new Thread();
                  for (int j = 0; j <10 ; j++) {
                      try {
                          thread.sleep(500);
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }
                      System.out.print(".");
                  }
                  System.out.println("退出");
                  return;

              }

          }



      }
    }

