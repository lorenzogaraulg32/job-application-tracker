package com.lorenzogarau.job_application_tracker.dto;

import com.lorenzogarau.job_application_tracker.enums.ApplicationStatus;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UpdateJobApplicationRequest {

    @NotBlank(message = "company field must not be empty")
    private String company;
    @NotBlank(message = "role field must not be empty")
    private String role;


    private String location;
    private String applicationUrl;
    private String notes;
    private ApplicationStatus status;

    @Future(message = "followUpDate must be future")
    private LocalDateTime followUpDate;

}
