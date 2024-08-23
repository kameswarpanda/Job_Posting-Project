package com.task.jobposting.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.jobposting.entity.JobPosting;

public interface JobPostingRepository extends JpaRepository<JobPosting, Long>{
	
    List<JobPosting> findByTitleContainingOrLocationContainingOrRequiredSkillsContaining(String title, String location, String requiredSkills);


}
