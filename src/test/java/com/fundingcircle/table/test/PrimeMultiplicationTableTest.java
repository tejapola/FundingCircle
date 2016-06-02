package com.fundingcircle.table.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fundingcircle.table.util.TableUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/***
 * This class is used to create a multiplication table upto the number given.
 * Cucumber BDD methodology is used for Testing.
 * 
 * @author tejapolapragada
 */
public class PrimeMultiplicationTableTest {
	protected static Logger logger = LoggerFactory
			.getLogger(PrimeMultiplicationTableTest.class);
	TableUtil util = new TableUtil();
	static int inputNumber = 0;

	@Given("^an input of primeNumber table to be printed$")
	public void an_input_of_primeNumber_table_to_be_printed() throws Throwable {
		System.out
				.println("Starting the printing of Multiplication Table for FundingCircle");
	}

	@When("^the input is an integer \"(.*?)\"$")
	public void the_input_is_an_integer(String number) throws Throwable {
		inputNumber = Integer.valueOf(number);
		System.out.println("Input number is " + inputNumber);
		System.out.println();
		System.out.print("   |");
	}

	@SuppressWarnings("static-access")
	@Then("^print the table upto that number$")
	public void print_the_table_upto_that_number() throws Throwable {
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
	}
}
