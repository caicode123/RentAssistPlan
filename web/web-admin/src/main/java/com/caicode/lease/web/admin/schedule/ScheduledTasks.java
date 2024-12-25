package com.caicode.lease.web.admin.schedule;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.caicode.lease.model.entity.LeaseAgreement;
import com.caicode.lease.model.enums.LeaseStatus;
import com.caicode.lease.web.admin.service.LeaseAgreementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduledTasks {

    @Autowired
    private LeaseAgreementService leaseAgreementService;
    @Scheduled(cron = "0 0 0 * * *")
    public void checkLeaseAgreementStatus() {
        //检查租约状态
        LambdaUpdateWrapper<LeaseAgreement> updateWrapper = new LambdaUpdateWrapper<>();
        //筛选条件为当前时间小于=租约结束时间
        updateWrapper.le(LeaseAgreement::getLeaseEndDate,new Date());
        //只更新状态为已签约或已退租的租约
        updateWrapper.in(LeaseAgreement::getStatus,LeaseStatus.SIGNED,LeaseStatus.WITHDRAWING);
        //更新条件为租约状态为已过期
        updateWrapper.set(LeaseAgreement::getStatus, LeaseStatus.EXPIRED);
        leaseAgreementService.update(updateWrapper);
    }
}
