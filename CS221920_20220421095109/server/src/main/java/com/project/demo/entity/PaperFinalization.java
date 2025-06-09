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
 *论文定稿：(PaperFinalization)表实体类
 *
 */
@TableName("`paper_finalization`")
@Data
@EqualsAndHashCode(callSuper = false)
public class PaperFinalization implements Serializable {

    //PaperFinalization编号
    @TableId(value = "paper_finalization_id", type = IdType.AUTO)
    private Integer paper_finalization_id;
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
    // 论文定稿
    @TableField(value = "`paper_finalization`")
    private String paper_finalization;
    // 定稿审核
    @TableField(value = "`final_review`")
    private String final_review;
    // 老师评分
    @TableField(value = "`teacher_rating`")
    private Integer teacher_rating;


    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;

}
