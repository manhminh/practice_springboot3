package com.devintel.identityservice.mapper;

import com.devintel.identityservice.dto.request.PermissionRequest;
import com.devintel.identityservice.dto.response.PermissionResponse;
import com.devintel.identityservice.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
