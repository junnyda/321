package com.project.security.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.security.dto.RoomDTO;
import com.project.security.response.SuccessResponse;
import com.project.security.service.RoomService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
//@Slf4j
public class RoomController {
	
	private final RoomService roomService;

	//모임 조회
	@RequestMapping(value="room/{id}", method=RequestMethod.GET)
    //@GetMapping("room/{id}")
    //@ResponseStatus(value = HttpStatus.OK)
	public SuccessResponse getRoom (@PathVariable(name = "id") Long id) {
		RoomDTO room = roomService.getRoom(id);
		return SuccessResponse.success(room);
		 	
		
	}
	//모임 작성
	@RequestMapping(value="/room", method=RequestMethod.POST)
	//@PostMapping("/room")
	// @ResponseStatus(value = HttpStatus.CREATED)
	 public SuccessResponse createRoom( RoomDTO roomDTO) { //@Valid @RequestBody
		 RoomDTO room = roomService.createRoom(roomDTO);
		 
		 return SuccessResponse.success(room);
	    }
	
	//모임 수정 
	@RequestMapping(value="room/{id}", method=RequestMethod.PUT)
	//@PutMapping("room/{id}")
    //@ResponseStatus(value = HttpStatus.OK)
    public SuccessResponse<RoomDTO> updatePost(@Valid @RequestBody RoomDTO roomDTO, @PathVariable(name = "id") Long roomId) {
        RoomDTO roomDTOResponse = roomService.updateRoom(roomId, roomDTO);

        return SuccessResponse.success(roomDTOResponse);
    }
	
	//모임 삭제
	@RequestMapping(value="room/{id}", method=RequestMethod.DELETE)
    //@DeleteMapping("room/{id}")
    //@ResponseStatus(value = HttpStatus.OK)
    public SuccessResponse<String> deleteRoom(@PathVariable(name = "id") Long roomId) {
        roomService.deleteRoom(roomId);
        return SuccessResponse.success(null);
    }
}
	
