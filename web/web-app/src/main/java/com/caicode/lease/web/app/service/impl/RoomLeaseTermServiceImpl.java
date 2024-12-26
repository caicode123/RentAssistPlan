package com.caicode.lease.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicode.lease.model.entity.RoomLeaseTerm;
import com.caicode.lease.web.app.service.RoomLeaseTermService;
import com.caicode.lease.web.app.mapper.RoomLeaseTermMapper;
import org.springframework.stereotype.Service;

/**
* @author caicode
* @description 针对表【room_lease_term(房间租期管理表)】的数据库操作Service实现
*/
@Service
public class RoomLeaseTermServiceImpl extends ServiceImpl<RoomLeaseTermMapper, RoomLeaseTerm>
    implements RoomLeaseTermService{

}




