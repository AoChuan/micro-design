package micro.design.login.service;

public interface SysPermissionService {
    List<SysPermission> selectListByUser(Integer userId);
}
