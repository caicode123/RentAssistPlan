package com.caicode.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.caicode.lease.model.entity.SystemPost;
import com.caicode.lease.model.entity.SystemUser;
import com.caicode.lease.web.admin.mapper.SystemPostMapper;
import com.caicode.lease.web.admin.mapper.SystemUserMapper;
import com.caicode.lease.web.admin.service.SystemUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicode.lease.web.admin.vo.system.user.SystemUserItemVo;
import com.caicode.lease.web.admin.vo.system.user.SystemUserQueryVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author caicode
 * @description 针对表【system_user(员工信息表)】的数据库操作Service实现
 */
@Service
public class SystemUserServiceImpl extends ServiceImpl<SystemUserMapper, SystemUser>
        implements SystemUserService {

    @Autowired
    private SystemUserMapper systemUserMapper;

    @Autowired
    private SystemPostMapper systemPostMapper;

    @Override
    public IPage<SystemUserItemVo> pageSystemUser(IPage<SystemUser> page, SystemUserQueryVo queryVo) {
        return systemUserMapper.pageSystemUser(page,queryVo);
    }

    @Override
    public SystemUserItemVo getSystemUserById(Long id) {
        //获取用户信息
        SystemUser systemUser = systemUserMapper.selectById(id);

        //获取用户的岗位信息
        SystemPost systemPost = systemPostMapper.selectById(systemUser.getPostId());

        //组装数据
        SystemUserItemVo systemUserItemVo = new SystemUserItemVo();

        BeanUtils.copyProperties(systemUser, systemUserItemVo);
        systemUserItemVo.setPostName(systemPost.getName());
        return systemUserItemVo;
    }
}




