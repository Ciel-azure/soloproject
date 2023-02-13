package com.soloproject.todos.mapper;

import com.soloproject.todos.entity.Todo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public class ToDoMapper {

    Todo
}
