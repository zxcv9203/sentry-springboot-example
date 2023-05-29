package com.example.sentryexample.global.exception.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ErrorCode {

    P01("게시글 생성에 실패했습니다.");

    private final String description;
}
