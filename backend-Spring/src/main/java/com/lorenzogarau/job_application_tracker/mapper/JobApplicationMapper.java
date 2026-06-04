package com.lorenzogarau.job_application_tracker.mapper;

import com.lorenzogarau.job_application_tracker.dto.CreateJobApplicationRequest;
import com.lorenzogarau.job_application_tracker.dto.JobApplicationResponse;
import com.lorenzogarau.job_application_tracker.dto.PatchJobApplicationRequest;
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
        dto.setId(jobApplication.getId());
        dto.setApplicationDate(jobApplication.getApplicationDate());
        dto.setApplicationUrl(jobApplication.getApplicationUrl());
        dto.setCompany(jobApplication.getCompany());
        dto.setCreatedAt(jobApplication.getCreatedAt());
        dto.setFollowUp(jobApplication.getFollowUpDate());
        dto.setLocation(jobApplication.getLocation());
        dto.setNotes(jobApplication.getNotes());
        dto.setRole(jobApplication.getRole());
        dto.setStatus(jobApplication.getStatus());
        dto.setUpdatedAt(jobApplication.getUpdatedAt());
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


    public void updateEntityForPut(UpdateJobApplicationRequest updateJobApplicationRequest, JobApplication entity) {
        entity.setCompany(updateJobApplicationRequest.getCompany());
        entity.setRole(updateJobApplicationRequest.getRole());
        entity.setLocation(updateJobApplicationRequest.getLocation());
        entity.setApplicationUrl(updateJobApplicationRequest.getApplicationUrl());
        entity.setNotes(updateJobApplicationRequest.getNotes());
        entity.setStatus(updateJobApplicationRequest.getStatus());
        entity.setFollowUpDate(updateJobApplicationRequest.getFollowUpDate());
    }

    //approccio permissivo, i campi vuoti vengono ignorati e non aggiornati, questo include "" e "       "
    //per "eliminare" alcuni campi usare la PUT lasciandoli vuoti
    public void updateEntityForPatch(PatchJobApplicationRequest patchJobApplicationRequest, JobApplication entity) {
        if (patchJobApplicationRequest.getCompany() != null && !patchJobApplicationRequest.getCompany().isBlank()) {
            entity.setCompany(patchJobApplicationRequest.getCompany());
        }
        if (patchJobApplicationRequest.getRole() != null && !patchJobApplicationRequest.getRole().isBlank()) {
            entity.setRole(patchJobApplicationRequest.getRole());
        }
        if (patchJobApplicationRequest.getLocation() != null && !patchJobApplicationRequest.getLocation().isBlank()) {
            entity.setLocation(patchJobApplicationRequest.getLocation());
        }
        if (patchJobApplicationRequest.getApplicationUrl() != null && !patchJobApplicationRequest.getApplicationUrl().isBlank()) {
            entity.setApplicationUrl(patchJobApplicationRequest.getApplicationUrl());
        }
        if (patchJobApplicationRequest.getNotes() != null && !patchJobApplicationRequest.getNotes().isBlank()) {
            entity.setNotes(patchJobApplicationRequest.getNotes());
        }
        if (patchJobApplicationRequest.getStatus() != null) {
            entity.setStatus(patchJobApplicationRequest.getStatus());
        }
        if (patchJobApplicationRequest.getFollowUpDate() != null) {
            entity.setFollowUpDate(patchJobApplicationRequest.getFollowUpDate());
        }
    }


}


