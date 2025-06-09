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
 *教研主任：(DirectorOfTeachingAndResearch)表实体类
 *
 */
@TableName("`director_of_teaching_and_research`")
@Data
@EqualsAndHashCode(callSuper = false)
public class DirectorOfTeachingAndResearch implements Serializable {

    //DirectorOfTeachingAndResearch编号
    @TableId(value = "director_of_teaching_and_research_id", type = IdType.AUTO)
    private Integer director_of_teaching_and_research_id;
    // 主任姓名
    @TableField(value = "`name_of_director`")
    private String name_of_director;
    // 主任性别
    @TableField(value = "`director_gender`")
    private String director_gender;
    // 主任工号
    @TableField(value = "`director_job_no`")
    private String director_job_no;
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
