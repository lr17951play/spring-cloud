package com.lirui.cloud.authorization.config;

import com.lirui.cloud.authorization.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.servlet.http.HttpServletRequest;

public class MyPasswordEncoder implements PasswordEncoder {

    @Autowired
    private HttpServletRequest request;

    @Override
    public String encode(CharSequence charSequence) {
        return null;
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        boolean matched = false;
        String username = request.getParameter("username");
        System.out.println(username);
        matched = charSequence.equals(s);
        return true;
    }
}
