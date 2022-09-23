package com.mergen.socialease.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mergen.socialease.model.ConfirmationToken;

public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken, Long> {
	ConfirmationToken findByConfirmationToken(String confirmationToken);
}
