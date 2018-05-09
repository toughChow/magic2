package com.example.demo.Shiro;

import com.example.demo.persist.dao.ModuleDao;
import com.example.demo.persist.dao.RoleDao;
import com.example.demo.persist.entity.AdminPo;
import com.example.demo.persist.entity.ModulePo;
import com.example.demo.persist.entity.RolePo;
import com.example.demo.persist.service.AdminService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class AuthRealm extends AuthorizingRealm {
    @Autowired
    private AdminService adminService;
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private ModuleDao moduleDao;
    //认证.登录
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken utoken=(UsernamePasswordToken) token;//获取用户输入的token
        String username = (String)utoken.getPrincipal();
        AdminPo adminPo = adminService.findUserByname(username);
        return new SimpleAuthenticationInfo(adminPo, adminPo.getPass(),this.getClass().getName());//放入shiro.调用CredentialsMatcher检验密码
    }
    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        AdminPo adminPo=(AdminPo) principal.fromRealm(this.getClass().getName()).iterator().next();//获取session中的用户
        List<String> permissions=new ArrayList<>();
        RolePo roles =roleDao.findOne(adminPo.getRole_id());
        ModulePo modulePo=moduleDao.findOne(roles.getModule_id());
        permissions.add(modulePo.getName());
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        info.addStringPermissions(permissions);//将权限放入shiro中.
        info.addRole(modulePo.getName());
        return info;
    }
}
