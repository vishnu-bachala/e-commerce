package com.vishnu.ecom_proj.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    // This handles all non-API routes and forwards them to index.html (React entry)
    @RequestMapping(value = {"/{path:[^\\.]*}", "/**/{path:[^\\.]*}"})
    public String redirect(HttpServletRequest request) {
        String path = request.getRequestURI();
        if (path.startsWith("/api/")) {
            return null; // Let API requests (/api/...) go to backend
        }
        return "forward:/index.html"; // Forward all other routes to React frontend
    }
}
