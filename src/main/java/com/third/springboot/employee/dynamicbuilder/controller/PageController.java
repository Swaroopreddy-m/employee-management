package com.third.springboot.employee.dynamicbuilder.controller;

import com.third.springboot.employee.dynamicbuilder.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PageController {

    private final PageService pageService;

    @Autowired
    public PageController(PageService pageService) {
        this.pageService = pageService;
    }

    @GetMapping("/page/{type}")
    public String loadPage(@PathVariable String type, Model model) {

        String pageKey = resolvePageKey(type);

        model.addAttribute("pageType", type.toUpperCase());
        model.addAttribute("fields", pageService.getPageFields(pageKey).getFields());

        return "dynamic-page"; // Thymeleaf / JSP page
    }

    /**
     * Resolves property key based on page type
     */
    private String resolvePageKey(String type) {

        if (type == null) {
            return "FIRSTP";
        }

        switch (type.toLowerCase()) {
            case "capture":
                return "FIRSTP";
            case "confirm":
                return "FIRST1";
            case "acknowledge":
                return "FIRST2";
            default:
                throw new IllegalArgumentException("Invalid page type: " + type);
        }
    }
}