package com.honeywell.Fitnessapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.ComponentScan;


@Entity
@Table(name = "UserFitnessDetails", schema = "fitness")

public class UserFitnessDetails {
	@Id
	@Column(name="user_id")
	private String userId;
	public UserFitnessDetails()
	{
		
	}
	
	public UserFitnessDetails(String userId, String userName, Integer runningMiles, Integer pushups,
			Integer skippings) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.runningMiles = runningMiles;
		this.pushups = pushups;
		this.skippings = skippings;
	}
	@Column(name="user_name")
	private String userName;
	
	@Column(name="running_miles")
	private Integer runningMiles;
	@Column(name="pushups")
	private Integer pushups;
	@Column(name="skippings")
	private Integer skippings;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getRunningMiles() {
		return runningMiles;
	}
	public void setRunningMiles(Integer runningMiles) {
		this.runningMiles = runningMiles;
	}
	public Integer getPushups() {
		return pushups;
	}
	public void setPushups(Integer pushups) {
		this.pushups = pushups;
	}
	public Integer getSkippings() {
		return skippings;
	}
	public void setSkippings(Integer skippings) {
		this.skippings = skippings;
	}
	@Override
	public String toString() {
		return "UserFitnessDetails [userId=" + userId + ", userName=" + userName + ", runningMiles=" + runningMiles
				+ ", pushups=" + pushups + ", skippings=" + skippings + "]";
	}
	
	
	
}
