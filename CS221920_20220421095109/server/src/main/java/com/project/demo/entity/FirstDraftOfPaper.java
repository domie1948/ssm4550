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
 *论文初稿：(FirstDraftOfPaper)表实体类
 *
 */
@TableName("`first_draft_of_paper`")
@Data
@EqualsAndHashCode(callSuper = false)
public class FirstDraftOfPaper implements Serializable {

    //FirstDraftOfPaper编号
    @TableId(value = "first_draft_of_paper_id", type = IdType.AUTO)
    private Integer first_draft_of_paper_id;
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
    // 论文初稿
    @TableField(value = "`first_draft_of_paper`")
    private String first_draft_of_paper;
    // 初稿审核
    @TableField(value = "`draft_review`")
    private String draft_review;


    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;

}
