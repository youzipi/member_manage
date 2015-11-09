package com.model;

import com.dao.UserDao;
import com.entity.User;
import com.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * project_name:member_manage
 * package_name:model
 * user: youzipi
 * date: 15-11-9 下午1:38
 */
public class UserModel extends User {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static {
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSession() {
        return sqlSessionFactory;
    }

    public static void main(String[] args) {

        sqlSessionFactory.getConfiguration().addMapper(UserMapper.class);
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserDao userDao = session.getMapper(UserDao.class);
//            User user = userDao.selectById(1);
//            System.out.println(user);
        } finally {
            session.close();
        }
    }

}
