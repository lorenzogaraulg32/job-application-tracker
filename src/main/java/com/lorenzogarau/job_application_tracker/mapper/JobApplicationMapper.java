package com.lorenzogarau.job_application_tracker.mapper;

import com.lorenzogarau.job_application_tracker.dto.JobApplicationDTO;
import com.lorenzogarau.job_application_tracker.entity.JobApplication;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JobApplicationMapper {


    public JobApplicationDTO toDTO(JobApplication jobApplication) {
        JobApplicationDTO dto = new JobApplicationDTO();
        dto.setApplicationDate(jobApplication.getApplicationDate());
        dto.setCompany(jobApplication.getCompany());
        dto.setRole(jobApplication.getRole());
        dto.setLocation(jobApplication.getLocation());
        dto.setApplicationUrl(jobApplication.getApplicationUrl());
        dto.setNotes(jobApplication.getNotes());
        return dto;
    }


    public List<JobApplicationDTO> toDTOList(List<JobApplication> jobApplications) {
        List<JobApplicationDTO> DTOList = new ArrayList<>();
        for (JobApplication entry : jobApplications) {
            JobApplicationDTO dto = toDTO(entry);
            DTOList.add(dto);
        }
        return DTOList;
    }


    public JobApplication toEntity(JobApplicationDTO jobApplicationDTO) {
        JobApplication entity = new JobApplication();
        entity.setApplicationDate(jobApplicationDTO.getApplicationDate());
        entity.setCompany(jobApplicationDTO.getCompany());
        entity.setRole(jobApplicationDTO.getRole());
        entity.setLocation(jobApplicationDTO.getLocation());
        entity.setApplicationUrl(jobApplicationDTO.getApplicationUrl());
        entity.setNotes(jobApplicationDTO.getNotes());
        return entity;
    }

}


