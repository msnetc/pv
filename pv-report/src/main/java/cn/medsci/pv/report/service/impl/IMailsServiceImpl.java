package cn.medsci.pv.report.service.impl;

import cn.medsci.pv.report.entity.Mails;
import cn.medsci.pv.report.mapper.MailsMapper;
import cn.medsci.pv.report.service.IMailsService;
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
public class IMailsServiceImpl extends ServiceImpl<MailsMapper, Mails> implements IMailsService {

}
