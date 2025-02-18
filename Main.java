import  java.util.*;
public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


//        1.Write a program to find all of the longest word in a given dictionary.
//        Example:
//        { "cat", "dog", "red", "is", "am" } Expected
//        Output:
//        "cat", "dog", "red"

//        System.out.println("Enter the length of array");
//        ArrayList<String> arr = new ArrayList<>();
//        int number = input.nextInt();
//        for (int i = 0; i < number; i++) {
//            System.out.println("Enter name " + (i + 1) + ":");
//            String name = input.next();
//            arr.add(name);
//        }
//        List<String> save = longestWord(arr);
//        System.out.println("The longest words are : "+save);
//    }
//
//    public static ArrayList<String> longestWord(ArrayList<String> arr) {
//       ArrayList<String> save = new ArrayList<>();
//       int max = 0;
//      for (String word : arr){
//          if (word.length()> max){
//              max = word.length();
//          }
//      }
//      for (String word : arr){
//          if (word.length()== max){
//              save.add(word);
//          }
//      }
////
////
//     return save;
//    }
//}

//********************************************************************************************************
//    2. Write a program that displays the number of occurrences of an element in the array.
//    Original Array:
//            [1,1,1,3,3,5]
//    Sample Output:
//3 occurs 2 times
//1 occurs 3 times
//9 occurs 0 time

//        System.out.println("Enter the size of array: ");
//        int array_size = input.nextInt();
//        ArrayList<Integer> arrNumber = new ArrayList();
//
//        for (int i = 0; i < array_size; i++) {
//            System.out.println("Enter elements of array: ");
//            int array_number = input.nextInt();
//            arrNumber.add(array_number);
//        }
//        System.out.println("Enter the number for search: ");
//        int LookingForNumber = input.nextInt();
//        int count = occurs(arrNumber, LookingForNumber);
//        System.out.println("The Array " + arrNumber + " the number you looking for is " + LookingForNumber + " ,occur " + count + " time");
//    }
//
//    public static int occurs(ArrayList<Integer> arr, int num) {
//
//        int count = 0;
//
//        for (int n : arr) {
//            if (n == num) {
//                count++;
//            }
//        }
//
//
//        return count;
//    }
//}

        //****************************************************************************************
//        3.Write a program to find the k largest elements in a given array. Elements in the array can be in
//        any order.
//        2
//        Original Array:
//[1, 4, 17, 7, 25, 3, 100]
//        Expected Output:
//        3 largest elements of the said array are:
//        100 25 17

//        int[] Arraynumbers = {1, 4, 17, 7, 25, 3, 100};
//
//        System.out.println("Enter how much of Large number you want :");
//        int k = input.nextInt();
//
//        ArrayList<Integer> last = LargestNumber(Arraynumbers, k);
//        System.out.print("The "+k+" largest number are : ");
//        for (int x : last) {
//            System.out.println(x + " ");
//        }
//
//
//    }
//
//    public static ArrayList<Integer> LargestNumber(int[] arr, int k) {
////        int a_length = arr.length;
//        ArrayList<Integer> result = new ArrayList<Integer>();
//        int max = 0;
////        int second_max = 0;
////        int third_max = 0;
//        for (int i = 0; i < k; i++) {
//            max = Integer.MIN_VALUE;
//            int m_max = -1;
//
//            for (int j = 0; j < arr.length; j++) {
//                boolean taken = false;
//
//                for (int n: result) {
//                    if (n == arr[j]) {
//                        taken = true;
//                        break;
//                    }
//                }
//                if (!taken && arr[j]> max){
//                    max = arr[j];
//                    m_max = j;
//                }
//            }
//            if (m_max != -1) {
//                result.add(max);
//            }
//
//        }
//        return result;
//    }
//}
        //*******************************************************************************
