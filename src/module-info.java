module ConversorMoedas {
	requires java.net.http;
	requires com.google.gson;
	
	opens main to com.google.gson;
}