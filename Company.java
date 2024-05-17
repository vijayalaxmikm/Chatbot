package startProject;
import java.util.Scanner;
public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);  
		        System.out.println("Chatbot: Hello! How can I assist you today?");         
		        while (true) {  
		            String userInput = scanner.nextLine(); 
		            if (userInput.equalsIgnoreCase("hi") || userInput.equalsIgnoreCase("Hi")) {  
		                System.out.println("Chatbot: Hi there!");  
		            }else if (userInput.equalsIgnoreCase("hello")) {  
		                System.out.println("Chatbot: Hi there!");  
		            } else if (userInput.equalsIgnoreCase("how are you?")) {  
		                System.out.println("Chatbot: I'm good, thank you. How about you?");  
		            } else if (userInput.equalsIgnoreCase("bye")) {  
		                System.out.println("Chatbot: Goodbye! Have a great day!");  
		                break;  
		            } else {  
		                System.out.println("Chatbot: Sorry, I didn't understand that.");  
		            }  
		        }  
		        scanner.close();  
		    }  
	}


