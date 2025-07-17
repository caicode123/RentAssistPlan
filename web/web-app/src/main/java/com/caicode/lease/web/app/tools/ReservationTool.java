package com.caicode.lease.web.app.tools;

import com.caicode.lease.web.app.service.ReservationService;
import com.caicode.lease.web.app.vo.aihelper.Reservation;
import dev.langchain4j.agent.tool.P;
import dev.langchain4j.agent.tool.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ReservationTool {
    @Autowired
    private ReservationService reservationService;

    //1.工具方法: 添加预约信息
    @Tool("预约填报服务")
    public void  addReservation(
            @P("姓名") String name,
           @P("性别") String gender,
            @P("手机号") String phone,
            @P("预约沟通时间,格式为: yyyy-MM-dd'T'HH:mm") String communicationTime,
            @P("所在省份") String province,
            @P("预估分数") Integer estimatedScore
    ){
        Reservation reservation = new Reservation(null,name,gender,phone, LocalDateTime.parse(communicationTime),province,estimatedScore);
        reservationService.insert(reservation);
    }
    //2.工具方法: 查询预约信息
    @Tool("根据手机号查询预约单")
    public Reservation findReservation(@P("考生手机号") String phone){
        return reservationService.findByPhone(phone);
    }
}
