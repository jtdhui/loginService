package cn.jvtd.service;

import cn.jvtd.domain.SysFunc;

import java.util.List;

public interface ISysFuncService {
    List<SysFunc> getAllFuncByRoleId(Long roleId);
}
