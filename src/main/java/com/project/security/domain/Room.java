package com.project.security.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
//@Setter
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	
	private String category;
	
	private String tag;
	
	private String location;
	
	private String description;
	
	private Integer limitOfEnrollments;

	
	//from service
	public void changeTitle(String title) {
		 this.title = title;
	}


	public void changeCategory(String category) {
		this.category = category;
		
	}


	public void changeLocation(String location) {
		this.location = location;
		
	}
	
	public void changeTag(String tag) {
		this.tag = tag;
		
	}
	public void changeDescription(String description) {
		this.description = description;
		
	}
	public void changeLimitOfEnrollments(Integer limitOfEnrollments) {
		this.limitOfEnrollments = limitOfEnrollments;
		
	}
	
	
}





