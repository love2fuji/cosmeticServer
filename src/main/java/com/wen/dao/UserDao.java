package com.wen.dao;

import com.wen.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author young
 * @since 2023-06-24
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
