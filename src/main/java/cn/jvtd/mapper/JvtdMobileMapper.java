package cn.jvtd.mapper;
import cn.jvtd.domain.JvtdMobileBean;
import cn.jvtd.vo.JvtdMobileBeanVO;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface JvtdMobileMapper {
    List<JvtdMobileBeanVO> getMobileList(JvtdMobileBeanVO jvtdMobileBeanVO);
}
