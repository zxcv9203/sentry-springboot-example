package com.example.sentryexample.domain.post.api;

import com.example.sentryexample.global.exception.InvalidRequestException;
import com.example.sentryexample.global.exception.model.ErrorCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {


    @PostMapping
    public ResponseEntity<String> create() {
        return ResponseEntity.ok("게시글 생성에 성공했습니다.");
    }

    @PostMapping("/fail")
    public ResponseEntity<String> createFail() {
        throw new InvalidRequestException(ErrorCode.P01);
    }
}
