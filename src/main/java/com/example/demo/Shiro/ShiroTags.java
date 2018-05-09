package com.example.demo.Shiro;

import com.example.demo.Shiro.tags.HasPermissionTag;
import com.example.demo.Shiro.tags.HasRoleTag;
import freemarker.template.SimpleHash;

public class ShiroTags extends SimpleHash {
    public ShiroTags() {
        put("hasPermission", new HasPermissionTag());
        put("hasRole", new HasRoleTag());
    }
}
