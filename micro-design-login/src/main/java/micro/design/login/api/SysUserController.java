package micro.design.login.api;

import micro.design.login.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysUserController {

    @Autowired
    SysUserService sysUserService;
    @RequestMapping("/getUser")
    public SysUser getUser(){
        return sysUserService.selectByName(null);
    }
}
