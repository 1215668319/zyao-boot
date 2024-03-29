package com.zyao.service.sys;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zyao.modal.sys.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author ayao
* @description 针对表【sys_user】的数据库操作Service
* @createDate 2023-09-03 15:23:54
*/
public interface SysUserService extends IService<SysUser>, BaseService {

    Page<SysUser> pageQuery(JSONObject filter);
}
