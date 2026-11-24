package in.sp.main.services;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.entities.User;
import in.sp.main.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user){
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public Optional<User> getUserDetails(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public User updateUserDetails(int id, User newUser) {
		// TODO Auto-generated method stub
		User userData = userRepository.findById(id).orElse(null);
		if(userData!=null) {
			return userRepository.save(newUser);
		}
		else {
			throw new RuntimeException("user not found witgh Id :" +id);
		}
		
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);;
		
	}
	
	
}
