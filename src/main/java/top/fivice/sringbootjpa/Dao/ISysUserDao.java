package top.fivice.sringbootjpa.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.fivice.sringbootjpa.Domain.SysUser;

/**
 * @author wubin
 * @version 1.0.0
 * @description TDOO
 * @ClassName ISysUserDao
 * @date 2019/4/21 14:39
 **/
public interface ISysUserDao extends JpaRepository<SysUser,Integer> {
}
