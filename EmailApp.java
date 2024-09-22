
package emailapp;

public class EmailApp {

    public static void main(String[] args) {
        Email emp = new Email("Mamun", "Akand");
        
        emp.setAltEmail("mamun.coding@gmail.com");
        emp.setCapacity(1000);
        emp.changePassword("123$@abc456");
        
        emp.showInfo();
//        System.out.println(emp.getAltEmail());
//        System.out.println(emp.getMailCapacity());
//        System.out.println(emp.getPassword());
        
    }
    
}
