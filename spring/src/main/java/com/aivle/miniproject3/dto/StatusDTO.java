package com.aivle.miniproject3.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StatusDTO {

    private String status;
    private String message;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
