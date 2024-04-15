package n1exercici1;

public class S1_T6_N1EX1_Luis_Chicott {

	public static void main(String[] args) {
	
		int value1 = 5; 
		int value2 = 10; 
		int value3 = 15; 
		
		NoGenericMethods object1 = new NoGenericMethods(value1,value2,value3); 
		NoGenericMethods object2 = new NoGenericMethods(value2,value3,value1); 
		NoGenericMethods object3 = new NoGenericMethods(value3,value2,value3); 
		
		System.out.println("Value1: " + object1.getValue1() + " | Value2: " + object1.getValue2() +  " | Value3: " + object1.getValue3());
		System.out.println("Value1: " + object2.getValue1() + " | Value2: " + object2.getValue2() +  " | Value3: " + object2.getValue3());
		System.out.println("Value1: " + object3.getValue1() + " | Value2: " + object3.getValue2() +  " | Value3: " + object3.getValue3());
		
		
	}

}
