package com.example.demo.mapper;


import com.example.demo.bean.BeanUser;
import org.apache.ibatis.annotations.*;



//this is a mapper for manipulate the database transaction

@Mapper

public interface UserMapper {



    //search

    @Select("select * from table_one where id=#{id}")

    public BeanUser selectId(Integer id);



    //delete

    @Delete("delete from table_one where id=#{id}")

    public int deleteId(Integer id);



    //insert

    @Insert("insert into table_one(user_name,pass_word, e_email) values(#{user_name},#{pass_word},#{e_mail})")

    public int insertUser(BeanUser user);



    //update

    @Update("update table_one set user_name=#{user_name},pass_word=#{pass_word} where id=#{id}")

    public int UpdateBean(BeanUser user);

}