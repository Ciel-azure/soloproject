package com.soloproject.todos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import javax.validation.constraints.NotBlank;

public class TodoDto {

    @Getter
    @AllArgsConstructor
    public static class Post {

        @NotBlank(message = "제목은 공백이 아니어야 합니다.")
        private String title;

        @NotBlank
        private int todo_order;

        private boolean completed;
    }

    @Getter
    @AllArgsConstructor
    public static class Patch{

        private int toDoId;

        @NotBlank(message = "제목은 공백이 아니어야 합니다.")
        private String title;

        @NotBlank
        private int todo_order;

        private boolean completed;

        public void setToDoId(int toDoId) {
            this.toDoId = toDoId;
        }
    }

    @Getter
    @AllArgsConstructor
    public static class Response {
        private int toDoId;
        private String title;
        private int todo_order;
        private boolean completed;
    }
}
