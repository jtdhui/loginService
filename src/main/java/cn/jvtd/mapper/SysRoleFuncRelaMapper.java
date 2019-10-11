package cn.jvtd.mapper;

import cn.jvtd.domain.SysRoleFuncRela;
import cn.jvtd.domain.SysRoleFuncRelaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleFuncRelaMapper {
    int countByExample(SysRoleFuncRelaExample example);

    int deleteByExample(SysRoleFuncRelaExample example);

    int deleteByPrimaryKey(Long relaId);

    int insert(SysRoleFuncRela record);

    int insertSelective(SysRoleFuncRela record);

    List<SysRoleFuncRela> selectByExample(SysRoleFuncRelaExample example);

    SysRoleFuncRela selectByPrimaryKey(Long relaId);

    int updateByExampleSelective(@Param("record") SysRoleFuncRela record, @Param("example") SysRoleFuncRelaExample example);

    int updateByExample(@Param("record") SysRoleFuncRela record, @Param("example") SysRoleFuncRelaExample example);

    int updateByPrimaryKeySelective(SysRoleFuncRela record);

    int updateByPrimaryKey(SysRoleFuncRela record);
}