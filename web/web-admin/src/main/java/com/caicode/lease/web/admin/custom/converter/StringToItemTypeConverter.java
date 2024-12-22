package com.caicode.lease.web.admin.custom.converter;

import com.caicode.lease.model.enums.ItemType;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component//利用Spring生成一个实例，方便配置时候调用
public class StringToItemTypeConverter implements Converter<String, ItemType> {

    @Override
    public ItemType convert(String code) {
        //使用if判读不利于程序的后期维护，所以还是得修改
//        if ("1".equals(code)){
//            return ItemType.APARTMENT;
//        }else if ("2".equals(code)){
//            return ItemType.ROOM;
//        }

        ItemType[] values = ItemType.values();
        for (ItemType value : values) {
            if (value.getCode().equals(Integer.valueOf(code))){
                return value;
            }
        }
        throw new IllegalArgumentException("code"+code+"非法");
    }
}
