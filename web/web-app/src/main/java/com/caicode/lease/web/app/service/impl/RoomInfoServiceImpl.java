package com.caicode.lease.web.app.service.impl;

import com.caicode.lease.model.entity.RoomInfo;
import com.caicode.lease.web.app.mapper.RoomInfoMapper;
import com.caicode.lease.web.app.service.RoomInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author caicode
 * @description 针对表【room_info(房间信息表)】的数据库操作Service实现
 */
@Service
@Slf4j
public class RoomInfoServiceImpl extends ServiceImpl<RoomInfoMapper, RoomInfo>
        implements RoomInfoService {

}




