package com.dao;

import com.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * project_name:member_manage
 * package_name:com.dao
 * user: youzipi
 * date: 15-11-9 下午5:20
 */
@Repository
public class UserDao {
    private SqlSession sqlSession;

    public List<User> findAll() {
        return this.sqlSession.selectList("find-all-farmers");
    }
}
