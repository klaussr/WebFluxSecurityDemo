package semkin.WebFluxSecurityDemo.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import semkin.WebFluxSecurityDemo.dto.UserDto;
import semkin.WebFluxSecurityDemo.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto map(UserEntity userEntity);

    @InheritInverseConfiguration
    UserEntity map(UserDto dto);
}
