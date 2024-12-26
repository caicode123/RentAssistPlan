package com.caicode.lease.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicode.lease.model.entity.CityInfo;
import com.caicode.lease.web.app.service.CityInfoService;
import com.caicode.lease.web.app.mapper.CityInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author caicode
* @description 针对表【city_info】的数据库操作Service实现
*/
@Service
public class CityInfoServiceImpl extends ServiceImpl<CityInfoMapper, CityInfo>
    implements CityInfoService{

}




