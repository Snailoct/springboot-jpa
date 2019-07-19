package top.fivice.sringbootjpa.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import top.fivice.sringbootjpa.Domain.SysUser;

import java.util.List;

@Mapper
@Component(value = "SysUserMapper")//防止@Autowired 实例化找不到bean
public interface SysUserMapper {

    @Select("select * from sys_user ")
    List<SysUser> findAll();
}
