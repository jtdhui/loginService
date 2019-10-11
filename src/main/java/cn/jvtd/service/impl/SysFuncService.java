package cn.jvtd.service.impl;

import cn.jvtd.domain.SysFunc;
import cn.jvtd.mapper.SysFuncMapper;
import cn.jvtd.service.ISysFuncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysFuncService implements ISysFuncService {

    @Autowired
    SysFuncMapper sysFuncMapper;

    @Override
    public List<SysFunc> getAllFuncByRoleId(Long roleId) {
        return sysFuncMapper.getAllFuncByRoleId(roleId);
    }
}
