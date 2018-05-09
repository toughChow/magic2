package com.example.demo.Shiro.tags;


public class HasRoleTag extends RoleTag {

    @Override
    protected boolean showBody(String roleName) {
        return getSubject() != null && getSubject().hasRole(roleName);
    }
}
