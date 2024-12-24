package com.caicode.lease.web.admin.service;

import com.caicode.lease.model.entity.RoomInfo;
import com.caicode.lease.web.admin.vo.room.RoomDetailVo;
import com.caicode.lease.web.admin.vo.room.RoomItemVo;
import com.caicode.lease.web.admin.vo.room.RoomQueryVo;
import com.caicode.lease.web.admin.vo.room.RoomSubmitVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author caicode123
* @description 针对表【room_info(房间信息表)】的数据库操作Service
*/
public interface RoomInfoService extends IService<RoomInfo> {

    void saveOrUpdateRoom(RoomSubmitVo roomSubmitVo);

    IPage<RoomItemVo> pageRoomItemByQuery(IPage<RoomItemVo> page, RoomQueryVo queryVo);

    RoomDetailVo getRoomDetailById(Long id);
}
