package br.com.trabalhoTDD.financeiro;

import br.com.trabalhoTDD.models.Colaborador;

public class FolhaPagamento {
	

	/**
	 * Metodo responsavel por fazer o calculo de salario bruto formula = horas
	 * trabalhadas * salario por hora + (50 * numero de dependentes)
	 * 
	 * @param qtHorasTrabalhada
	 * @param salarioHora
	 * @param numeroDependentes
	 * @return
	 */
	public float calculoSalarioBruto(Colaborador colaborador) {
		return colaborador.getQtHorasTrabalhada() * colaborador.getSalarioHora() + (50 * colaborador.getDependentes().size());
	}

	/**
	 * Metodo responsavel por fazer o calculo de desconto INSS bruto regra = salario
	 * bruto <= 1000 INSS = salario bruto * 8.5 / 100 regra = salario bruto > 1000
	 * INSS = salario bruto * 9 / 100
	 * 
	 * @param qtHorasTrabalhada
	 * @param salarioHora
	 * @param numeroDependentes
	 * @return
	 */
	public float calculoDescontoINSS(Colaborador colaborador) {
		float salarioBruto = this.calculoSalarioBruto(colaborador);
		if (salarioBruto <= 1000) {
			return (float) (salarioBruto * (8.5 / 100));
		} else {
			return (float) (salarioBruto * (9 / 100));
		}
	}

	/**
	 * Metodo responsavel por fazer o calculo de desconto IR bruto regra = salario
	 * bruto <= 500 IR = 0 regra = salario bruto > 500 e <= 1000 IR = salario bruto
	 * * 5 / 100 regra = salario bruto > 1000 IR = salario bruto * 7 / 100
	 * 
	 * @param qtHorasTrabalhada
	 * @param salarioHora
	 * @param numeroDependentes
	 * @return
	 */
	public float calculoDescontoIR(Colaborador colaborador) {
		float salarioBruto = this.calculoSalarioBruto(colaborador);
		if (salarioBruto <= 500) {
			return 0;
		} else if (salarioBruto > 500 && salarioBruto <= 1000) {
			return salarioBruto * (5 / 100);
		} else {
			return salarioBruto * (7 / 100);
		}
	}

	/**
	 * Metodo responsavel por fazer o calculo de salario liquido formula = salario
	 * bruto - INSS - IR
	 * 
	 * @param qtHorasTrabalhada
	 * @param salarioHora
	 * @param numeroDependentes
	 * @return
	 */
	public float calculoSalarioLiquido(Colaborador colaborador) {
		return this.calculoSalarioBruto(colaborador)
				- this.calculoDescontoINSS(colaborador)
				- this.calculoDescontoIR(colaborador);
	}

}
