package com.xlaser4j.opening.modules.sys.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 角色与菜单对应关系
 * </p>
 *
 * @package: com.xlaser4j.opening.modules.sys.model
 * @author: Elijah.D
 * @time: 2018/10/11 13:59
 * @description: 角色和菜单relation
 * @modified: Elijah.D
 */
@Data
@TableName("sys_role_menu")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysRoleMenuDO extends Model<SysRoleMenuDO> {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 菜单ID
     */
    private Long menuId;

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
