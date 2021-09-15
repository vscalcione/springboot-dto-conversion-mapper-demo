package it.vscalcione.springboot.demoapplication.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.vscalcione.springboot.demoapplication.dto.UserLocationDTO;
import it.vscalcione.springboot.demoapplication.model.User;
import it.vscalcione.springboot.demoapplication.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	

	@Override
	public List<UserLocationDTO> getAllUsersLocation() {
		return userRepository
				.findAll()
				.stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public UserLocationDTO convertEntityToDto(User user) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		return modelMapper.map(user, UserLocationDTO.class);
	}

	@Override
	public User convertDtoToEntity(UserLocationDTO userLocationDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		return modelMapper.map(userLocationDTO, User.class);
	}
	
}
