package com.wen.service.impl;

import com.wen.entity.User;
import com.wen.dao.UserDao;
import com.wen.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author young
 * @since 2023-06-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
