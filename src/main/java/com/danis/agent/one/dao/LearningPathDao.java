package com.danis.agent.one.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danis.agent.one.entity.LearningPath;

public interface LearningPathDao extends JpaRepository<LearningPath, Long>{

	List<LearningPath> findByidLearningPathsSubLearningPath(Long idLearningPathsSubLearningPath);
	
}
