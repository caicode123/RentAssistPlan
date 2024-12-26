package com.caicode.lease.web.app.controller.agreement;

import com.caicode.lease.common.login.LoginUserHolder;
import com.caicode.lease.common.result.Result;
import com.caicode.lease.model.entity.LeaseAgreement;
import com.caicode.lease.model.enums.LeaseStatus;
import com.caicode.lease.web.app.service.LeaseAgreementService;
import com.caicode.lease.web.app.vo.agreement.AgreementDetailVo;
import com.caicode.lease.web.app.vo.agreement.AgreementItemVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/agreement")
@Tag(name = "租约信息")
public class LeaseAgreementController {


    @Autowired
    private LeaseAgreementService service;

    @Operation(summary = "获取个人租约基本信息列表")
    @GetMapping("listItem")
    public Result<List<AgreementItemVo>> listItem() {
        List<AgreementItemVo> result = service.listItemByPhone(LoginUserHolder.getLoginUser().getUsername());
        return Result.ok(result);
    }

    @Operation(summary = "根据id获取租约详细信息")
    @GetMapping("getDetailById")
    public Result<AgreementDetailVo> getDetailById(@RequestParam Long id) {
        AgreementDetailVo agreementDetailVo = service.getDetailById(id);
        return Result.ok(agreementDetailVo);
    }

    @Operation(summary = "根据id更新租约状态", description = "用于确认租约和提前退租")
    @PostMapping("updateStatusById")
    public Result updateStatusById(@RequestParam Long id, @RequestParam LeaseStatus leaseStatus) {
        return Result.ok();
    }

    @Operation(summary = "保存或更新租约", description = "用于续约")
    @PostMapping("saveOrUpdate")
    public Result saveOrUpdate(@RequestBody LeaseAgreement leaseAgreement) {
        return Result.ok();
    }

}
