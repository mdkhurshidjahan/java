import java.util.*;


public class MinMax
{
    private static int min, max, minIndex, maxIndex;
    private static int[] array;

    public static void main(String[] args)
    {
        array = new int[13];
        getArray();
        printArray(); 

        
        System.out.println("The maximum value is: " + max);
        System.out.println("This is index number " + maxIndex + " in the list of numbers.");

        System.out.println("The minimum value is: " + min);
        System.out.println("This is index number " + minIndex + " in the list of numbers.");

    }

    public static void getArray()
    {
        min = Integer.MAX_VALUE;
        max = 0;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++)
        {
           
            System.out.print("Enter integer:  ");
            array[i] = sc.nextInt();

            if(array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            if(array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
    }

    public static void printArray()
    {
        System.out.println("\r\tIndex#\t\tArray Value");

        for (int i = 0; i < array.length; i++)
            System.out.printf("%13d%10d\r", i, array[i]);
        System.out.println();
    }
}