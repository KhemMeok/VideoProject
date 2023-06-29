package khem.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import khem.dto.UserDTO;
import khem.exceptionHandle.ApiException;
import khem.mapper.UserMapper;
import khem.model.UserModel;
import khem.repository.UserRepository;
import khem.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository repository;

    @Override
    public UserModel add(UserDTO entity) {
        return repository.save(UserMapper.INSTANCE.toUser(entity));
    }

    @Override
    public UserModel getById(Long id) {
        return repository.findById(id).orElseThrow(
            () -> new ApiException(HttpStatus.NOT_FOUND, String.format("Course not found for id=%d", id)));
    }
}
