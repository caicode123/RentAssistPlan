package com.caicode.lease.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicode.lease.model.entity.GraphInfo;
import com.caicode.lease.web.app.service.GraphInfoService;
import com.caicode.lease.web.app.mapper.GraphInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author caicode
* @description 针对表【graph_info(图片信息表)】的数据库操作Service实现
*/
@Service
public class GraphInfoServiceImpl extends ServiceImpl<GraphInfoMapper, GraphInfo>
    implements GraphInfoService{

}




