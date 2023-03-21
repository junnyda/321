package com.project.security.dto;

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
	
	//@NotBlank(message = "제목을 입력해주세요.")
	private String title;
	
	//@NotBlank(message = "내용을 입력해주세요.")
	private String category;
	
	private String tag;
	
	private String location;
	
	//@NotBlank(message = "내용을 입력해주세요.")
	private String description;
	
	private Integer limit_of_enrollments;
}

//public  RoomDTO(Room room) { //RoomDTO 객체의 생성자에서 각 필드의 초기값을 null 대신에 Room 객체의 각 필드값을 할당하도록 수정하면 해당 필드들의 값이 올바르게 나타날 것입니다
//    this.id = room.getId();
//    this.title = room.getTitle();
//    this.category = room.getCategory();
//    this.tag = room.getTag();
//    this.location = room.getLocation();
//    this.description = room.getDescription();
//    this.limit_of_enrollments = room.getLimit_of_enrollments();
//	}
//}

