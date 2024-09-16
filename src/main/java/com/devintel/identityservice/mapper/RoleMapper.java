package com.devintel.identityservice.mapper;

import com.devintel.identityservice.dto.request.RoleRequest;
import com.devintel.identityservice.dto.response.RoleResponse;
import com.devintel.identityservice.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore=true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
