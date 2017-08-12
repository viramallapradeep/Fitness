package com.honeywell.Fitnessapp.jpa;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.honeywell.Fitnessapp.entity.UserFitnessDetails;


@Transactional
public interface UserFitnessDetailsRepo extends JpaRepository<UserFitnessDetails, String> {

}
