package com.project.demo.controller;

import com.project.demo.entity.ProjectAssignment;
import com.project.demo.service.ProjectAssignmentService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *课题任务书：(ProjectAssignment)表控制层
 *
 */
@RestController
@RequestMapping("/project_assignment")
public class ProjectAssignmentController extends BaseController<ProjectAssignment,ProjectAssignmentService> {

    /**
     *课题任务书对象
     */
    @Autowired
    public ProjectAssignmentController(ProjectAssignmentService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
