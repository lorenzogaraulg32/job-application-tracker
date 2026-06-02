package com.lorenzogarau.job_application_tracker.controller;

import com.lorenzogarau.job_application_tracker.dto.CreateJobApplicationRequest;
import com.lorenzogarau.job_application_tracker.dto.JobApplicationResponse;
import com.lorenzogarau.job_application_tracker.dto.UpdateJobApplicationRequest;
import com.lorenzogarau.job_application_tracker.service.JobApplicationService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job_applications")
public class JobApplicationController {


    private final JobApplicationService jobApplicationService;


    public JobApplicationController(JobApplicationService jobApplicationService) {
        this.jobApplicationService = jobApplicationService;
    }


    @GetMapping()
    List<JobApplicationResponse> all() {
        return jobApplicationService.findAll();
    }

    //todo: aggiungere eccezione nel throw
    @GetMapping("/{id}")
    JobApplicationResponse one(@PathVariable Long id) {
        return jobApplicationService.findById(id);
    }

    @PostMapping
    JobApplicationResponse createJobApplication(@Valid @RequestBody CreateJobApplicationRequest dto) {
        return jobApplicationService.createApplication(dto);
    }

    @PutMapping("/{id}")
    JobApplicationResponse updateJobApplicationRequest(@Valid @PathVariable Long id, @RequestBody UpdateJobApplicationRequest dto) {
        return jobApplicationService.updateApplication(id, dto);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<String> deleteJobApplicationrequest(@PathVariable long id) {
        return jobApplicationService.deleteApplication(id);
    }

}
