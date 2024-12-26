package com.caicode.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicode.lease.model.entity.ApartmentFacility;
import com.caicode.lease.web.admin.service.ApartmentFacilityService;
import com.caicode.lease.web.admin.mapper.ApartmentFacilityMapper;
import org.springframework.stereotype.Service;

/**
* @author caicode
* @description 针对表【apartment_facility(公寓&配套关联表)】的数据库操作Service实现
*/
@Service
public class ApartmentFacilityServiceImpl extends ServiceImpl<ApartmentFacilityMapper, ApartmentFacility>
    implements ApartmentFacilityService{

}




