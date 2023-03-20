package com.project.security.dto;

import javax.validation.constraints.NotBlank;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class RoomDTO {
	
	private Long id;
	
	@NotBlank(message = "제목을 입력해주세요.")
	private String title;
	
	@NotBlank(message = "내용을 입력해주세요.")
	private String category;
	
	private String tag;
	
	private String location;
	
	@NotBlank
	private String description;
	
	private Integer limitOfEnrollments;
}
