package com.lorenzogarau.job_application_tracker.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class CreateJobApplicationRequest {

    @NotBlank
    private String company;

    @NotBlank
    private String role;

    private String applicationUrl;
    private String location;
    private String notes;

    @PastOrPresent
    private LocalDateTime applicationDate;


    public CreateJobApplicationRequest() {
    }


}
