package cn.medsci.pv.report.entity;

import com.baomidou.mybatisplus.annotations.TableId;
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
@TableName("permission_role")
public class PermissionRole extends Model<PermissionRole> {

    private static final long serialVersionUID = 1L;

    @TableId("permission_id")
    private Integer permissionId;
    @TableField("role_id")
    private Integer roleId;


    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    protected Serializable pkVal() {
        return this.permissionId;
    }

    @Override
    public String toString() {
        return "PermissionRole{" +
        ", permissionId=" + permissionId +
        ", roleId=" + roleId +
        "}";
    }
}
