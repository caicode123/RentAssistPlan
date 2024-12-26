package com.caicode.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicode.lease.model.entity.RoomFacility;
import com.caicode.lease.web.admin.service.RoomFacilityService;
import com.caicode.lease.web.admin.mapper.RoomFacilityMapper;
import org.springframework.stereotype.Service;

/**
* @author caicode
* @description 针对表【room_facility(房间&配套关联表)】的数据库操作Service实现
*/
@Service
public class RoomFacilityServiceImpl extends ServiceImpl<RoomFacilityMapper, RoomFacility>
    implements RoomFacilityService{

}




