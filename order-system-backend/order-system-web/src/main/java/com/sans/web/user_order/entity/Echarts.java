package com.sans.web.user_order.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
* @author Sans
 */
@Data
public class Echarts {
    private List<String> names = new ArrayList<>();
    private List<BigDecimal> values = new ArrayList<>();
}
