package com.caicode.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicode.lease.model.entity.ApartmentLabel;
import com.caicode.lease.web.admin.service.ApartmentLabelService;
import com.caicode.lease.web.admin.mapper.ApartmentLabelMapper;
import org.springframework.stereotype.Service;

/**
* @author caicode
* @description 针对表【apartment_label(公寓标签关联表)】的数据库操作Service实现
*/
@Service
public class ApartmentLabelServiceImpl extends ServiceImpl<ApartmentLabelMapper, ApartmentLabel>
    implements ApartmentLabelService{

}




