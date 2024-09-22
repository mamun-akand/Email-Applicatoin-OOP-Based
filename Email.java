
package emailapp;
import java.util.Scanner;

public class Email {
    private String first_name;
    private String last_name;
    private String department;
    private String password;
    private int defaultPassSize = 8;
    private String email;
    private String alternate_email;
    private int mailbox_capacity = 500;
    private String company_name = "bigtech";
    
    //constructor for receiving f_name and l_name
    public Email(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
        System.out.println("E-mail created: " + this.first_name + " " + this.last_name);
        this.department = setDepartment();
        System.out.println("Department is " + this.department);
        this.password = randomPassword(defaultPassSize);
        System.out.println("Your Password : " + this.password);
        //generate email
        email = first_name.toLowerCase() + "." + last_name.toLowerCase() + "@" + department.toLowerCase() + "." + company_name + ".com";
        System.out.println("Email : " + email);
    }
    //ask for the department
    private String setDepartment(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Department Codes: ");
        System.out.println("1. Developer\n2. Accounts\n3. Management\n4. HR");
        System.out.println("Enter Department Code: ");
        
        int dept = inp.nextInt();
        if(dept == 1) return "Developer";
        else if(dept == 2 ) return "Accounts";
        else if(dept == 3 ) return "Management";
        else if(dept == 3 ) return "HR";
        else return "";
    }
    //random password
    private String randomPassword(int passLength){
        String setOfPassChar = "aBcDeFg&@?$hIjkLm&@?%$nOpqrSTUvWxYz&@?$";
        char[] generatedPassword = new char[passLength];
        
        for(int i=0; i<passLength; i++){
            int rand = (int)(Math.random() * setOfPassChar.length());
            generatedPassword[i] = setOfPassChar.charAt(rand);
        }
        return new String(generatedPassword);
    }
    
    public void setAltEmail(String alt_email){
        this.alternate_email = alt_email;
    }
    public void setCapacity(int capacity){
        this.mailbox_capacity = capacity;
    } 
    public void changePassword(String new_pass){
        this.password = new_pass;
    }
    
    public String getAltEmail(){
        return alternate_email;
    }
    public String getPassword(){
        return password;
    }
    public int getMailCapacity(){
        return mailbox_capacity;
    } 
    public void showInfo(){
        System.out.println("NAME: " + first_name + " " + last_name + "\n" +
                           "COMPANY EMAIL: " + email + "\n" +
                           "ALTERNATE EMAIL: " + alternate_email + "\n" +
                           "MAILBOX CAPACITY: " + mailbox_capacity + "\n" +
                           "DEPARTMENT: " + department + "\n" + 
                           "COMPANY NAME: " + company_name);
    }
    
}
