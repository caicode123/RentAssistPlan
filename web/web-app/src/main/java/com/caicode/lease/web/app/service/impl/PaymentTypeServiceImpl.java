package com.caicode.lease.web.app.service.impl;

import com.caicode.lease.model.entity.PaymentType;
import com.caicode.lease.web.app.mapper.PaymentTypeMapper;
import com.caicode.lease.web.app.service.PaymentTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author caicode
* @description 针对表【payment_type(支付方式表)】的数据库操作Service实现
*/
@Service
public class PaymentTypeServiceImpl extends ServiceImpl<PaymentTypeMapper, PaymentType>
    implements PaymentTypeService{

}




