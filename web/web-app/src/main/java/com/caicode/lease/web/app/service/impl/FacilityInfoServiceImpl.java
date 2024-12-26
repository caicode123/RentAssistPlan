package com.caicode.lease.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicode.lease.model.entity.FacilityInfo;
import com.caicode.lease.web.app.service.FacilityInfoService;
import com.caicode.lease.web.app.mapper.FacilityInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author caicode
* @description 针对表【facility_info(配套信息表)】的数据库操作Service实现
*/
@Service
public class FacilityInfoServiceImpl extends ServiceImpl<FacilityInfoMapper, FacilityInfo>
    implements FacilityInfoService{

}




