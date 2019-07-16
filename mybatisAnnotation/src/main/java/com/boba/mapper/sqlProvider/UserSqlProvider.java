package com.boba.mapper.sqlProvider;

import com.boba.entity.User;
import org.apache.ibatis.jdbc.SQL;

public class UserSqlProvider {

    /**
     * 动态语句配置
     * @param user
     * @return
     */
    public String select(User user) {
        SQL sql = new SQL().SELECT("uid, uname, pwd");
        sql.FROM("user");
        if (user.getUid() != 0) {
            sql.WHERE("uid = #{uid}");
        }
        if (user.getUname() != null) {
            sql.WHERE("uname = #{uname}");
        }
        if (user.getPwd() != null) {
            sql.WHERE("pwd = #{pwd}");
        }
        return sql.toString();
    }
}
