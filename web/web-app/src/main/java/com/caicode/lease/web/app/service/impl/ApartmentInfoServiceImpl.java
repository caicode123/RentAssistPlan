package com.caicode.lease.web.app.service.impl;

import com.caicode.lease.model.entity.ApartmentInfo;
import com.caicode.lease.web.app.mapper.ApartmentInfoMapper;
import com.caicode.lease.web.app.service.ApartmentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author caicode
 * @description 针对表【apartment_info(公寓信息表)】的数据库操作Service实现
 */
@Service
public class ApartmentInfoServiceImpl extends ServiceImpl<ApartmentInfoMapper, ApartmentInfo>
        implements ApartmentInfoService {
}




