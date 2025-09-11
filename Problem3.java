
public class Problem3
{
public static void main(String[] args)
    {
        double num = 867.5309;
        int truncNum = (int) (num * 1000);
        System.out.println(truncNum % 10);
        truncNum = truncNum / 10; 
        System.out.println(truncNum % 10);
        truncNum /= 10; 
        System.out.println(truncNum % 10);
        truncNum /= 10; 

    }   

}