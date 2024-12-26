package com.caicode.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicode.lease.model.entity.RoomLabel;
import com.caicode.lease.web.admin.service.RoomLabelService;
import com.caicode.lease.web.admin.mapper.RoomLabelMapper;
import org.springframework.stereotype.Service;

/**
* @author caicode
* @description 针对表【room_label(房间&标签关联表)】的数据库操作Service实现
*/
@Service
public class RoomLabelServiceImpl extends ServiceImpl<RoomLabelMapper, RoomLabel>
    implements RoomLabelService{

}




