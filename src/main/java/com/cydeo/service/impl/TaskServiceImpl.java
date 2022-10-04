package com.cydeo.service.impl;

import com.cydeo.dto.TaskDTO;
import com.cydeo.enums.Status;
import com.cydeo.service.TaskService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class TaskServiceImpl extends AbstractMapService<TaskDTO, Long> implements TaskService {
    @Override
    public TaskDTO save(TaskDTO task) {

        if (task.getTaskStatus() == null) {
            task.setTaskStatus(Status.OPEN);
        }
        if (task.getAssignedDate() == null) {
            task.setAssignedDate(LocalDate.now());
        }
        if (task.getId()==null){
            task.setId(UUID.randomUUID().getMostSignificantBits());
        }
        return super.save(task.getId(), task);
    }

    @Override
    public TaskDTO findById(Long id) {
        return super.findById(id);
    }

    @Override
    public List<TaskDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void update(TaskDTO object) {
        if(object.getTaskStatus()==null){
            object.setTaskStatus(findById(object.getId()).getTaskStatus());
        }
        if (object.getAssignedDate() == null) {
            object.setAssignedDate(findById(object.getId()).getAssignedDate());
        }
        super.update(object.getId(), object);
    }
}
