package com.book.mapper;

import com.book.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where username = #{text} or email = #{text}")
    Account findUserByUserName(@Param("text") String text);

}
