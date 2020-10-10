package com.abstractions;

   public class Completedideas implements CompanyIdea,CompanyIdea2{

	public void Model() {
		System.out.println("Car as Adi");
	}

	public void Engine() {
		System.out.println("Import from China");
			
	}
	public void carBody() {
		System.out.println("Body should be mishobi");
		
		}

	public void getEmployees() {
		System.out.println("Employees as supervisor his name Jeff");
		
		}

	public void getSalary() {
		System.out.println("Employees get salary: 120000.00");
		
	}

	public void getCar() {
		System.out.println("Employees new car as mercedes-Benz:");
		
	}

	public void getMedicare() {
		System.out.println("Full madicare coverage");
		
		
	}
public static void main(String[] args) {
	Completedideas obj = new Completedideas();
	obj.Model();
	obj.Engine();
	obj.carBody();
	obj.getEmployees();
	obj.getSalary();
	obj.getCar();
	obj.getMedicare();
	
	
}
}