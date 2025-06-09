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
 *开题报告：(OpeningReport)表实体类
 *
 */
@TableName("`opening_report`")
@Data
@EqualsAndHashCode(callSuper = false)
public class OpeningReport implements Serializable {

    //OpeningReport编号
    @TableId(value = "opening_report_id", type = IdType.AUTO)
    private Integer opening_report_id;
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
    // 选题学生
    @TableField(value = "`selected_students`")
    private Integer selected_students;
    // 学生姓名
    @TableField(value = "`student_name`")
    private String student_name;
    // 开题审核
    @TableField(value = "`opening_review`")
    private String opening_review;
    // 开题报告
    @TableField(value = "`opening_report`")
    private String opening_report;


    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;

}
