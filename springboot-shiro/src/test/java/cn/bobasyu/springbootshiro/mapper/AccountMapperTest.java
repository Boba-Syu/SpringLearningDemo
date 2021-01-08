package cn.bobasyu.springbootshiro.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AccountMapperTest {
    @Autowired
    private AccountMapper accountMapper;

    @Test
    void test() {
        accountMapper.selectList(null).forEach(System.out::println);
    }
}
