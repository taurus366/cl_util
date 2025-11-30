package com.aiolds.cl_util.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public interface SecurityCustomizer {
    void customize(HttpSecurity http) throws Exception;
}
