package com.heavyplus.bonbbs;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.heavyplus.dto.CommentDTO;
import com.heavyplus.service.CommentService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/comment")
public class CommentController {

	private final CommentService commentService;

    @PostMapping(params = "commentId")
    public String insertComment(CommentDTO comment) throws Exception {
        commentService.regist(comment);
        return "redirect:/board/" + comment.getDocumentId(); // TODO
    }

    @PatchMapping(params = "commentId")
    public String updateComment(CommentDTO comment) throws Exception {
        commentService.modify(comment);
        return "redirect:/board/" + comment.getDocumentId(); // TODO
    }

    @DeleteMapping(params = "commentId")
    public String deleteComment(CommentDTO comment) throws Exception {
        commentService.remove(comment.getCommentId()); // TODO
        return "redirect:/board/" + comment.getDocumentId(); // TODO
    }

}