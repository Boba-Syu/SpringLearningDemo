package cn.bobasyu.springbootshiro.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import cn.bobasyu.springbootshiro.shiro.realm.AccountRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bobasyu
 */
@Configuration
public class ShiroConfig {

    @Bean
    public AccountRealm accountRealm() {
        return new AccountRealm();
    }

    @Bean
    public DefaultWebSecurityManager defaultWebSecurityManager(@Qualifier("accountRealm") AccountRealm accountRealm) {
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setRealm(accountRealm);
        return defaultWebSecurityManager;
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(
            @Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager);
        // 授权
        Map<String, String> map = new HashMap<>(8);
        // 必须登录才能访问
        map.put("/main", "authc");
        // 用户必须有manager授权才能访问
        map.put("/manage", "perms[manager]");
        // 用户必须拥有admin角色才能访问
        map.put("/administrator", "roles[admin]");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
        //设置登陆页面
        shiroFilterFactoryBean.setLoginUrl("/login");
        //设置未授权页面
        shiroFilterFactoryBean.setUnauthorizedUrl("unauthorized");
        return shiroFilterFactoryBean;
    }

    @Bean
    public ShiroDialect shiroDialect() {
        return new ShiroDialect();
    }
}
