package com.caicode.lease.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicode.lease.model.entity.AttrValue;
import com.caicode.lease.web.app.service.AttrValueService;
import com.caicode.lease.web.app.mapper.AttrValueMapper;
import org.springframework.stereotype.Service;

/**
* @author caicode
* @description 针对表【attr_value(房间基本属性值表)】的数据库操作Service实现
*/
@Service
public class AttrValueServiceImpl extends ServiceImpl<AttrValueMapper, AttrValue>
    implements AttrValueService{

}




