package com.cydeo;

import com.cydeo.config.CommentConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {
    static void main() {
        ApplicationContext container = new AnnotationConfigApplicationContext(CommentConfig.class);


        CommentService commentService = container.getBean(CommentService.class);

        Comment comment = new Comment();

        comment.setAuthor("Jafar");
        comment.setText("Hello");

        commentService.publishComment(comment);

    }
}
