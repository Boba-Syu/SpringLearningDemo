package cn.bobasyu.springbootshiro.service.impl;

import cn.bobasyu.springbootshiro.entity.Account;
import cn.bobasyu.springbootshiro.mapper.AccountMapper;
import cn.bobasyu.springbootshiro.service.AccountService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author bobasyu
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account findByUsername(String username) {
        QueryWrapper<Account> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        return accountMapper.selectOne(wrapper);
    }
}
