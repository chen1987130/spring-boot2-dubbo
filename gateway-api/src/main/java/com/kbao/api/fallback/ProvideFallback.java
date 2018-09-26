package com.kbao.api.fallback;

import com.kbao.api.model.User;
import com.kbao.api.service.ProvideApi;
import org.springframework.stereotype.Component;

/**
 * @author chensheng
 * @version V1.0
 * @Description
 * @date 2018/09/26
 * @since V1.0
 */
@Component
public class ProvideFallback implements ProvideApi {

    @Override
    public Integer add(int num1, int num2) {
        return 0;
    }

    @Override
    public Integer del(int num1, int num2) {
        return 0;
    }

    @Override
    public User user(int age, String name) {
        return new User(0, "");
    }
}
