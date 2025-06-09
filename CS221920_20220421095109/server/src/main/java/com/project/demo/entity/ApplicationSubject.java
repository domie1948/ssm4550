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
 *申报课题：(ApplicationSubject)表实体类
 *
 */
@TableName("`application_subject`")
@Data
@EqualsAndHashCode(callSuper = false)
public class ApplicationSubject implements Serializable {

    //ApplicationSubject编号
    @TableId(value = "application_subject_id", type = IdType.AUTO)
    private Integer application_subject_id;
    // 课题名称
    @TableField(value = "`topic_name`")
    private String topic_name;
    // 课题学校
    @TableField(value = "`subject_school`")
    private String subject_school;
    // 课题学院
    @TableField(value = "`subject_college`")
    private String subject_college;
    // 课题专业
    @TableField(value = "`subject_major`")
    private String subject_major;
    // 指导老师
    @TableField(value = "`instructor`")
    private Integer instructor;
    // 老师姓名
    @TableField(value = "`teacher_name`")
    private String teacher_name;
    // 老师工号
    @TableField(value = "`teacher_job_number`")
    private String teacher_job_number;
    // 课题附件
    @TableField(value = "`subject_attachment`")
    private String subject_attachment;
    // 课题详情
    @TableField(value = "`project_details`")
    private String project_details;


    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;

}
