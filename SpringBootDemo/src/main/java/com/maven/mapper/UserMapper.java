package com.maven.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.maven.domain.User;

@Mapper
public interface UserMapper {

	public List<User> findAllUser();
}
