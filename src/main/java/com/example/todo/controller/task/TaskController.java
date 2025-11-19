package com.example.todo.controller.task;

import com.example.todo.service.task.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class TaskController {

    private final TaskService taskService = new TaskService();

    @GetMapping("/tasks")
    public String list(Model model) {
        var tasks = taskService.find();
        model.addAttribute("tasks", tasks);
        return "tasks/list";
    }
}
