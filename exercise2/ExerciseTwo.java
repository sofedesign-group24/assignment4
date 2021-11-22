import java.util.Scanner;
//import java.util.*;

public class ExerciseTwo  
{
    public static void main(String[] args) 
    {
        String laptop = "169430674724";
        String basketball = "103451243753";
        String globe = "164970367311";
        //long userBarcode; 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your barcode");
        String str = sc.next();
        if (str.equals("103451243753")) 
        {
            System.out.println("The product is Basketball and the barcode is" + basketball); 
        }
        else if (str.equals("169430674724")) 
        {
            System.out.println("The product is laptop and the barcode is" + laptop);
        }
        else if (str.equals("164970367311")) 
        {
            System.out.println("The product is globe and the barcode is" + globe);
        }
        else
        {
            System.out.println("The item does not exist. Please enter a valid barcode.");
        }

    }
}

