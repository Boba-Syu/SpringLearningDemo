package cn.bobasyu.springbootshiro.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void Test() {
        System.out.println(accountService.findByUsername("aaa"));
    }
}
