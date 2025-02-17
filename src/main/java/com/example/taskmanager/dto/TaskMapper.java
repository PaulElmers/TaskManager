package com.example.taskmanager.dto;

import com.example.taskmanager.entity.Task;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TaskMapper {
    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);

    TaskDTO toDto(Task task);
    Task toEntity(TaskDTO taskDTO);
}