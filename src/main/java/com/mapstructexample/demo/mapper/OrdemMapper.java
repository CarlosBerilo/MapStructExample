package com.mapstructexample.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mapstructexample.demo.model.Ordem;
import com.mapstructexample.demo.model.OrdemDTO;


@Mapper(componentModel = "spring")
public interface OrdemMapper {
	
	@Mapping(source = "ordem.cliente.nome.nome",target = "clienteNome")
	@Mapping(source = "ordem.cliente.nome.sobreNome",target = "clienteSobreNome")
	@Mapping(source = "ordem.enderecoFinanceiro.rua", target = "enderecoRua")
	@Mapping(source = "ordem.enderecoFinanceiro.cidade", target = "enderecoCidade")
	@Mapping(source = "ordem.bicicletaOrigem", target = "bicicletaDestino")
	@Mapping(source = "ordem.itens", target = "itens")
	public OrdemDTO toOrdemDTO(Ordem ordem);
}
