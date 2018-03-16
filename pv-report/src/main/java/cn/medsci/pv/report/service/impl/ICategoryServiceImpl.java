package cn.medsci.pv.report.service.impl;

import cn.medsci.pv.report.entity.Category;
import cn.medsci.pv.report.mapper.CategoryMapper;
import cn.medsci.pv.report.service.ICategoryService;
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
public class ICategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
