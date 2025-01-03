package com.caicode.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicode.lease.model.entity.LabelInfo;
import com.caicode.lease.web.admin.service.LabelInfoService;
import com.caicode.lease.web.admin.mapper.LabelInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author caicode
* @description 针对表【label_info(标签信息表)】的数据库操作Service实现
*/
@Service
public class LabelInfoServiceImpl extends ServiceImpl<LabelInfoMapper, LabelInfo>
    implements LabelInfoService{

}




