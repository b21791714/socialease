package com.mergen.socialease.service.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.mergen.socialease.model.ClubRequest;

public interface ClubRequestRepository extends JpaRepository<ClubRequest, Long> {
	ClubRequest findByClubRequestid(long clubRequestid);
	
}

