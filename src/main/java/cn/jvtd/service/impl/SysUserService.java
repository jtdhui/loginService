package cn.jvtd.service.impl;

import cn.jvtd.domain.SysUser;
import cn.jvtd.mapper.SysUserMapper;
import cn.jvtd.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserService implements ISysUserService {

    @Autowired
    SysUserMapper sysUserMapper;
    @Override
    public List<SysUser> selectUserList(SysUser sysUser) {
        List<SysUser> sysUserList=  sysUserMapper.findSysUsrList(sysUser);
        return sysUserList;
    }

    @Override
    public int addUser(SysUser sysUser) {
        return sysUserMapper.insert(sysUser);
    }
}
