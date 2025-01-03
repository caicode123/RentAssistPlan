package com.caicode.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.caicode.lease.model.entity.ViewAppointment;
import com.caicode.lease.web.admin.mapper.ViewAppointmentMapper;
import com.caicode.lease.web.admin.service.ViewAppointmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicode.lease.web.admin.vo.appointment.AppointmentQueryVo;
import com.caicode.lease.web.admin.vo.appointment.AppointmentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author caicode
 * @description 针对表【view_appointment(预约看房信息表)】的数据库操作Service实现
 */
@Service
public class ViewAppointmentServiceImpl extends ServiceImpl<ViewAppointmentMapper, ViewAppointment>
        implements ViewAppointmentService {

    @Autowired
    private ViewAppointmentMapper viewAppointmentMapper;


    @Override
    public IPage<AppointmentVo> pageAppointment(Page<AppointmentVo> page, AppointmentQueryVo queryVo) {
        return viewAppointmentMapper.pageAppointment(page, queryVo);
    }
}




