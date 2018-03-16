package cn.medsci.pv.report.service.impl;

import cn.medsci.pv.report.entity.Permissions;
import cn.medsci.pv.report.mapper.PermissionsMapper;
import cn.medsci.pv.report.service.IPermissionsService;
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
public class IPermissionsServiceImpl extends ServiceImpl<PermissionsMapper, Permissions> implements IPermissionsService {

}
