package cn.jvtd.service;
import cn.jvtd.domain.SysUser;

import java.util.List;

public interface ISysUserService {

    List<SysUser> selectUserList(SysUser sysUser);

   int addUser(SysUser sysUser);


}
