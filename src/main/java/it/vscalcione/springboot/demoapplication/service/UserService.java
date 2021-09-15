package it.vscalcione.springboot.demoapplication.service;

import java.util.List;

import it.vscalcione.springboot.demoapplication.dto.UserLocationDTO;
import it.vscalcione.springboot.demoapplication.model.User;

@Service
public interface UserService {
	
	List<UserLocationDTO> getAllUsersLocation();
	UserLocationDTO convertEntityToDto(User user);
	User convertDtoToEntity(UserLocationDTO userLocationDTO);
}
