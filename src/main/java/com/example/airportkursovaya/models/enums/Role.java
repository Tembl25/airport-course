package com.example.airportkursovaya.models.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ROLE_USER,
    ROLE_ADMIN,
    ROLE_DISPATCHER,
    ROLE_ENGINEER,
    ROLE_JOURNALIST;

    @Override
    public String getAuthority() {
        return name();
    }
}

