import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("¬ведите число типа float: ");
        while(true){
            try{
                Scanner in= new Scanner(System.in);
                var a = Float.parseFloat(in.next());
                System.out.println(a);
                break;
            }
            catch(Exception ex){
                System.out.print("¬ведите число типа float: ");
            }
        }
    }
}
