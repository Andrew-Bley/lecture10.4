import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        boolean done = false;
        double age = 0;
        String trash = "";
        double favNum = 0;
        double itemPrice = 0;
        double totalPrice = 0;
        double avPrice = 0;
        int numItems = 0;
        String rspYN = "";

        double grade = -1;
        double aveGrade= 0;
        int numGrade= 0;
        final double SENTINAL = -1 ;
        double totalGrades = 0;

        /*
        do
        {

        }while(condition)

        boolean done = false
        do
        {

        }while(!done);

         */



        done = false;
        do {

            System.out.print("\nEnter your age ");
            if (in.hasNextInt()) {
                age = in.nextInt();
                in.nextLine();
                System.out.println("You said your age is " + age);
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number");
            }
        }while (!done);



        done = false;
        do {
            System.out.print("Enter your fav num [1-10] ");
            if (in.hasNextInt()) ;
            {
                favNum = in.nextInt();
                in.nextLine();
                if (favNum >= 1 && favNum <= 10) {
                    System.out.println("You said your fav num is " + favNum);
                    done = true;
                } else
                {
                    System.out.println("You said said your fav num is " + favNum + " but that is out of range");
                }
            }
        }while(!done);



        done=false;
        do {
            System.out.print("Enter the price of your item ");
            if (in.hasNextDouble()) {
                itemPrice = in.nextDouble();
                in.nextLine(); //clear the buffer

                totalPrice += itemPrice; // totalPrice = totalprice + itemprice
                numItems++;
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash + " that is not a valid price");
            }

            System.out.print("Do you have another item [Y/N] ");
            rspYN = in.nextLine();
            if (rspYN.equalsIgnoreCase("N"))
            {
                done = true;
            }



        }while (!done);

        avPrice = totalPrice / numItems;

        System.out.println("The total number of items is " + numItems);
        System.out.println("The total price is " + totalPrice);
        System.out.println("The average price is " + avPrice);

        done = false;
        do {
            System.out.print("Enter the grade [0-100] or -1 to quit ");
            if (in.hasNextDouble())
            {
                grade = in.nextDouble();
                in.nextLine(); //clear the buffer

                if (grade != SENTINAL)
            {
                if (grade >=0 && grade <=100)
            {
                totalGrades += grade;
                numGrade++;
            }

            else
                {
                    System.out.println("You entered: " + trash + " that is not a valid grade");
                }
            else
                {
                    done = true;
                }
            }
        }while (!done);

        aveGrade = totalGrades / numGrade;

        System.out.println("The total number of grade is " + numGrade);
        System.out.println("The total of the grades is " + totalGrades);
        System.out.println("The average grade is " + aveGrade);

    }
}}