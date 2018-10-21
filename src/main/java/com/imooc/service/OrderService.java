package com.imooc.service;

import com.imooc.bean.Order;
import com.imooc.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    /**
     * 添加订单
     * @param record
     * @return
     */
    public int addOrder(Order record){
        return orderMapper.insert(record);
    }

    /**返回订单结果集
     * @param rid
     * @return
     */
    public List<Order> selectOrder(Integer rid){
        return orderMapper.selectByRid(rid);
    }

    /**
     * 更新订单信息
     * @param record
     * @return
     */
    public int updateOrder(Order record){
        return orderMapper.updateByPrimaryKeySelective(record);
    }
}
