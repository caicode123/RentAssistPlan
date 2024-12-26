package com.caicode.lease.web.admin.mapper;

import com.caicode.lease.model.entity.GraphInfo;
import com.caicode.lease.model.enums.ItemType;
import com.caicode.lease.web.admin.vo.graph.GraphVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author caicode
* @description 针对表【graph_info(图片信息表)】的数据库操作Mapper
* @Entity com.caicode.lease.model.GraphInfo
*/
public interface GraphInfoMapper extends BaseMapper<GraphInfo> {

    List<GraphVo> selectListByItemTypeAndId(ItemType itemType, Long id);
}




