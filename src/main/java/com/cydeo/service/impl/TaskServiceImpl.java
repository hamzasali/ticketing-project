package com.cydeo.service.impl;

import com.cydeo.dto.TaskDTO;
import com.cydeo.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl extends AbstractMapService<TaskDTO, Long> implements TaskService {
    @Override
    public TaskDTO save(TaskDTO user) {
        return null;
    }

    @Override
    public TaskDTO findById(Long username) {
        return null;
    }

    @Override
    public List<TaskDTO> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long username) {

    }

    @Override
    public void update(TaskDTO object) {

    }
}
