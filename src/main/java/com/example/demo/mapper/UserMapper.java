package com.example.demo.mapper;


import com.example.demo.Bean.BeanUser;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.PathVariable;


//this is a mapper for manipulate the database transaction

@Mapper

public interface UserMapper {



    //search

    @Select("select * from table_one where id=#{id}")

    public BeanUser selectId(Integer id);

    @Select("select * from table_one where user_name=#{user_name}")

    public BeanUser selectName(String name);

    @Select("select * from table_one where user_name=#{username} AND pass_word=#{password}")
    BeanUser verify(@PathVariable("user_name") String username, @PathVariable("pass_word")String password );


    //delete

    @Delete("delete from table_one where id=#{id}")

    public int deleteId(Integer id);



    //insert

    @Insert("insert into table_one(id,user_name,pass_word,e_mail) values(#{id},#{user_name},#{pass_word},#{e_mail})")

    public int insertUser(BeanUser user);



    //update

    @Update("update table_one set user_name=#{user_name},pass_word=#{pass_word} where id=#{id}")

    public int UpdateBean(BeanUser user);


}