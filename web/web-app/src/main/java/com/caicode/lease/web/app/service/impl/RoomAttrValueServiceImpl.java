package com.caicode.lease.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicode.lease.model.entity.RoomAttrValue;
import com.caicode.lease.web.app.service.RoomAttrValueService;
import com.caicode.lease.web.app.mapper.RoomAttrValueMapper;
import org.springframework.stereotype.Service;

/**
* @author caicode
* @description 针对表【room_attr_value(房间&基本属性值关联表)】的数据库操作Service实现
*/
@Service
public class RoomAttrValueServiceImpl extends ServiceImpl<RoomAttrValueMapper, RoomAttrValue>
    implements RoomAttrValueService{

}




