package com.mapstructexample.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

import com.mapstructexample.demo.mapper.OrdemMapper;
import com.mapstructexample.demo.model.BicicletaOrigem;
import com.mapstructexample.demo.model.Cliente;
import com.mapstructexample.demo.model.Endereco;
import com.mapstructexample.demo.model.Item;
import com.mapstructexample.demo.model.Nome;
import com.mapstructexample.demo.model.Ordem;
import com.mapstructexample.demo.model.OrdemDTO;

@SpringBootTest
class MapstructexampleApplicationTests {
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void testMapperMapstruct() {
		
		OrdemMapper mapper = Mappers.getMapper(OrdemMapper.class);
		
		Ordem ordem = new Ordem();
		ordem.setCliente(new Cliente(new Nome("Davi", "Silva")));
		ordem.setEnderecoFinanceiro(new Endereco("Av. Matheus", "Tel Aviv"));
		ordem.setBicicletaOrigem(new BicicletaOrigem("Caloi", "vermelha", 20));
		List<Item> itens = new ArrayList<Item>();
		itens.add(new Item("0101", 1));
		itens.add(new Item("0102", 2));
		ordem.setItens(itens);
		
		OrdemDTO ordemDTO = mapper.toOrdemDTO(ordem);
		assertEquals(ordem.getCliente().getNome().getNome(), ordemDTO.getClienteNome());
		assertEquals(ordem.getCliente().getNome().getSobreNome(), ordemDTO.getClienteSobreNome());
		assertEquals(ordem.getEnderecoFinanceiro().getRua(), ordemDTO.getEnderecoRua());
		assertEquals(ordem.getEnderecoFinanceiro().getCidade(), ordemDTO.getEnderecoCidade());
		assertEquals(ordem.getBicicletaOrigem().getMarca(), ordemDTO.getBicicletaDestino().getMarca());
		assertEquals(ordem.getBicicletaOrigem().getCor(), ordemDTO.getBicicletaDestino().getCor());
		assertEquals(ordem.getBicicletaOrigem().getAro(), ordemDTO.getBicicletaDestino().getAro());
		assertEquals(itens, ordemDTO.getItens());
		
		Ordem ordem2 = new Ordem();
		ordem2.setCliente(new Cliente(new Nome("Elias", "Oliveira")));
		ordem2.setEnderecoFinanceiro(new Endereco("Av. Pedro", "Tel Aviv"));
		ordem2.setBicicletaOrigem(new BicicletaOrigem("Monark", "vermelha", 20));
		ordem2.setItens(itens);
		
		OrdemDTO ordemDTO2 = mapper.toOrdemDTO(ordem2);		
		assertEquals("Elias", ordemDTO2.getClienteNome());
		assertEquals("Oliveira", ordemDTO2.getClienteSobreNome());
		assertEquals("Av. Pedro", ordemDTO2.getEnderecoRua());
		assertEquals("Tel Aviv", ordemDTO2.getEnderecoCidade());
		assertEquals("Monark", ordemDTO2.getBicicletaDestino().getMarca());
		assertEquals( "vermelha", ordemDTO2.getBicicletaDestino().getCor()); 
		assertEquals(20, ordemDTO2.getBicicletaDestino().getAro());
		assertEquals("0101", ordem2.getItens().get(0).getCodigo());
		assertEquals(1, ordem2.getItens().get(0).getQuantidade());
		assertEquals("0102", ordem2.getItens().get(1).getCodigo());
		assertEquals(2, ordem2.getItens().get(1).getQuantidade());
		
	}


	

}
