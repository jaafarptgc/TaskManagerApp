package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotiProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.stereotype.Component;

@Component
public class CommentService {


    private CommentRepository commentRepository;
    private CommentNotiProxy commentNotiProxy;

    public CommentService(CommentRepository commentRepository, CommentNotiProxy commentNotiProxy) {
        this.commentRepository = commentRepository;
        this.commentNotiProxy = commentNotiProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotiProxy.sendcomment(comment);

        //save into the db
        //send an email
    }
}
