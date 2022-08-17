package micro.design.login.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserMapper {
    /**
     * 根据用户名查询用户
     *
     * @param userName
     * @return
     */
    SysUser selectByName(String userName);
}
