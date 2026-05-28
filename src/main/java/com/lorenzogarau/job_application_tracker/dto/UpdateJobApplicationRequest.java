package com.lorenzogarau.job_application_tracker.dto;

import com.lorenzogarau.job_application_tracker.enums.ApplicationStatus;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class UpdateJobApplicationRequest {

    private String company;
    private String role;
    private String location;
    private String applicationUrl;
    private String notes;
    private ApplicationStatus status;
    private LocalDateTime followUpDate;

}
