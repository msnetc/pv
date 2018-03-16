package cn.medsci.pv.report.service.impl;

import cn.medsci.pv.report.entity.Question;
import cn.medsci.pv.report.mapper.QuestionMapper;
import cn.medsci.pv.report.service.IQuestionService;
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
public class IQuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements IQuestionService {

}
