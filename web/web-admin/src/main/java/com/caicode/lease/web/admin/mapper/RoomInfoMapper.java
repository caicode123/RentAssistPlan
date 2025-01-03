package com.caicode.lease.web.admin.mapper;

import com.caicode.lease.model.entity.RoomInfo;
import com.caicode.lease.web.admin.vo.room.RoomItemVo;
import com.caicode.lease.web.admin.vo.room.RoomQueryVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
* @author caicode
* @description 针对表【room_info(房间信息表)】的数据库操作Mapper
* @Entity com.caicode.lease.model.RoomInfo
*/
public interface RoomInfoMapper extends BaseMapper<RoomInfo> {

    IPage<RoomItemVo> pageRoomItemByQuery(IPage<RoomItemVo> page, RoomQueryVo queryVo);
}




