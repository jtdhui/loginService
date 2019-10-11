package cn.jvtd.service;
import cn.jvtd.domain.SysFunc;
import cn.jvtd.domain.SysRole;
import java.util.List;

public interface ISysRoleService {
    List<SysRole> getUserAllRoles(Long userId);

    List<SysFunc> getUserAllFuncs(Long roleId);
}
