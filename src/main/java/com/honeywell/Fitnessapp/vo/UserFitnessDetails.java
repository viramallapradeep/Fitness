package com.honeywell.Fitnessapp.vo;

public class UserFitnessDetails {
	
	private String userId;
	private String userName;
	private Integer runningMiles;
	private Integer pushups;
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

	

}
