package cn.medsci.pv.report.service.impl;

import cn.medsci.pv.report.entity.FailedJobs;
import cn.medsci.pv.report.mapper.FailedJobsMapper;
import cn.medsci.pv.report.service.IFailedJobsService;
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
public class IFailedJobsServiceImpl extends ServiceImpl<FailedJobsMapper, FailedJobs> implements IFailedJobsService {

}
