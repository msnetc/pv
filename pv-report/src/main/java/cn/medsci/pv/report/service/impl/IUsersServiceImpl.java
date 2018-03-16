package cn.medsci.pv.report.service.impl;

import cn.medsci.pv.report.entity.Users;
import cn.medsci.pv.report.mapper.UsersMapper;
import cn.medsci.pv.report.service.IUsersService;
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
public class IUsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
