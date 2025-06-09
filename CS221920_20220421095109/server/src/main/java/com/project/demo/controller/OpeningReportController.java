package com.project.demo.controller;

import com.project.demo.entity.OpeningReport;
import com.project.demo.service.OpeningReportService;
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
 *开题报告：(OpeningReport)表控制层
 *
 */
@RestController
@RequestMapping("/opening_report")
public class OpeningReportController extends BaseController<OpeningReport,OpeningReportService> {

    /**
     *开题报告对象
     */
    @Autowired
    public OpeningReportController(OpeningReportService service) {
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
