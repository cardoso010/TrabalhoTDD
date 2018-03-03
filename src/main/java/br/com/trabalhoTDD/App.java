package br.com.trabalhoTDD;

import java.util.Arrays;
import java.util.List;

import br.com.trabalhoTDD.financeiro.FolhaPagamento;
import br.com.trabalhoTDD.models.Colaborador;
import br.com.trabalhoTDD.models.Dependente;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	FolhaPagamento salario = new FolhaPagamento();
    	Colaborador colaborador = new Colaborador(8, 120, Arrays.asList(new Dependente("maria")));
    	
        System.out.println("Salario bruto > " + salario.calculoSalarioBruto(colaborador) );
        
        
        //System.out.println( 500.0 == salario.calculoSalarioBruto(8, 50, 2) );
    }
}
