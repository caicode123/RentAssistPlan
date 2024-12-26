package com.caicode.lease.web.app.mapper;

import com.caicode.lease.model.entity.PaymentType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author caicode
* @description 针对表【payment_type(支付方式表)】的数据库操作Mapper
* @Entity com.acaicode.lease.model.entity.PaymentType
*/
public interface PaymentTypeMapper extends BaseMapper<PaymentType> {

    List<PaymentType> selectByRoomId(Long id);
}




