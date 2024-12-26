package com.caicode.lease.web.app.mapper;

import com.caicode.lease.model.entity.RoomInfo;
import com.caicode.lease.web.app.vo.room.RoomItemVo;
import com.caicode.lease.web.app.vo.room.RoomQueryVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.math.BigDecimal;

/**
* @author caicode
* @description 针对表【room_info(房间信息表)】的数据库操作Mapper
* @Entity com.caicode.lease.model.entity.RoomInfo
*/
public interface RoomInfoMapper extends BaseMapper<RoomInfo> {

    IPage<RoomItemVo> pageItem(Page<RoomItemVo> page, RoomQueryVo queryVo);
}