package com.xizi.proxy_mode.mapper;

import com.xizi.proxy_mode.pojo.XxOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 夜尽
 * @date 2020/11/30 11:05
 */
@Mapper
public interface OrderMapper {
    
    @Insert("INSERT INTO xx_order (id,order_name, `time`) VALUES (#{id}, #{orderName}, #{time});")
    void create(XxOrder xxOrder);
}
