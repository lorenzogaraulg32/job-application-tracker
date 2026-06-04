package com.lorenzogarau.job_application_tracker.dto;

import com.lorenzogarau.job_application_tracker.enums.ApplicationStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
public class JobApplicationResponse {

    private Long id;
    private LocalDateTime applicationDate;
    private String applicationUrl;
    private String company;
    private LocalDateTime createdAt;
    private LocalDateTime followUp;
    private String location;
    private String notes;
    private String role;
    private ApplicationStatus status;
    private LocalDateTime updatedAt;

}
