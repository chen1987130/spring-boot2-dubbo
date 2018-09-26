package com.kbao.api.service;

import com.kbao.api.fallback.ProvideFallback;
import com.kbao.api.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chensheng
 * @version V1.0
 * @Description
 * @date 2018/09/25
 * @since V1.0
 */
@FeignClient(value = "gateway-provide", fallback = ProvideFallback.class)
public interface ProvideApi {

    @RequestMapping(value = ("/calc/add"), method = {RequestMethod.POST})
    Integer add(@RequestParam("num1") int num1, @RequestParam("num2") int num2);

    @RequestMapping(value = ("/calc/del"), method = {RequestMethod.POST})
    Integer del(@RequestParam("num1") int num1, @RequestParam("num2") int num2);

    @RequestMapping(value = ("/calc/user"), method = {RequestMethod.POST})
    User user(@RequestParam("age") int age, @RequestParam("name") String name);
}
