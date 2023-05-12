package attendant;

import java.util.Scanner;

import javax.swing.JOptionPane;

import attendant.Saudacao;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		
		String response;
		boolean continua = true;
		
		System.out.println("Olá, seja muito bem vindo em nossa central de atendimento. Em que posso ajudar Sr(a)" + nome);
		
		
		while(continua) {
			System.out.println(nome);
			response = sc.nextLine();
			
			
			if(response.equalsIgnoreCase("sair")){
				continua = false;
				Saudacao saudacao = new Saudacao();
				System.out.println("Obrigado por entrar em contato com nossa central:" + saudacao.toString());
				
			}else {
				System.out.println("Atendente:  Entendi " + response);
				System.out.println("Atendente: que posso mais ajudar Sr(a)" + nome);
			}
			
			
		}
       sc.close();
	}
    
}
