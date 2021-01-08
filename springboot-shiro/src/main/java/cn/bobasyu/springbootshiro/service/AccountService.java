package cn.bobasyu.springbootshiro.service;

import cn.bobasyu.springbootshiro.entity.Account;

/**
 * @author bobasyu
 */
public interface AccountService {
    /**
     * @param username
     * @return
     */
    Account findByUsername(String username);
}
