package com.stylefeng.guns.rest.order.dto;

import com.stylefeng.guns.rest.common.AbstractResponse;
import lombok.Data;

@Data
public class AddOrderResponse extends AbstractResponse {

    private OrderDto orderDto;

    private Long orderId;
}
