package main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;
import com.google.gson.Gson;


public class Conversor {
	
	public static void main(String[] args) {

		Scanner scannerValor = new Scanner(System.in);
        String moeda;
        String apiKey = null; // Inserir sua APIKEY Exchange Rate
        double valor;

        while (true) {
            System.out.println("************************************** ");
            System.out.println("Digite um valor (ou 'sair' para encerrar): ");
            String inputValor = scannerValor.nextLine();

            
            if (inputValor.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                valor = Double.parseDouble(inputValor); 
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
                continue; 
            }

            System.out.println("Valor a ser convertido: " + valor);
            System.out.println();
            System.out.println("Digite uma moeda, exemplo: USD, EUR, JPY, GBP, CHF, AUD, CAD");
            moeda = scannerValor.nextLine();
            System.out.println();

            String realParaOutraMoeda = "https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/BRL/" + moeda + "/" + valor;

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(realParaOutraMoeda))
                        .build();
                HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

                String json = response.body();

                Gson gson = new Gson();
                DadosAPI dados = gson.fromJson(json, DadosAPI.class);
              
                System.out.println("Código da Moeda Alvo: " + dados.getTarget_code());
                System.out.println("Resultado da Conversão em " +dados.getTarget_code() + " -> "  + dados.getConversion_result());
                System.out.println("Taxa de Conversão em R$: " + dados.getConversion_rate());


		} catch (IOException e) {

			e.printStackTrace();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

        }
	}
}
