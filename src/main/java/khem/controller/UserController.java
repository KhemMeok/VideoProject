package khem.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.media.Content;
import khem.dto.UserDTO;
import khem.exceptionHandle.ApiException;
import khem.mapper.UserMapper;
import khem.service.UserService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    
    private final UserService userService;

    @PostMapping
    public ResponseEntity<?> add(@RequestBody @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "User object", required = true, content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)) UserDTO user) throws ApiException{       
        return ResponseEntity.ok().body(UserMapper.INSTANCE.toUserDTO(userService.add(user)));
    }

}
