package khem.service;

import khem.dto.UserDTO;
import khem.model.UserModel;

public interface UserService {
    UserModel add(UserDTO entity);
    UserModel getById(Long id);
}
