package cn.medsci.pv.report.service.impl;

import cn.medsci.pv.report.entity.TestRepositories;
import cn.medsci.pv.report.mapper.TestRepositoriesMapper;
import cn.medsci.pv.report.service.ITestRepositoriesService;
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
public class ITestRepositoriesServiceImpl extends ServiceImpl<TestRepositoriesMapper, TestRepositories> implements ITestRepositoriesService {

}
