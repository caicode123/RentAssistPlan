package com.caicode.lease.web.app.service;

import com.caicode.lease.model.entity.ApartmentInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.caicode.lease.web.app.vo.apartment.ApartmentItemVo;

/**
 * @author caicode
 * @description 针对表【apartment_info(公寓信息表)】的数据库操作Service
 */
public interface ApartmentInfoService extends IService<ApartmentInfo> {
    ApartmentItemVo selectApartmentItemVoById(Long apartmentId);
}
