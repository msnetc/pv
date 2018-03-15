package cn.medsci.pv.report.service;

import java.util.List;

import cn.medsci.pv.report.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 *
 * User 表数据服务层接口
 *
 */
public interface IUserService extends IService<User> {

	boolean deleteAll();

	public List<User> selectListBySQL();
}