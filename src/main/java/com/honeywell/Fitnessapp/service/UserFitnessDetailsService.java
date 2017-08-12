package com.honeywell.Fitnessapp.service;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.honeywell.Fitnessapp.entity.UserFitnessDetails;
import com.honeywell.Fitnessapp.jpa.UserFitnessDetailsRepo;


@Service
public class UserFitnessDetailsService implements GenericService<UserFitnessDetails, String> {
	private final UserFitnessDetailsRepo userRepository;
	
	public UserFitnessDetailsService(final UserFitnessDetailsRepo userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public CrudRepository<UserFitnessDetails, String> getRepository() {
		return this.userRepository;
	}

	@Override
	public String getId(UserFitnessDetails entity) {
		return entity.getUserId();
	}
	
	@Override
	public UserFitnessDetails save(UserFitnessDetails entity) {
		entity.setUserId(UUID.randomUUID().toString());
		return GenericService.super.save(entity);
	}

}
