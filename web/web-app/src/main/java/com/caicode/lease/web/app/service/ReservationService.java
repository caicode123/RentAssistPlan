package com.caicode.lease.web.app.service;

import com.caicode.lease.web.app.vo.aihelper.Reservation;

public interface ReservationService {

    public void insert(Reservation reservation);

    public Reservation findByPhone(String phone);

}
