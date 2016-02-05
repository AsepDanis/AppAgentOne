package com.danis.agent.one;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.danis.agent.one.controller.ScormURLController;

@SpringBootApplication
public class AppAgentOneApplication implements CommandLineRunner {

	@Autowired
	private ScormURLController sc;
	private Scanner scanner;
	
	public static void main(String[] args) {
		SpringApplication.run(AppAgentOneApplication.class, args);
	}
	
	@Override
	public void run(String... strings) {
		
		String locationPath="E:\\Danis\\module-15-08-07\\module-15-08-07\\";
		
		scanner = new Scanner(System.in);
		boolean ya = true;
		
		while (ya) {
			String idLesson= scanner.nextLine();
			String keycode= scanner.nextLine();
			
			keycode = sc.readFile(locationPath.concat(keycode.trim())+".jsp");
			
			sc.getEditData(Long.valueOf(idLesson), keycode.trim());
			
			/*String no= scanner.nextLine();
			if (no.equalsIgnoreCase("no")) {
				ya = false;
			} else {
				ya = true;
			}*/
		}
	}
}
