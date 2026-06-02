package com.lorenzogarau.job_application_tracker.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class CreateJobApplicationRequest {

    @NotBlank(message = "company field must not be empty")
    private String company;

    @NotBlank(message = "role field must not be empty")
    private String role;

    private String applicationUrl;
    private String location;
    private String notes;

    @PastOrPresent(message = "applicationDate must be past or present")
    private LocalDateTime applicationDate;


    public CreateJobApplicationRequest() {
    }


}
