import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class LoopExercise {

    public static boolean isPrime(int numPrime) {
        boolean flagIsPrime = Math.abs(numPrime)==1||numPrime==0? false:true;
        for (int i = 2; i <= Math.sqrt(numPrime); i++) {
            if (numPrime % i == 0) {
                flagIsPrime = false;
                break;
            }
            return flagIsPrime;
        }

        return flagIsPrime;
    }


    public static void numEndFlow (int num){
        for (int i = num; i>0; i--){
            System.out.print(i);
        }
    }

    public static void numFlow (int num) {
        for (int i = 2; i <= num; i++) {
            System.out.print(i);
        }
    }


    public static char atbashCode(char ogChar){
       String allChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       int index = allChar.indexOf(ogChar);

       int cipherIndexHigher = 12;
       int cipherIndexLower = 25;

      if (index<=12)
       for (int i=1;i<=index;i++){

               cipherIndexLower -=1;
           }
      else {
          for (int i = 13; i<index; i++) {
              cipherIndexHigher -=1;
          }
      }

       return index<=12?allChar.charAt(cipherIndexLower):allChar.charAt(Math.abs(cipherIndexHigher));
    }

    public static void main(String[] arg) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to do today? ლ(•ω •ლ)");
        System.out.println("(1) count to 10" +
                "\n(2) factorial operation" +
                "\n(3) exponents" +
                "\n(4) weird...calc formula, idk" +
                "\n(5) digit sum " +
                "\n(6) prime numbers until x (NO NEGATIVITY IN THIS HOUSE)" +
                "\n(7) Atbash code (Switch A to Z   ⃤ )" +
                "\n(8) (awesome) Number Pyramid");
        int userSelect = scan.nextInt();

        switch (userSelect) {

            case 1:
                // print 1-10
                for (int i = 1; i <= 10; i++) {
                    if (i == 1)
                        System.out.print(i);
                    else
                        System.out.print("," + i);
                }
                break;

            case 2:
                //factorial function


                System.out.println("Insert desired variable for factorial: ");
                int num = scan.nextInt();
                int sum = 1;

                for (int i = 1; i <= num; i++) {
                    sum *= i;
                }

                System.out.println(sum);
                break;

            case 3:
                // exponent with for loop
                System.out.println("Insert positive integer and a positive exponent : ");
                int base = scan.nextInt();
                int exponent = scan.nextInt();

                int solution = base;

                if (exponent > 0) {
                    for (int i = 1; i < exponent; i++) {
                        solution *= base;
                    }
                } else {
                    solution = 1;
                }
                System.out.println(base + " to the power of " + exponent + " equals " + solution +
                        "\n" + base + "^" + exponent + "=" + solution);
                break;

            case 4:
                //alternate function
                System.out.println("Insert desired variable for function (1-1/2+1/3-1/4....1/n): ");
                int numFunctionBase = scan.nextInt();

                double sumFunction = 0;
                for (int i = 1; i <= numFunctionBase; i++) {
                    if (i % 2 == 0) {
                        sumFunction -= 1.0 / i;
                    } else {
                        sumFunction += 1.0 / i;
                    }
                }

                System.out.println(sumFunction);
                break;

            case 5:
                // sum of digits

                System.out.println("please enter your number");
                String wholeNum = scan.next();

                int strLength = wholeNum.length();
                int sumOfDigits = 0;

                for (int i = 0; i < strLength; i++) {
                    char atIndex = wholeNum.charAt(i);
                    sumOfDigits += (atIndex - 48);
                }

                System.out.println(sumOfDigits);
                break;

            case 6:
                //print all primes until num

                System.out.println("please enter your number");
                int numPrimeReach = scan.nextInt();

                if (numPrimeReach >= 0) {
                    for (int i = 0; i < numPrimeReach; i++) {
                        System.out.println(LoopExercise.isPrime(i) ? i : "");
                    }
                } else {
                    System.out.println("please wait...");
                    for (int i = 0; i < 3; i++) {
                        TimeUnit.SECONDS.sleep(2);
                        System.out.print(".");

                    }
                    System.out.println("get out (ভ_ ভ) ރ");
                }
                break;

            case 7:
                //atbash code
                Scanner scan2 = new Scanner(System.in);
                System.out.println("enter you secret message  ۹(ÒہÓ)۶ - for example, 'buy gold' ");
                String secretMessage = scan2.nextLine();
                secretMessage = secretMessage.toUpperCase();

                System.out.println(secretMessage);
                int secretMessageLength = secretMessage.length();

                for (int i = 0; i < secretMessageLength; i++) {
                    System.out.print(LoopExercise.atbashCode(secretMessage.charAt(i)));
                }

                break;
            case 8:
                //number pyramid
                for (int i = 1, j = 1, p = 13; i <= 5; i++, j++, p -= 2) {

                    for (int k = p + i; k >= 0; k--) {
                        System.out.print(" ");

                    }

                    LoopExercise.numEndFlow(i);
                    if (j > 1) {
                        LoopExercise.numFlow(j);
                    }
                    System.out.println();


                }
        }

    }
}

















