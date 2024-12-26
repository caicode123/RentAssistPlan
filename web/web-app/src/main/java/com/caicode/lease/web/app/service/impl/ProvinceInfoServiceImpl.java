package com.caicode.lease.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicode.lease.model.entity.ProvinceInfo;
import com.caicode.lease.web.app.service.ProvinceInfoService;
import com.caicode.lease.web.app.mapper.ProvinceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author caicode
* @description 针对表【province_info】的数据库操作Service实现
*/
@Service
public class ProvinceInfoServiceImpl extends ServiceImpl<ProvinceInfoMapper, ProvinceInfo>
    implements ProvinceInfoService{

}




