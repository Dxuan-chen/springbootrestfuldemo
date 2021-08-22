package com.demo.demo.mapper;

import com.demo.demo.domain.User;
import com.demo.demo.vo.Page;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IUserMapper {

    @Select("select * from user")
    List<User> findAll();

    @Insert("INSERT INTO user(`userName`, `passWord`, `phone`, `realName`, `sex`, `address`, `email`) " +
            "VALUES (#{userName}, #{passWord}, #{phone}, #{realName}, #{sex}, #{address}, #{email})")
    @Transactional
    void save(User user);

    @Update("update user set userName=#{userName},passWord=#{passWord},phone=#{phone}," +
            "realName=#{realName},sex=#{sex},address=#{address},email=#{email} where id=#{id}")
    @Transactional
    void updateById(User user);

    @Delete("delete from user where id = #{id}")
    void deleteById(Long id);

    @Select("select * from user limit #{offset},#{pageSize}")
    List<User> findByPage(Integer offset, Integer pageSize);

    @Select("select count(id) from user")
    Integer countUser();
}
