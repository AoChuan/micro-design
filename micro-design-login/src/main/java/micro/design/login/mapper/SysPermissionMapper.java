package micro.design.login.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysPermissionMapper {
    /**
     * 查询用户的权限列表
     *
     * @param userId
     * @return
     */
    List<SysPermission> selectListByUser(Integer userId);
}
