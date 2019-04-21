package top.fivice.sringbootjpa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import top.fivice.sringbootjpa.Dao.ISysUserDao;
import top.fivice.sringbootjpa.Domain.SysUser;

import java.util.List;

/**
 * @author wubin
 * @version 1.0.0
 * @description TDOO
 * @ClassName SysUserController
 * @date 2019/4/21 14:40
 **/
@Controller
public class SysUserController {
    @Autowired
    ISysUserDao iSysUserDao;
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/listUser")
    @ResponseBody
    public List listUser(){
        return iSysUserDao.findAll();
    }
    @RequestMapping("addUser")
    @ResponseBody
    public List addUser(SysUser sysUser){
        iSysUserDao.save(sysUser);
        return iSysUserDao.findAll();
    }
}
