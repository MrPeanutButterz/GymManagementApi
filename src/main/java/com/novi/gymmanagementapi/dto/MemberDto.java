package com.novi.gymmanagementapi.dto;

public class MemberDto extends MemberResponseDto {

    private String password;
    private boolean enabled;

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public boolean isEnabled() { return enabled; }

    public void setEnabled(boolean enabled) { this.enabled = enabled; }
}
