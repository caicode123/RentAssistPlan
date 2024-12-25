package com.caicode.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.caicode.lease.model.entity.SystemUser;
import com.caicode.lease.web.admin.mapper.SystemUserMapper;
import com.caicode.lease.web.admin.service.SystemUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicode.lease.web.admin.vo.system.user.SystemUserItemVo;
import com.caicode.lease.web.admin.vo.system.user.SystemUserQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author caicode123
 * @description 针对表【system_user(员工信息表)】的数据库操作Service实现
 */
@Service
public class SystemUserServiceImpl extends ServiceImpl<SystemUserMapper, SystemUser>
        implements SystemUserService {

    @Autowired
    private SystemUserMapper systemUserMapper;

    @Override
    public IPage<SystemUserItemVo> pageSystemUser(IPage<SystemUser> page, SystemUserQueryVo queryVo) {
        return systemUserMapper.pageSystemUser(page,queryVo);
    }
}




