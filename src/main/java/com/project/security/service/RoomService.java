package com.project.security.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.security.domain.Room;
import com.project.security.dto.RoomDTO;
import com.project.security.repository.RoomRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class RoomService {
	
	private final RoomRepository roomRepository;
	
	
	public RoomDTO getRoom(Long iD) {
		Optional<Room> byId = roomRepository.findById(iD);
		
        Room findRoom = byId.orElseThrow(() -> new IllegalArgumentException("해당 모임이 존재하지 않습니다."));

        return RoomDTO.builder()
        		.id(findRoom.getId())
        		.title(findRoom.getTitle())
        		.category(findRoom.getCategory())
        		.tag(findRoom.getTag())
        		.location(findRoom.getLocation())
        		.description(findRoom.getDescription())
        		.limit_of_enrollments(findRoom.getLimit_of_enrollments())
        		.build();
        	}
	
	public RoomDTO createRoom(RoomDTO roomDTO) {
        Room room = Room.builder()
        		//.id(roomDTO.getId())
        		.title(roomDTO.getTitle())
        		.category(roomDTO.getCategory())
        		.tag(roomDTO.getTag())
        		.location(roomDTO.getLocation())
        		.description(roomDTO.getDescription())
        		.limit_of_enrollments(roomDTO.getLimit_of_enrollments())
        	    //.createAt(LocalDateTime.now())
        		.build();

        Room save = roomRepository.save(room);

        RoomDTO roomDTOResponse = RoomDTO.builder()
        		
                .id(save.getId())
                .build();


        return roomDTOResponse;
	
		//return roomRepository.save(roomDTO);
    }

	public RoomDTO updateRoom(Long id, RoomDTO roomDTO) {
        Optional<Room> byId = roomRepository.findById(id);
        Room room = byId.orElseThrow(() -> new IllegalArgumentException("해당 모임이 존재하지 않거나 수정이 안됬습니다."));

        room.changeTitle(roomDTO.getTitle());
        room.changeCategory(roomDTO.getCategory());
        room.changeTag(roomDTO.getTag());
        room.changeLocation(roomDTO.getLocation());
        room.changeDescription(roomDTO.getDescription());
        room.changeLimit_of_enrollments(roomDTO.getLimit_of_enrollments());

        return RoomDTO.builder()
                .id(room.getId())
                .build();
    }

    public void deleteRoom(Long id) {
        Optional<Room> byId = roomRepository.findById(id);
        Room room = byId.orElseThrow(() -> new IllegalArgumentException("해당 모임이 존재하지않거나 수정이 안됬습니다."));

        roomRepository.delete(room);
    }
}
        		
//                .id(findPost.getId())
//                .title(findPost.getTitle())
//                .contents(findPost.getContents())
//                .createdAt(findPost.getCreateAt().toString()) //localdateDate은 붙이는듯 
//                .build();
	//}
