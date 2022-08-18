package micro.design.login.service.impl;

import micro.design.login.mapper.SysPermissionMapper;
import micro.design.login.service.SysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysPermissionServiceImpl implements SysPermissionService {
    @Autowired
    private SysPermissionMapper sysPermissionMapper;
    @Override
    List<SysPermission> selectListByUser(Integer userId){
        return sysPermissionMapper.selectListByUser(userId);
    }

    @Override
    public List<SysPermission> selectListByPath(String requestUrl) {
        return sysPermissionMapper.selectListByPath(requestUrl);
    }
}
