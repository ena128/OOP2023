import java.sql.SQLOutput;
import java.util.Scanner;

/*public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String pass="enaslx";
        String passatt;


        while(true)
        {
            System.out.println("Enter a password: ");

            passatt=reader.nextLine();
            if(passatt.equals(pass))
            {
                System.out.println("Right");
                System.out.println("seceret: lala");
                break;


            }
            else {
                System.out.println("Wrong ");
            }


        }
    }
}*/
/*public class Main{
    public static void main(String[] args ){
        Scanner reader=new Scanner(System.in);
        int sum=0;
        int read;
        int i=0;
        while(i<3)
        {
            System.out.println("Enter a number:");
            read=reader.nextInt();
            sum+=read;
            i++;
        }
        System.out.println("sum is: " + sum);
        }
        }*/
/*public class Main{
    public static void main(String [] args){
        Scanner reader= new Scanner(System.in);
        int sum=0;
        while(true)
        {
            System.out.println("Enter a number:");
            int read=Integer.parseInt(reader.nextLine());
            if(read==0)
            {
                break;
            }
            sum+=read;
            System.out.println("sum now: "+sum);

        }
        System.out.println("sum is:"+sum);
    }
}*/
/*public class Main{
    public static void main(String[] args)
    {
        Scanner reader= new Scanner(System.in);
        System.out.println("enter first number:");
        int first=Integer.parseInt(reader.nextLine());
        System.out.println("enter second number:");
        int second=Integer.parseInt(reader.nextLine());
        if(second<first)
        {
            System.out.println("");
        }

        while(first<=second)
        {
            System.out.println(first);
            first++;
        }


    }
}*/
/*public class Main{
    public static void main(String[] args)
    {
        int sum=0;
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=Integer.parseInt(reader.nextLine());
        for(int i=0;i<=number;i++)
        {
            int result = (int)Math.pow(2, i);
            sum+=result;

        }
        System.out.println("The result is: "+sum);
    }
}*/
public class Main{
    /*public static void main(String[] args)
    {
        printText();
    }
    public static void printText()
    {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }*/
    /*public static void main(String [] args)
    {
        printStar(5);
        printStar(3);
        printStar(9);
    }
    public static void printStar(int amount)
    {
        for(int i=0;i<amount;i++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }*/
    /*public static void main(String[] args){
        printPyramid(5);
        printPyramid(6);
    }
    public static void printPyramid(int amount){
        for(int i=0; i<=amount;i++)
        {
            for(int j=0; j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }*/
    /*public static void main(String[] args){
        printPyramid(5);
        printPyramid(6);
    }
    public static void printPyramid(int amount){
        for(int i=1; i<=amount;i++)
        {
            for(int j=1; j<i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
//if we want the same numbers printed like 1,22,333,444... we should just print out the i
    }*/

}



