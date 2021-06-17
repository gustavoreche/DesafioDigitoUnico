package main;

public class Main {
	
	public static void main(String[] args) {
		new Main().digitoUnico(9875);
	}

	private void digitoUnico(long numero) {
		digitoUnico(numero, 1);
	}
	
	private void digitoUnico(long numero, long quantidadeVezesNumeroRepete) {
		String numeroComoTexto = String.valueOf(numero * quantidadeVezesNumeroRepete);	
		int soma = (int)numero;
		while (numeroComoTexto.length() != 1) {
			soma = 0;
			for (int umNumero = 0; umNumero < numeroComoTexto.length(); umNumero++) {
				soma = soma + Integer.parseInt(String.valueOf(numeroComoTexto.charAt(umNumero)));
			}
			numeroComoTexto = String.valueOf(soma);
		}
		
		System.out.println(soma);
		
	}

}
