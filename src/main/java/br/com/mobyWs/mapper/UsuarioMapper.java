package br.com.mobyWs.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import br.com.mobyWs.dto.UsuarioDto;
import br.com.mobyWs.entity.Usuario;

@Mapper
public interface UsuarioMapper {
	UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);
	
	UsuarioDto paraDto(Usuario usuario);
	
    @Mappings(@Mapping(target = "id", ignore = true))
    Usuario doDto (UsuarioDto source);
    
    void atualizar(UsuarioDto source, @MappingTarget Usuario target);
}
