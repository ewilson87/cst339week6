package com.gcu.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.data.entity.UserEntity;
import com.gcu.data.repository.UsersRepository;

@Service
public class UsersDataService implements UsersDataAccessInterface<UserEntity>, DataAccessInterface<UserEntity> {

	@Autowired
	UsersRepository usersRepository;
	
	@Override
	public List<UserEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(UserEntity userEntity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(UserEntity userEntity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(UserEntity userEntity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserEntity findByUsername(String username) {
		return usersRepository.findByUsername(username);
	}

}
