package micro.design.login.service;

public interface SysPermissionService {
    List<SysPermission> selectListByUser(Integer userId);

    List<SysPermission> selectListByPath(String requestUrl);
}
