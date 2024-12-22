package com.caicode.lease.web.admin.custom.converter;

import com.caicode.lease.model.enums.BaseEnum;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.stereotype.Component;

@Component
public class StringToBaseEnumConverterFactory implements ConverterFactory<String, BaseEnum> {
    @Override
    public <T extends BaseEnum> Converter<String, T> getConverter(Class<T> targetType) {//这里设置的是所有enuim类的父类Baseenum，来作为方法的target，实现连接所有子类的效果
        return new Converter<String, T>() {
            @Override
            public T convert(String source) {
                T[] enumConstants = targetType.getEnumConstants();//根据传入的类型获取
                for (T enumConstant : enumConstants) {//遍历
                    if (enumConstant.getCode().equals(Integer.valueOf(source))){
                        return enumConstant;//类似转换器的做法
                    }
                }
                throw new IllegalArgumentException("code"+source+"非法");
            }
        };
    }
}
