package com.project.security.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
//@Setter
////@Table(name = "room"")
//
//@Entity
//@Getter
@Builder
//
//@Data

@Entity
@Data

public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	
	private String category;
	
	private String tag;
	
	private String location;
	
	private String description;
	
	//@Column(name = "limit_of_enrollments")
	private Integer limit_of_enrollments;

	
	@Column(name = "account_id")
	private Long account_id;
	
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


	public void changeLimit_of_enrollments(Integer limit_of_enrollments) {
		this.limit_of_enrollments = limit_of_enrollments;
		
	}
}
//	public Room(String title, String category, String tag, String location, String description, Integer limitOfEnrollments, Long accountId) {
//        this.title = title;
//        this.category = category;
//        this.tag = tag;
//        this.location = location;
//        this.description = description;
//        this.limit_of_enrollments = limitOfEnrollments;
//       // this.account_id = account_id;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public String getTag() {
//        return tag;
//    }
//
//    public void setTag(String tag) {
//        this.tag = tag;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Integer getLimitOfEnrollments() {
//        return limit_of_enrollments;
//    }
//
//    public void setLimitOfEnrollments(Integer limit_of_enrollments) {
//        this.limit_of_enrollments = limit_of_enrollments;
//    }
//
//    public Long getAccount_id() {
//        return account_id;
//    }
//
//    public void setAccount_Id(Long account_id) {
//        this.account_id = account_id;
//    }
//	
//	
//}
//
//
//
//
//