//        4. Create a method to reverse an array of integers. Implement the method without creating a new
//                array.
//                        Original Array:
//[5,4,3,2,1] Expected Output:
//        Reversed Array:
//        1 2 3 4 5

//        System.out.println("the length of array :");
//        int arr_size = input.nextInt();
//        ArrayList<Integer> TheArray = new ArrayList<>();
//        for (int i = 0; i < arr_size; i++) {
//            System.out.println("Enter numbers :");
//            int arr_number = input.nextInt();
//            TheArray.add(arr_number);
//        }
//        ReverseArray(TheArray);
//    }
//    public static void ReverseArray(ArrayList<Integer> arr){
//            for (int i = 0; i < arr.size() / 2; i++) {
//                int tem = arr.get(i);
//                arr.set(i, arr.get(arr.size() - 1 - i));
//                arr.set(arr.size() - 1 - i, tem);
//            }
//            System.out.println("The reverse Array :"+arr);
//
//    }

        //**************************************************************************************
//        6. Create a method that generates a random number within a given range. Allow the user to
//        specify the range and call the method to display random numbers.
//                Hint: use Random class
//        Sample Output:
//        3
//        Enter the minimum value of the range: 10
//        Enter the maximum value of the range: 100
//        Enter the number of random numbers to generate: 5 Random
//        numbers within the specified range:
//        71 - 98 - 96 - 71 - 71

//        System.out.println("Enter the minimum value of the range: ");
//        int min = input.nextInt();
//        System.out.println("Enter the maximum value of the range: ");
//        int max = input.nextInt();
//        System.out.println("Enter the number of random numbers to generate:");
//        int range = input.nextInt();
//
//
//        System.out.println("numbers within the specified range: ");
//        RangeNumbers(min, max, range);
//    }
//
//    public static void RangeNumbers(int min, int max, int range) {
//        Random ran = new Random();
//        int hold_min = ran.nextInt(min);
//        int hold_max = ran.nextInt(max);
//
//        for (int i = 0; i < range; i++) {
//            int randomNumber = ran.nextInt((max - min) + 1) + min;
//            System.out.println(randomNumber);
//
//            if (i != range -1){
//                System.out.print(" - ");
//            }
//        }
//        System.out.println();
//    }
//}
//**************************************************************************************
//        7. Write a program that checks the strength of a password. Create a method that evaluates a
//        password based on criteria like length, inclusion of special characters, and
//        uppercase/lowercase letters.
//                - We have three methods: checkLength, checkSpecialCharacters, and
//        checkUpperCaseLowerCase, each of which assigns a score based on specific criteria.
//                - The totalScore is calculated by adding the scores from these methods.
//        - Classify the password as strong (8 or more), moderately strong (5 or more), or weak
//        based on the totalScore. - The criteria for scoring:
//• Length: 0-5 characters (0 points), 6-7 characters (2 points), 8 or more characters
//                (3 points).
//• Special characters: Absence (0 points), Presence (2 points).
//• Uppercase and lowercase letters: Absence of both (0 points), presence of both (3
//        points).
//        Example:
//        Enter a password: 3456 Expected Output:
//        Password is weak.

//***************************************************************************************
//        8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
//                Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
//                and each subsequent number in the sequence is the sum of the two preceding ones.
//        4
//        Example:
//        Enter the number of Fibonacci terms to generate: 10
//        Expected Output:
//        Fibonacci sequence with 10 terms:
//        0 1 1 2 3 5 8 13 21 34


//        System.out.println("Enter the number of Fibonacci terms to generate : ");
//        int fib = input.nextInt();
//        for (int i = 0; i < fib ; i++) {
//            System.out.println(Fibonacci(i)+" ");
//        }
//
//    }
//        public static int Fibonacci(int fib) {
//            int number1 = 0;
//            int number2 = 1;
//
//            if (fib <= 1){
//                return fib;
//
//        }else return Fibonacci(fib - 1) + Fibonacci(fib - 2);
//
//        }

             //}
