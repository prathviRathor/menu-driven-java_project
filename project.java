import java.util.Scanner;
import java.io.PrintStream;
import java.util.Arrays;
public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            MenuDrivenProgram.clearScreen();
            System.out.println("Main Menu:");
            System.out.println("1. Array Operations");
            System.out.println("2. Strings");
            System.out.println("3. Patterns");
            System.out.println("4. Exit");   
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                arrayOperations(sc);
            }
            else if (choice == 2) {
                stringOperations(sc);
            }
            else if (choice == 3) {
                patternOperations(sc);
            } else if (choice == 4) {
                break;
            } else {
                System.out.println(" not valid try again.");
            }
        }
        sc.close();
    }

    public static void arrayOperations(Scanner sc) {
        MenuDrivenProgram.clearScreen();
        System.out.println("Array Operations:");
        System.out.println("1. Searching");
        System.out.println("2. Sorting");
        System.out.println("3. Deletion");
        System.out.println("4. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int arrayChoice = sc.nextInt();

        switch (arrayChoice) {
            case 1:
                arraySearch(sc);
                break;
            case 2:
                arraySorting(sc);
                break;
            case 3:
                arrayDeletion(sc);
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static void arraySearch(Scanner sc) {
        MenuDrivenProgram.clearScreen();
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }

    public static void arraySorting(Scanner sc) {
        MenuDrivenProgram.clearScreen();
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        MenuDrivenProgram.clearScreen();
        System.out.println("Sorting Menu:");
        System.out.println("1. Selection Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Back to Array Menu");
        System.out.print("Enter your choice: ");
        int sortChoice = sc.nextInt();

        switch (sortChoice) {
            case 1:
                selectionSort(arr);
                break;
            case 2:
                bubbleSort(arr);
                break;
            case 3:
                insertionSort(arr);
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid choice!");
        }

        MenuDrivenProgram.clearScreen();
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void arrayDeletion(Scanner sc) {
        MenuDrivenProgram.clearScreen();
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the index to delete: ");
        int index = sc.nextInt();

        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }

        // Create a new array with the size reduced by one
        int[] newArr = new int[size - 1];
        for (int i = 0, j = 0; i < size; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }

        System.out.println("Array after deletion:");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Sorting algorithms
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void stringOperations(Scanner var0) {
      MenuDrivenProgram.clearScreen();
      System.out.println("String Operations:");
      System.out.println("1. Search for a substring");
      System.out.println("2. Sort characters in a string");
      System.out.println("3. Delete character at a specific position");
      System.out.println("4. Delete substring");
      System.out.println("5. Reverse a string");
      System.out.println("6. Convert to uppercase");
      System.out.println("7. Convert to lowercase");
      System.out.println("8. Back to Main Menu");
      System.out.print("Enter your choice: ");
      int var1 = var0.nextInt();
      var0.nextLine();
      switch (var1) {
         case 1:
            stringSearch(var0);
            break;
         case 2:
            stringSorting(var0);
            break;
         case 3:
            stringDeletion(var0);
            break;
         case 4:
            deleteSubstring(var0);
            break;
         case 5:
            reverseString(var0);
            break;
         case 6:
            convertToUppercase(var0);
            break;
         case 7:
            convertToLowercase(var0);
            break;
         case 8:
            return;
         default:
            System.out.println("Invalid choice!");
      }

   }

   public static void stringSearch(Scanner var0) {
      System.out.print("Enter the main string: ");
      String var1 = var0.nextLine();
      System.out.print("Enter the substring to search: ");
      String var2 = var0.nextLine();
      if (var1.contains(var2)) {
         PrintStream var10000 = System.out;
         int var10001 = var1.indexOf(var2);
         var10000.println("Substring found at index: " + var10001);
      } else {
         System.out.println("Substring not found.");
      }

   }

   public static void stringSorting(Scanner var0) {
      System.out.print("Enter the string to sort: ");
      String var1 = var0.nextLine();
      char[] var2 = var1.toCharArray();
      Arrays.sort(var2);
      PrintStream var10000 = System.out;
      String var10001 = new String(var2);
      var10000.println("Sorted string: " + var10001);
   }

   public static void stringDeletion(Scanner var0) {
      System.out.print("Enter the string: ");
      String var1 = var0.nextLine();
      System.out.print("Enter the position of character to delete (0-based index): ");
      int var2 = var0.nextInt();
      if (var2 >= 0 && var2 < var1.length()) {
         String var10000 = var1.substring(0, var2);
         String var3 = var10000 + var1.substring(var2 + 1);
         System.out.println("String after deletion: " + var3);
      } else {
         System.out.println("Invalid position.");
      }

   }

   public static void deleteSubstring(Scanner var0) {
      System.out.print("Enter the main string: ");
      String var1 = var0.nextLine();
      System.out.print("Enter the substring to delete: ");
      String var2 = var0.nextLine();
      String var3 = var1.replace(var2, "");
      System.out.println("String after deletion of substring: " + var3);
   }

   public static void reverseString(Scanner var0) {
      System.out.print("Enter the string to reverse: ");
      String var1 = var0.nextLine();
      String var2 = (new StringBuilder(var1)).reverse().toString();
      System.out.println("Reversed string: " + var2);
   }

   public static void convertToUppercase(Scanner var0) {
      System.out.print("Enter the string: ");
      String var1 = var0.nextLine();
      String var2 = var1.toUpperCase();
      System.out.println("Uppercase string: " + var2);
   }

   public static void convertToLowercase(Scanner var0) {
      System.out.print("Enter the string: ");
      String var1 = var0.nextLine();
      String var2 = var1.toLowerCase();
      System.out.println("Lowercase string: " + var2);
   }

    // Pattern operations
    public static void patternOperations(Scanner sc) {
        MenuDrivenProgram.clearScreen();
        System.out.println("Pattern Operations:");
        System.out.println("Choose a pattern to display:");
        System.out.println("1. Right-angled Triangle");
        System.out.println("2. Inverted Right-angled Triangle");
        System.out.println("3. Pyramid");
        System.out.println("4. Diamond");
        System.out.println("5. Hollow Square");
        System.out.println("6. Number Pyramid");
        System.out.println("7. Floyd's Triangle");
        System.out.println("8. Right-angled Triangle with Numbers");
        System.out.println("9. Hollow Pyramid");
        System.out.println("10. Inverted Pyramid");
        System.out.println("11. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int patternChoice = sc.nextInt();

        if (patternChoice >= 1 && patternChoice <= 10) {
            MenuDrivenProgram.clearScreen();
            displayPattern(patternChoice);
        } else if (patternChoice == 11) {
            return;
        } else {
            System.out.println("Invalid choice!");
        }
    }

    public static void displayPattern(int patternNumber) {
        switch (patternNumber) {
            case 1:
                pattern1();
                break;
            case 2:
                pattern2();
                break;
            case 3:
                pattern3();
                break;
            case 4:
                pattern4();
                break;
            case 5:
                pattern5();
                break;
            case 6:
                pattern6();
                break;
            case 7:
                pattern7();
                break;
            case 8:
                pattern8();
                break;
            case 9:
                pattern9();
                break;
            case 10:
                pattern10();
                break;
            default:
                System.out.println("Invalid pattern number.");
        }
    }

    // Pattern methods
    public static void pattern1() {
        System.out.println("Pattern 1: Right-angled Triangle");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2() {
        System.out.println("Pattern 2: Inverted Right-angled Triangle");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3() {
        System.out.println("Pattern 3: Pyramid");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern4() {
        System.out.println("Pattern 4: Diamond");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern5() {
        System.out.println("Pattern 5: Hollow Square");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern6() {
        System.out.println("Pattern 6: Number Pyramid");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern7() {
        System.out.println("Pattern 7: Floyd's Triangle");
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void pattern8() {
        System.out.println("Pattern 8: Right-angled Triangle with Numbers");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern9() {
        System.out.println("Pattern 9: Hollow Pyramid");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern10() {
        System.out.println("Pattern 10: Inverted Pyramid");
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
    

class MenuDrivenProgram {
    public static void clearScreen() {
        System.out.flush();
    }
}
