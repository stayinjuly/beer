package cn.lzm.beer.repository;

import cn.lzm.beer.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepo extends JpaRepository<SysUser, Long> {

    SysUser getSysUsersByUserId(Long id);
}
