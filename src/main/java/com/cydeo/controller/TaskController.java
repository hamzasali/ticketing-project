package com.cydeo.controller;

import com.cydeo.dto.TaskDTO;
import com.cydeo.service.ProjectService;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("task")
public class TaskController {

    private final UserService userService;
    private final ProjectService projectService;

    public TaskController(UserService userService, ProjectService projectService) {
        this.userService = userService;
        this.projectService = projectService;
    }

    @GetMapping("/create")
    public String taskCreate(Model model) {
        model.addAttribute("task", new TaskDTO());
        model.addAttribute("projects", projectService.findAll());
        model.addAttribute("employees", userService.findEmployees());

        return "/task/create";
    }
}
