package cn.medsci.pv.report.mapper;

import java.util.List;

import cn.medsci.pv.report.SuperMapper;
import cn.medsci.pv.report.entity.User;
import org.apache.ibatis.annotations.Select;

/**
 * User 表数据库控制层接口
 */
public interface UserMapper extends SuperMapper<User> {

    /**
     * 自定义注入方法
     */
    int deleteAll();

    @Select("select test_id as id, name, age, test_type from user")
    List<User> selectListBySQL();

}