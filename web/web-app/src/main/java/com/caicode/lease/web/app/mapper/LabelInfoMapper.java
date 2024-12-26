package com.caicode.lease.web.app.mapper;

import com.caicode.lease.model.entity.LabelInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author caicode
* @description 针对表【label_info(标签信息表)】的数据库操作Mapper
* @Entity com.caicode.lease.model.entity.LabelInfo
*/
public interface LabelInfoMapper extends BaseMapper<LabelInfo> {

    List<LabelInfo> selectListByRoomId(Long id);

    List<LabelInfo> selectListByApartmentId(Long id);
}




