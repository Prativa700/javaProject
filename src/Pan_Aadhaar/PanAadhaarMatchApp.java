package Pan_Aadhaar;

import java.util.Scanner;

public class PanAadhaarMatchApp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        AadhaarService aadhaarService= new AadhaarService();
        PanService panService=new PanService();

        System.out.println("Enter the AadhaarNumber ");
        String aadhaarNumber = sc.nextLine();
        Aadhaar aadhaar= aadhaarService.getAadhaarByNumber(aadhaarNumber);
        Pan pan = panService.getPanByAadhaarNumber(aadhaarNumber);

        if(aadhaar!=null && pan!=null)
        {
            System.out.println("Aadhaar Details: " + aadhaar);
            System.out.println("Pan Details: " + pan);
        }
        else {
            System.out.println("No match Found ");

        }

    }
}
