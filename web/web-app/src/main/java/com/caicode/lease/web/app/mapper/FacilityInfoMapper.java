package com.caicode.lease.web.app.mapper;

import com.caicode.lease.model.entity.FacilityInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author caicode
* @description 针对表【facility_info(配套信息表)】的数据库操作Mapper
* @Entity com.caicode.lease.model.entity.FacilityInfo
*/
public interface FacilityInfoMapper extends BaseMapper<FacilityInfo> {

    List<FacilityInfo> selectListByRoomId(Long id);
}




