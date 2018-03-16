package cn.medsci.pv.report.service.impl;

import cn.medsci.pv.report.entity.Source;
import cn.medsci.pv.report.mapper.SourceMapper;
import cn.medsci.pv.report.service.ISourceService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 原始资料 服务实现类
 * </p>
 *
 * @author wenhao.wang
 * @since 2018-03-16
 */
@Service
public class ISourceServiceImpl extends ServiceImpl<SourceMapper, Source> implements ISourceService {

}
