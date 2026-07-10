// Full Pyramids

//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//   ***
//    *

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows: \n");
        int rows = sc.nextInt();
        int nst=1;
        int nsp=rows-1;
        
        //   System.out.println();  // New Line 
        
        for(int i=1;i<=2*rows-1;i++){
            // each row
            
            
            // print space
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            
            // print star
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            
            
            
            if(i<rows){
                nst+=2;
                nsp--;
            }
            else{
                nst-=2;
                nsp++;
            }
            System.out.println();// New Line 
        }
       
    }
}