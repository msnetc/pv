package cn.medsci.pv.report.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wenhao.wang
 * @since 2018-03-16
 */
@TableName("permission_user")
public class PermissionUser extends Model<PermissionUser> {

    private static final long serialVersionUID = 1L;

    @TableField("permission_id")
    private Integer permissionId;
    @TableField("user_id")
    private Integer userId;
    @TableField("user_type")
    private String userType;
    @TableField("company_id")
    private Integer companyId;


    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "PermissionUser{" +
        ", permissionId=" + permissionId +
        ", userId=" + userId +
        ", userType=" + userType +
        ", companyId=" + companyId +
        "}";
    }
}
