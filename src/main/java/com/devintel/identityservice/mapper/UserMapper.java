package com.devintel.identityservice.mapper;

import com.devintel.identityservice.entity.User;
import com.devintel.identityservice.dto.request.UserCreationRequest;
import com.devintel.identityservice.dto.request.UserUpdateRequest;
import com.devintel.identityservice.dto.response.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    User updateUser(@MappingTarget User user, UserUpdateRequest request);
}
