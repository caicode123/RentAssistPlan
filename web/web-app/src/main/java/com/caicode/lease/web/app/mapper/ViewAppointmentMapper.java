package com.caicode.lease.web.app.mapper;

import com.caicode.lease.model.entity.ViewAppointment;
import com.caicode.lease.web.app.vo.appointment.AppointmentItemVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author caicode
* @description 针对表【view_appointment(预约看房信息表)】的数据库操作Mapper
* @Entity com.caicode.lease.model.entity.ViewAppointment
*/
public interface ViewAppointmentMapper extends BaseMapper<ViewAppointment> {

    List<AppointmentItemVo> listItemByUserId(Long userId);
}




