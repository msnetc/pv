package cn.medsci.pv.report.service.impl;

import cn.medsci.pv.report.entity.PermissionUser;
import cn.medsci.pv.report.mapper.PermissionUserMapper;
import cn.medsci.pv.report.service.IPermissionUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wenhao.wang
 * @since 2018-03-16
 */
@Service
public class IPermissionUserServiceImpl extends ServiceImpl<PermissionUserMapper, PermissionUser> implements IPermissionUserService {

}
