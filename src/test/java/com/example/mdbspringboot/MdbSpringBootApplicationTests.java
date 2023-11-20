package com.example.mdbspringboot;

import com.example.mdbspringboot.customer.Customer;
import com.example.mdbspringboot.product.Bonus;
import com.example.mdbspringboot.product.Product;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class MdbSpringBootApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void testCustomer() {
		Customer customer = new Customer("123","Radar","Malang","081");
		assertEquals("same", customer.getId(),"123");
		assertEquals("same", customer.getName(),"Radar");
		assertEquals("same", customer.getAddress(),"Malang");
		assertEquals("same", customer.getPhone(),"081");
	}
	@Test
	public void testProduct(){
		List<Bonus> bonusList [] = new List[2];
		Bonus bonus1 = new Bonus("Es Jeruk","/image/esjeruk");
		Bonus bonus2 = new Bonus("Appertize","/image/appertize");
		bonusList[0]= (List<Bonus>) bonus1;
		bonusList[1]= (List<Bonus>) bonus2;

		Product product = new Product("123","/image/frankfuther","Frank Further","Pizza","Toping Unta","10 Menit", "10 Menit", 435345.0, (Bonus[]) bonusList);
		assertEquals("same", product.getId(),"123");
		assertEquals("same", product.getName(),"Frank Further");

	}
	public  void testOrder(){

	}
}
