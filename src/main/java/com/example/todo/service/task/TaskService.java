package com.example.todo.service.task;

import com.example.todo.controller.task.TaskDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    public List<TaskDTO> find() {
        List<TaskDTO> tasks = List.of(
                new TaskDTO(1, "買い物", "スーパーで野菜を買う", "TODO"),
                new TaskDTO(2, "勉強", "Spring Boot を学ぶ", "IN_PROGRESS"),
                new TaskDTO(3, "運動", "ジョギング 5km", "DONE")
        );

        return tasks;
    }
}
