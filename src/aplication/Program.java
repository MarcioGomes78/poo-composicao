package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Client cli = new Client("Marcio", "marcio@gmail.com", sdf.parse("13/12/1990"));
		
		System.out.println(cli);
		sc.close();
		
	}

}
