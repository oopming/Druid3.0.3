package com.xuanwu.mos.exception;

import org.apache.shiro.authc.AuthenticationException;

/**
 * Created by Administrator on 2017/3/30.
 */
public class AccountLockdException extends AuthenticationException {
    private static final long serialVersionUID = 1L;

    public AccountLockdException(String message) {
        super(message);
    }
}
