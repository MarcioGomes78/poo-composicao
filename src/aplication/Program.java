package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.OrderItem;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product("TV", 1000.00);
		
		OrderItem oi1 = new OrderItem(1, 1000.00, p);
		
		System.out.println(oi1);
		sc.close();
		
	}

}
