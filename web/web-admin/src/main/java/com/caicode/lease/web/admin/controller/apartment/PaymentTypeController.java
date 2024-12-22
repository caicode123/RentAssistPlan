package com.caicode.lease.web.admin.controller.apartment;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.caicode.lease.common.result.Result;
import com.caicode.lease.model.entity.PaymentType;
import com.caicode.lease.web.admin.service.PaymentTypeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "支付方式管理")
@RequestMapping("/admin/payment")
@RestController
public class PaymentTypeController {

    @Autowired
    private PaymentTypeService service;

    @Operation(summary = "查询全部支付方式列表")
    @GetMapping("list")
    public Result<List<PaymentType>> listPaymentType() {
//        不使用注解时使用mybatisplus中的lambda加入筛选条件
        LambdaQueryWrapper<PaymentType> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(PaymentType::getIsDeleted,0);
        List<PaymentType> list = service.list(queryWrapper);
        return Result.ok(list);
    }

    @Operation(summary = "保存或更新支付方式")
    @PostMapping("saveOrUpdate")
    public Result saveOrUpdatePaymentType(@RequestBody PaymentType paymentType) {
        service.saveOrUpdate(paymentType);//规则：id为null时save，不为null时update
        return Result.ok();
    }

    @Operation(summary = "根据ID删除支付方式")
    @DeleteMapping("deleteById")
    public Result deletePaymentById(@RequestParam Long id) {
        service.removeById(id);
        return Result.ok();
    }

}















