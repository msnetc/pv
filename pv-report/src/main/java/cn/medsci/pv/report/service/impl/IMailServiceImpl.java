package cn.medsci.pv.report.service.impl;

import cn.medsci.pv.report.entity.Mail;
import cn.medsci.pv.report.mapper.MailMapper;
import cn.medsci.pv.report.service.IMailService;
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
public class IMailServiceImpl extends ServiceImpl<MailMapper, Mail> implements IMailService {

}
