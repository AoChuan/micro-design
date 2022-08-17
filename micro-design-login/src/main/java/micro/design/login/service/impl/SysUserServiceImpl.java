package micro.design.login.service.impl;

import micro.design.login.mapper.SysUserMapper;
import micro.design.login.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private  SysUserMapper sysUserMapper;
    @Override
    SysUser selectByName(String userName){
        return sysUserMapper.selectByName(userName);
    }
}
