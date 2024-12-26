package com.caicode.lease.web.app.service;

import com.caicode.lease.model.entity.PaymentType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author caicode
* @description 针对表【payment_type(支付方式表)】的数据库操作Service
*/
public interface PaymentTypeService extends IService<PaymentType> {
    List<PaymentType> listByRoomId(Long id);
}
