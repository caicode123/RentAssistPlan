package com.caicode.lease.web.app.service;

import com.caicode.lease.model.entity.ViewAppointment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.caicode.lease.web.app.vo.appointment.AppointmentDetailVo;
import com.caicode.lease.web.app.vo.appointment.AppointmentItemVo;

import java.util.List;

/**
* @author caicode
* @description 针对表【view_appointment(预约看房信息表)】的数据库操作Service
*/
public interface ViewAppointmentService extends IService<ViewAppointment> {
    List<AppointmentItemVo> listItemByUserId(Long userId);

    AppointmentDetailVo getDetailById(Long id);
}
