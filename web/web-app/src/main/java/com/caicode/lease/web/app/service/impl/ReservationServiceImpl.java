package com.caicode.lease.web.app.service.impl;

import com.caicode.lease.web.app.mapper.ReservationMapper;
import com.caicode.lease.web.app.service.ReservationService;
import com.caicode.lease.web.app.vo.aihelper.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ReservationMapper reservationMapper;

    //1.添加预约信息的方法
    public void insert(Reservation reservation) {
        reservationMapper.insert(reservation);
    }

    //2.查询预约信息的方法(根据手机号查询)
    public Reservation findByPhone(String phone) {
        return reservationMapper.findByPhone(phone);
    }
}
