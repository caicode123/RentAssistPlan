package com.caicode.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicode.lease.model.entity.UserInfo;
import com.caicode.lease.web.admin.service.UserInfoService;
import com.caicode.lease.web.admin.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author caicode
* @description 针对表【user_info(用户信息表)】的数据库操作Service实现
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{

}




