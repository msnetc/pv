package cn.medsci.pv.report.service.impl;

import cn.medsci.pv.report.entity.Country;
import cn.medsci.pv.report.mapper.CountryMapper;
import cn.medsci.pv.report.service.ICountryService;
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
public class ICountryServiceImpl extends ServiceImpl<CountryMapper, Country> implements ICountryService {

}
