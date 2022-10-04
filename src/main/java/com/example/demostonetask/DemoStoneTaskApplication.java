package com.example.demostonetask;

import com.example.demostonetask.controllers.Menu;
import com.example.demostonetask.models.entities.Necklace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoStoneTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoStoneTaskApplication.class, args);
		Menu.start();

	}
}
