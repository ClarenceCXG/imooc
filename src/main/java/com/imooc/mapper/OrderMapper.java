package com.imooc.mapper;

import com.imooc.bean.Order;

import java.util.List;

public interface OrderMapper {
    /*---------------------增---------------------*/

    /**
     * 生成订单
     * @param record
     * @return
     */
    int insert(Order record);

    /*---------------------查---------------------*/
    /**
     * 根据用户ID查询订单
     * @param rid
     * @return
     */
    List<Order> selectByRid(Integer rid);

    /*---------------------改---------------------*/

    /**
     * 更改订单信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Order record);

}