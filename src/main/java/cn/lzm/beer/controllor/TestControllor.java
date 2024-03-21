package cn.lzm.beer.controllor;

import cn.lzm.beer.common.R;
import cn.lzm.beer.entity.SysUser;
import cn.lzm.beer.repository.SysUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestControllor {

    @Autowired
    SysUserRepo sysUserRepo;

    @RequestMapping("/getUser/{userId}")
    public R<SysUser> getUser(@PathVariable("userId") Long userId){
        SysUser sysUsersByUserId = sysUserRepo.getSysUsersByUserId(userId);
        return R.ok(sysUsersByUserId);
    }
}
