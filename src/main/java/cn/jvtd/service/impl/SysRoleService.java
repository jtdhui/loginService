package cn.jvtd.service.impl;

import cn.jvtd.domain.SysFunc;
import cn.jvtd.domain.SysRole;
import cn.jvtd.mapper.SysRoleMapper;
import cn.jvtd.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleService implements ISysRoleService {

    @Autowired
    SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRole> getUserAllRoles(Long userId) {
        return sysRoleMapper.getUserAllRoles(userId);
    }

    @Override
    public List<SysFunc> getUserAllFuncs(Long roleId) {
        return sysRoleMapper.getUserAllFuncs(roleId);
    }
}
