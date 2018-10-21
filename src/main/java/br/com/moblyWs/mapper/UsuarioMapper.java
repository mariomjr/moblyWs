package br.com.moblyWs.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import br.com.moblyWs.dto.UsuarioCreateDto;
import br.com.moblyWs.dto.UsuarioDto;
import br.com.moblyWs.entity.Usuario;

@Mapper
public interface UsuarioMapper {
	UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);
	
	UsuarioDto paraDto(Usuario usuario);
	
    @Mappings(@Mapping(target = "id", ignore = true))
    Usuario doDto (UsuarioDto source);
    
    @Mappings(@Mapping(target = "id", ignore = true))
    Usuario doCreateDto (UsuarioCreateDto source);
    
    void atualizar(UsuarioDto source, @MappingTarget Usuario target);
}
