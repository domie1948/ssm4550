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
 *学生：(Student)表实体类
 *
 */
@TableName("`student`")
@Data
@EqualsAndHashCode(callSuper = false)
public class Student implements Serializable {

    //Student编号
    @TableId(value = "student_id", type = IdType.AUTO)
    private Integer student_id;
    // 学生姓名
    @TableField(value = "`student_name`")
    private String student_name;
    // 学生性别
    @TableField(value = "`student_gender`")
    private String student_gender;
    // 学生学号
    @TableField(value = "`student_number`")
    private String student_number;
    // 学校名称
    @TableField(value = "`school_name`")
    private String school_name;
    // 学院名称
    @TableField(value = "`college_name`")
    private String college_name;
    // 专业名称
    @TableField(value = "`professional_name`")
    private String professional_name;
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
