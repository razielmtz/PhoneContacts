/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class MobilePhone {
    private ArrayList <Contact> contacts;

    public  MobilePhone() {
        contacts = new ArrayList <Contact>();
    }
    public boolean addContact(Contact contact){   
        if (findContact(contact.getName()) == -1){
            contacts.add(contact);
            return true;
        }
        return false;
    }
    public boolean addContact(String name,int number){
        return addContact(new Contact(name,number));
    }
    /*public Contact findContact(String name){
        for(Contact tempContact : contacts){
            if (tempContact.getName().equals(name)){
                return tempContact;
            }
        }
        return null;
    }*/
    public int findContact(String name){
        for(int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public boolean removeContact(Contact contact){
        int pos = findContact(contact.getName());
        if (pos == -1){
            return false;
        }
        contacts.remove(pos);
        return true;
    }
    public boolean removeContact(String name, int number){
        return removeContact(new Contact(name,number));
    }
    public boolean removeContact(String name){
        return removeContact(new Contact(name,123));
    }
    public boolean updateContact(Contact contact){
        int pos = findContact(contact.getName());
        if (pos == -1){
            return false;
        }
        contacts.get(pos).setName(contact.getName());
        contacts.get(pos).setNumber(contact.getNumber());
        return true;
    }
    public boolean updateContact(String name, int number){
        return updateContact(new Contact(name, number));
    }
    public void listContacts(){
        for(Contact tempContact : contacts){
            System.out.println(tempContact.toString());
        }
    }
    public String queryContact(String name) { 
        int pos = findContact(name);
        if(pos == -1){
            return "Contact not found";
        } else {
            return contacts.get(pos).toString();
        }
    }
    public void getContactsList(){
        String contactslist ="List of contacts:={\n";
        for (Contact contact : contacts) {
            contactslist= "\t" + contact + "\n";
        }
        contactslist += "}";
        System.out.print(contactslist);
    }
}

