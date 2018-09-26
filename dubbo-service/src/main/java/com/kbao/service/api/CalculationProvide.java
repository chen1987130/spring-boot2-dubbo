package com.kbao.service.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.kabao.api.ICalculationApi;

/**
 * @author chensheng
 * @since V1.0.0
 */
@Service
public class CalculationProvide implements ICalculationApi {

    @Override
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int del(int n1, int n2) {
        return n1 - n2;
    }
}
