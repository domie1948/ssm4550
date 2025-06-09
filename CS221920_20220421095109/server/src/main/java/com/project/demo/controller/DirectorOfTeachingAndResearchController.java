package com.project.demo.controller;

import com.project.demo.entity.DirectorOfTeachingAndResearch;
import com.project.demo.service.DirectorOfTeachingAndResearchService;
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
 *教研主任：(DirectorOfTeachingAndResearch)表控制层
 *
 */
@RestController
@RequestMapping("/director_of_teaching_and_research")
public class DirectorOfTeachingAndResearchController extends BaseController<DirectorOfTeachingAndResearch,DirectorOfTeachingAndResearchService> {

    /**
     *教研主任对象
     */
    @Autowired
    public DirectorOfTeachingAndResearchController(DirectorOfTeachingAndResearchService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapdirector_job_no = new HashMap<>();
        mapdirector_job_no.put("director_job_no",String.valueOf(paramMap.get("director_job_no")));
        List listdirector_job_no = service.selectBaseList(service.select(mapdirector_job_no, new HashMap<>()));
        if (listdirector_job_no.size()>0){
            return error(30000, "字段主任工号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
