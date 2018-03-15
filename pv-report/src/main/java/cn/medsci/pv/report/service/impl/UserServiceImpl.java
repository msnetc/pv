package cn.medsci.pv.report.service.impl;

import java.util.List;

import cn.medsci.pv.report.entity.User;
import cn.medsci.pv.report.mapper.UserMapper;
import cn.medsci.pv.report.service.IUserService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;


/**
 *
 * User 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Override
	public boolean deleteAll() {
		return retBool(baseMapper.deleteAll());
	}

	@Override
	public List<User> selectListBySQL() {
		return baseMapper.selectListBySQL();
	}

}