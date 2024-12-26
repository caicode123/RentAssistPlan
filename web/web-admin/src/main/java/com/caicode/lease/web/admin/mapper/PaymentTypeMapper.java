package com.caicode.lease.web.admin.mapper;

import com.caicode.lease.model.entity.PaymentType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author caicode
 * @description 针对表【payment_type(支付方式表)】的数据库操作Mapper
 * @Entity com.caicode.lease.model.PaymentType
 */
public interface PaymentTypeMapper extends BaseMapper<PaymentType> {

    List<PaymentType> selectListByRoomId(Long id);
}




