package com.gaozhaoxi.springboottwelve.service;

import com.gaozhaoxi.springboottwelve.entity.SysUser;
import com.gaozhaoxi.springboottwelve.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author Leon
 */
public class CustomUserService implements UserDetailsService {
    @Autowired
    SysUserRepository sysUserRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SysUser user=sysUserRepository.findByUsername(s);
        if(user==null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        System.out.println("s:"+s);
        System.out.println("username"+user.getUsername()+";password"+user.getPassword());
        return user;
    }
}
