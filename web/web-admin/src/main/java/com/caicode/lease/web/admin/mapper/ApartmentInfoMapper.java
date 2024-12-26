package com.caicode.lease.web.admin.mapper;

import com.caicode.lease.model.entity.ApartmentInfo;
import com.caicode.lease.model.enums.LeaseStatus;
import com.caicode.lease.web.admin.vo.apartment.ApartmentItemVo;
import com.caicode.lease.web.admin.vo.apartment.ApartmentQueryVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
* @author caicode
* @description 针对表【apartment_info(公寓信息表)】的数据库操作Mapper
* @Entity com.caicode.lease.model.ApartmentInfo
*/
public interface ApartmentInfoMapper extends BaseMapper<ApartmentInfo> {

    IPage<ApartmentItemVo> pageItem(Page<ApartmentItemVo> page, ApartmentQueryVo queryVo);
}




