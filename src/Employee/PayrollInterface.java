
package Employee;
import java.util.Scanner;
public class PayrollInterface {
    
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        Employee emp;
        String name;
        int type;
        double rate;
        int hours;
        String prompt;
        emp= new Employee();
        while(true){
            System.out.println("Enter employee data");
            System.out.println(">> Name (or <enter> to quit): ");
            name = reader.nextLine();
            if(!emp.setName(name)) break;
        
            while(true){
                System.out.print(">>> Type ("+emp.getTypeRules()+"): ");
                type= reader.nextInt();
                if(emp.setType(type)){
                    break;
                }
                reader.nextLine();
            }
            
            while(true){
                System.out.print(">>> Hourly rate ("+emp.getRateRules()+"): ");
                rate= reader.nextDouble();
                if(emp.setRate(rate)){
                    break;
                }
                reader.nextLine();
            }
            
            while(true){
                System.out.print(">>> Hours Worked ("+emp.getHourRules()+"): ");
                hours= reader.nextInt();
                if(emp.setHours(hours)){
                    break;
                }
                reader.nextLine();
            }
            System.out.println("=========================");
            System.out.format("The weekly pay for %s is %.2f \n\n", emp.getName(),emp.getPay());
            reader.nextLine();
        }
           
    }
    
}
