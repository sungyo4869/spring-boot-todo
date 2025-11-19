package com.example.todo.controller.task;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class TaskController {
    @GetMapping("/tasks")
    public String list(Model model) {
        List<TaskDTO> tasks = List.of(
                new TaskDTO(1, "買い物", "スーパーで野菜を買う", "TODO"),
                new TaskDTO(2, "勉強", "Spring Boot を学ぶ", "IN_PROGRESS"),
                new TaskDTO(3, "運動", "ジョギング 5km", "DONE")
        );
        model.addAttribute("tasks", tasks);
        return "tasks/list";
    }
}
