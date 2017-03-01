/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class PhoneContacts {

    /**
     * @param args the command line arguments
     */
    public static MobilePhone myPhone = new MobilePhone(); 
    public static Scanner teclado = new Scanner(System.in);
        
    public static void main(String[] args) {
    
        int option;     
        printMenu();
        option = teclado.nextInt();
        while (option > 0 && option <7 ){
            
            switch(option){
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    queryContact();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    break;
            }
            System.out.println("Option");
            option = teclado.nextInt();
        }
    }
    public static void printMenu(){
        System.out.print(" MENU ");
        System.out.print("0: Quit ");
        System.out.print("1: Add Contact");
        System.out.print("2: Update Contact");
        System.out.print("3: Delete Contact ");
        System.out.print("4: Query Contact ");
        System.out.print("5: List of all Contacts ");
        System.out.print("6: Print options ");
        System.out.print("Option?");
    }
    public static void addContact(){
        String name;
        int number;
        System.out.println("Contact name: ");
        name = teclado.nextLine();
        System.out.println("Telephone number");
        number = teclado.nextInt();
        
        if (myPhone.addContact(name,number)){
            System.out.println("Contact succesfully added");
        }
        else{ 
            System.out.println("Contact already in list");
        }   
    }
    public static void updateContact(){
        String name;
        int number;
        System.out.println("Change contact name: ");
        name = teclado.nextLine();
        System.out.println("Change telephone number");
        number = teclado.nextInt();
        
        if (myPhone.updateContact(name,number)){
            System.out.println("Contact succesfully updated");
        }
        else{ 
            System.out.println("Contact doesn't exist");
        }   
    }
    public static void deleteContact(){
        String name;
        int number;
        System.out.println("Contact name: ");
        name = teclado.nextLine();
        System.out.println("Telephone number");
        number = teclado.nextInt();
        
        if (myPhone.removeContact(name,number)){
            System.out.println("Contact succesfully removed");
        }
        else{ 
            System.out.println("Contact is not in the list");
        }
    
    }
    public static void queryContact(){
        String name;
        int number;
        System.out.println("Contact name: ");
        name = teclado.nextLine();       
        myPhone.queryContact(name);       
    }  
    
}
