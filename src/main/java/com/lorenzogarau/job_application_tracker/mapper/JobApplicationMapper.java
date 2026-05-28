package com.lorenzogarau.job_application_tracker.mapper;

import com.lorenzogarau.job_application_tracker.dto.CreateJobApplicationRequest;
import com.lorenzogarau.job_application_tracker.dto.JobApplicationResponse;
import com.lorenzogarau.job_application_tracker.dto.UpdateJobApplicationRequest;
import com.lorenzogarau.job_application_tracker.entity.JobApplication;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JobApplicationMapper {


    public JobApplication createEntityFromRequest(CreateJobApplicationRequest createJobApplicationRequest) {
        JobApplication entity = new JobApplication();
        entity.setApplicationDate(createJobApplicationRequest.getApplicationDate());
        entity.setCompany(createJobApplicationRequest.getCompany());
        entity.setRole(createJobApplicationRequest.getRole());
        entity.setLocation(createJobApplicationRequest.getLocation());
        entity.setApplicationUrl(createJobApplicationRequest.getApplicationUrl());
        entity.setNotes(createJobApplicationRequest.getNotes());
        return entity;
    }


    public JobApplicationResponse toResponse(JobApplication jobApplication) {
        JobApplicationResponse dto = new JobApplicationResponse();
        dto.setApplicationDate(jobApplication.getApplicationDate());
        dto.setCompany(jobApplication.getCompany());
        dto.setRole(jobApplication.getRole());
        dto.setLocation(jobApplication.getLocation());
        dto.setApplicationUrl(jobApplication.getApplicationUrl());
        dto.setNotes(jobApplication.getNotes());
        dto.setStatus(jobApplication.getStatus());
        return dto;
    }


    public List<JobApplicationResponse> toResponseList(List<JobApplication> jobApplications) {
        List<JobApplicationResponse> DTOList = new ArrayList<>();
        for (JobApplication entry : jobApplications) {
            JobApplicationResponse dto = toResponse(entry);
            DTOList.add(dto);
        }
        return DTOList;
    }


    public void updateEntity(UpdateJobApplicationRequest updateJobApplicationRequest, JobApplication entity) {
        entity.setCompany(updateJobApplicationRequest.getCompany());
        entity.setRole(updateJobApplicationRequest.getRole());
        entity.setLocation(updateJobApplicationRequest.getLocation());
        entity.setApplicationUrl(updateJobApplicationRequest.getApplicationUrl());
        entity.setNotes(updateJobApplicationRequest.getNotes());
        entity.setStatus(updateJobApplicationRequest.getStatus());
        entity.setFollowUpDate(updateJobApplicationRequest.getFollowUpDate());
    }




}


