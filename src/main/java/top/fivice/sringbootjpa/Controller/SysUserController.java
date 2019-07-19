package top.fivice.sringbootjpa.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import top.fivice.sringbootjpa.Dao.ISysUserDao;
import top.fivice.sringbootjpa.Mapper.SysUserMapper;

import java.util.List;

/**
 * @author wubin
 * @version 1.0.0
 * @description TDOO
 * @ClassName SysUserController
 * @date 2019/4/21 14:40
 **/
@Api(value = "/api")
@Controller
public class SysUserController {
    private final SysUserMapper sysUserMapper;
    private final ISysUserDao iSysUserDao;

    @Autowired
    public SysUserController(ISysUserDao iSysUserDao, SysUserMapper sysUserMapper) {
        this.iSysUserDao = iSysUserDao;
        this.sysUserMapper = sysUserMapper;
    }

    @ApiOperation(value = "跳转到主页面index")
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){

        return "/index";
    }
    @ApiOperation(value = "返回用户列表")
    @RequestMapping(value = "/listUser",method = RequestMethod.GET)
    @ResponseBody
    public List listUser(){
        return iSysUserDao.findAll();
    }

    @ApiOperation(value = "返回用户列表")
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    @ResponseBody
    public List findAll(){
        return sysUserMapper.findAll();
    }
}
