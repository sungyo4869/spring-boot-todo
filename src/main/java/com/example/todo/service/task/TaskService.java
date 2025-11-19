package com.example.todo.service.task;

import com.example.todo.controller.task.TaskDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    public List<TaskEntity> find() {
        List<TaskEntity> tasks = List.of(
                new TaskEntity(1, "買い物", "スーパーで野菜を買う", TaskStatus.DONE),
                new TaskEntity(2, "勉強", "Spring Boot を学ぶ", TaskStatus.DOING),
                new TaskEntity(3, "運動", "ジョギング 5km", TaskStatus.TODO)
        );

        return tasks;
    }
}
