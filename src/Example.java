import java.util.*;
public class Example {


        public static void main(String args[]){
            Scanner input = new Scanner(System.in);

            System.out.print("Enter Number 1 : ");
            int num1 = input.nextInt();

            System.out.print("Enter Number 2 : ");
            int num2 = input.nextInt();

            System.out.print("Enter Number 3 : ");
            int num3 = input.nextInt();

            System.out.println();
            while(true){
                System.out.println("A. Show Total");
                System.out.println("B. Show Maximum Number");
                System.out.println("C. Show Average Number ");
                System.out.println("X. Exit from program ");

                System.out.println();
                System.out.println("-->");
                String letter = input.next();

                int total1 = total(num1,num2,num3); // case: "C" ta ona nisa methana hdnw
                switch(letter){
                    case "A":
                        //int total1 = total(num1,num2,num3);
                        System.out.println("Total Number is " +total1 );
                        break;
                    case "B":
                        int max1 = max(num1,num2,num3);
                        System.out.println("Maximum Number is " + max1);
                        break;
                    case "C":
                        double avg1 = average(total1);
                        System.out.println("Average Number is " + avg1);
                        break;
                    case "X":
                        return;
                    default:
                        System.out.println("Envalid Entry");
                }
            }

        }

        public static int total(int number1, int number2, int number3){
            //int total = number1+number2+number3;
            return (number1+number2+number3);

        }

        public static int max(int number1, int number2, int number3){
            if(number1>number2){
                if(number1>number3){
                    return number1;
                }
            }else if(number2>number3){
                return number2;
            }
            return number3;

        }

        public	static double average(int totalNum){
            double avg = (double)totalNum/3;
            return avg;
        }



}
