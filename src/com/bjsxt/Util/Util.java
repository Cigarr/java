package com.bjsxt.Util;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther: cigar
 * @Date: 2019/11/15 0015
 * @Description: com.bjsxt.Util
 * @Version: 1.0
 */
public class Util {
    public static SqlSession getsqlSession(){
        SqlSession  sqlSession = null;
        try {

            InputStream inputStream = Resources.getResourceAsStream("jdbc.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = factory.openSession();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession;
    }

}
