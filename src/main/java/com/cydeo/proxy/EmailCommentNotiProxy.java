package com.cydeo.proxy;

import com.cydeo.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotiProxy implements CommentNotiProxy{


    @Override
    public void sendcomment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
