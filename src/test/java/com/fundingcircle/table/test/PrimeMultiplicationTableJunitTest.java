package com.fundingcircle.table.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fundingcircle.table.util.TableUtil;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/***
 * This class is used to create a multiplication table upto the number given.
 * Cucumber BDD methodology is used for Testing.
 * 
 * @author tejapolapragada
 */
public class PrimeMultiplicationTableJunitTest {
	protected static Logger logger = LoggerFactory
			.getLogger(PrimeMultiplicationTableJunitTest.class);
	TableUtil util = new TableUtil();
	static int inputNumber =0;
	
	static {
		try{
			inputNumber	 = Integer.valueOf(System.getProperty("number"));
		}catch(Exception e){
			try {
				throw new Exception("Input Number is really large.");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	@Test
	public void the_input_is_an_integer() throws Throwable {
		System.out.println();
		System.out.println();
		System.out.println("***********************************************");
		System.out.println("Input number is " + inputNumber);
		System.out.println();
		System.out.print("   |");
	}

	@SuppressWarnings("static-access")
	@Test
	public void print_the_table_upto_that_number() throws Throwable {
		
		try{
		for (int i = 1; i <= inputNumber; i++)

			if (util.checkPrime(i))
				System.out.print(util.addSpaces(i) + " ");
			else
				continue;

		System.out.println();
		System.out.print("---+");
		
		for (int i = 1; i <= inputNumber; i++)
			if (util.checkPrime(i))
				System.out.print("----");
		System.out.println();
		for (int i = 1; i <= inputNumber; i++) {
			if (util.checkPrime(i))
				System.out.print(util.addSpaces(i) + "|");
			else
				continue;
			for (int j = 1; j <= inputNumber; j++) {
				if (util.checkPrime(j) && util.checkPrime(j))
					System.out.print(util.addSpaces(i * j) + " ");
			}
			System.out.println();
			
		}
		System.out.println("***********************************************");
		System.out.println();
		System.out.println();
		
		}catch(Exception e){
			throw new Exception("Input Number is really large.");
		}
	}
}
