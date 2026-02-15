package com.third.springboot.employee.dynamicbuilder.controller;

import com.third.springboot.employee.dynamicbuilder.service.PageService;
import com.third.springboot.employee.dynamicbuilder.service.PageService.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pages")
@CrossOrigin(origins = "http://localhost:5173")
public class PageApiController {

    @Autowired
    private PageService pageService;

    /**
     * POST /api/pages/FIRSTP
     * Only pageCode is sent in the URL
     */
    @PostMapping("/{pageCode}")
    public PageData getPage(@PathVariable String pageCode) {
        if (pageCode == null || pageCode.isBlank()) {
            throw new IllegalArgumentException("pageCode must not be null or empty");
        }
        return pageService.getPageFields(pageCode);
    }
}