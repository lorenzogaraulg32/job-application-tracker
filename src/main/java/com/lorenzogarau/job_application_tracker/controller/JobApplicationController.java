package com.lorenzogarau.job_application_tracker.controller;

import com.lorenzogarau.job_application_tracker.dto.JobApplicationDTO;
import com.lorenzogarau.job_application_tracker.mapper.JobApplicationMapper;
import com.lorenzogarau.job_application_tracker.service.JobApplicationService;
import jakarta.validation.Valid;
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
    List<JobApplicationDTO> all() {
        return jobApplicationService.findAll();
    }

    //todo: aggiungere eccezione nel throw
    @GetMapping("/{id}")
    JobApplicationDTO one(@PathVariable Long id) {
        return jobApplicationService.findById(id);
    }

    @PostMapping
    JobApplicationDTO createJobApplication(@Valid @RequestBody JobApplicationDTO dto) {
        //creare il DTO in base a ciò che ricevo dal post
        return jobApplicationService.createApplication(dto);
    }

}
