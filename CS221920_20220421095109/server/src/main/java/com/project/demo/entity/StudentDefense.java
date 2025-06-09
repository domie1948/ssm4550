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
 *学生答辩：(StudentDefense)表实体类
 *
 */
@TableName("`student_defense`")
@Data
@EqualsAndHashCode(callSuper = false)
public class StudentDefense implements Serializable {

    //StudentDefense编号
    @TableId(value = "student_defense_id", type = IdType.AUTO)
    private Integer student_defense_id;
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
    // 课题附件
    @TableField(value = "`subject_attachment`")
    private String subject_attachment;
    // 毕业设计
    @TableField(value = "`graduation_project`")
    private String graduation_project;
    // 论文附件
    @TableField(value = "`paper_annex`")
    private String paper_annex;
    // 答辩评分
    @TableField(value = "`defense_score`")
    private Integer defense_score;
    // 答辩评价
    @TableField(value = "`defense_evaluation`")
    private String defense_evaluation;


    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;

}
