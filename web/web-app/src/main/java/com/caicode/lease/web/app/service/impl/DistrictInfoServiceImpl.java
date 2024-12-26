package com.caicode.lease.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicode.lease.model.entity.DistrictInfo;
import com.caicode.lease.web.app.service.DistrictInfoService;
import com.caicode.lease.web.app.mapper.DistrictInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author caicode
* @description 针对表【district_info】的数据库操作Service实现
*/
@Service
public class DistrictInfoServiceImpl extends ServiceImpl<DistrictInfoMapper, DistrictInfo>
    implements DistrictInfoService{

}




