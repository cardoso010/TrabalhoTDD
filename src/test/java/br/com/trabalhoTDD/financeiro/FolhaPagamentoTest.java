package br.com.trabalhoTDD.financeiro;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import br.com.trabalhoTDD.models.Colaborador;
import br.com.trabalhoTDD.models.Dependente;

public class FolhaPagamentoTest {
	
	private Colaborador colaborador1;
	private Colaborador colaborador2;
	private Colaborador colaborador3;
	
	
	@Before
	public void antes() {
		this.colaborador1 = new Colaborador(8, 120, Arrays.asList(new Dependente("maria")));
		this.colaborador2 = new Colaborador(8, 50, Arrays.asList(new Dependente("maria"), new Dependente("joao")));
		this.colaborador3 = new Colaborador(8, 100, Arrays.asList(new Dependente("maria"), new Dependente("joao")));
		
	}
	
	@Test
	public void calculaSalarioBruto() {
		FolhaPagamento salario = new FolhaPagamento();
		assertEquals(500.0, salario.calculoSalarioBruto(this.colaborador2), 0.00001);
	}
	
	@Test
	public void calculaDescontoINSSMenorQueMil() {
		FolhaPagamento salario = new FolhaPagamento();
		assertEquals(42.5, salario.calculoDescontoINSS(this.colaborador2), 0.00001);
	}
	
	@Test
	public void calculaDescontoINSSMaiorQueMil() {
		FolhaPagamento salario = new FolhaPagamento();
		assertEquals(0.0, salario.calculoDescontoINSS(this.colaborador1), 0.00001);
	}
	
	@Test
	public void calculaDescontoIRMenorIgual500() {
		FolhaPagamento salario = new FolhaPagamento();
		assertEquals(0, salario.calculoDescontoIR(this.colaborador2), 0.00001);
	}
	
	@Test
	public void calculaDescontoIRMaior500MenorIgual1000() {
		FolhaPagamento salario = new FolhaPagamento();
		assertEquals(0.0, salario.calculoDescontoIR(this.colaborador3), 0.00001);
	}
	
	@Test
	public void calculaDescontoIRMaior1000() {
		FolhaPagamento salario = new FolhaPagamento();
		assertEquals(0.0, salario.calculoDescontoIR(this.colaborador1), 0.00001);
	}
	
	@Test
	public void calculaSalarioLiquido() {
		FolhaPagamento salario = new FolhaPagamento();
		assertEquals(1010.0, salario.calculoSalarioLiquido(this.colaborador1), 0.00001);
	}
	
}
