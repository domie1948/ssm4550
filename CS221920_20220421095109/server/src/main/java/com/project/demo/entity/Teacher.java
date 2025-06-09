package com.project.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 *老师：(Teacher)表实体类
 *
 */
@TableName("`teacher`")
@Data
@EqualsAndHashCode(callSuper = false)
public class Teacher implements Serializable {

    //Teacher编号
    @TableId(value = "teacher_id", type = IdType.AUTO)
    private Integer teacher_id;
    // 老师姓名
    @TableField(value = "`teacher_name`")
    private String teacher_name;
    // 老师性别
    @TableField(value = "`teacher_gender`")
    private String teacher_gender;
    // 老师工号
    @TableField(value = "`teacher_job_number`")
    private String teacher_job_number;
    // 用户编号
    @TableField(value = "user_id")
    private Integer userId;


    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;

}
