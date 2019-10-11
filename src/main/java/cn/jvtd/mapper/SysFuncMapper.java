package cn.jvtd.mapper;

import cn.jvtd.domain.SysFunc;
import cn.jvtd.domain.SysFuncExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFuncMapper {
    int countByExample(SysFuncExample example);

    int deleteByExample(SysFuncExample example);

    int deleteByPrimaryKey(String funcId);

    int insert(SysFunc record);

    int insertSelective(SysFunc record);

    List<SysFunc> selectByExample(SysFuncExample example);

    SysFunc selectByPrimaryKey(String funcId);

    int updateByExampleSelective(@Param("record") SysFunc record, @Param("example") SysFuncExample example);

    int updateByExample(@Param("record") SysFunc record, @Param("example") SysFuncExample example);

    int updateByPrimaryKeySelective(SysFunc record);

    int updateByPrimaryKey(SysFunc record);

    List<SysFunc> getAllFuncByRoleId(Long roleId);
}