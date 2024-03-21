package cn.lzm.beer.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class SysUser implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    /**
     * 部门ID
     */
    @Column(length = 100)
    private Long deptId;

    /**
     * 用户账号
     */
    private String userName;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 用户性别
     */
    private String sex;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 密码
     */
    private String password;

    /**
     * 帐号状态（0正常 1停用）
     */
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;

    /**
     * 最后登录IP
     */
    private String loginIp;

    /**
     * 最后登录时间
     */
    private LocalDateTime loginDate;

    /**
     * 备注
     */
    private String Remark;

    /**
     * 创建人
     */
    @CreatedBy
    private String createBy;

    /**
     * 创建时间
     */
    @CreatedDate
    private LocalDateTime createTime;

    /**
     * 更新人
     */
    @LastModifiedBy
    private String updateBy;

    /**
     * 更新时间
     */
    @LastModifiedDate
    private LocalDateTime updateTime;

}
