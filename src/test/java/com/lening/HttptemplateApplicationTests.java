package com.lening;

import com.lening.utils.ResultInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class HttptemplateApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void httpGet() {
        // 调用springboot案例中的rest接口
        ResultInfo user = this.restTemplate.getForObject("http://localhost:8080/TestController/test", ResultInfo.class);
        System.out.println(user.getMsg());
    }
}
