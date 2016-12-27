/**
 * Created by alan on 18/11/16.
 */
import java.util.Random;

abstract class compartment
{

    abstract void notice();

}
class ladies extends compartment
{
    void notice()
    {
        System.out.println(" Welcome to Ladies compartment:");

    }
}
class general extends compartment
{
    void notice()
    {
        System.out.println("Welcome to General compartment:");

    }
}
class firstclass extends compartment
{
    void notice()
    {
        System.out.println("Welcome to First class compartment:");

    }
}
class luggage extends compartment
{
    void notice()
    {
        System.out.println("Welcome to Luggage compartment:");

    }
}

class testcompartment
{
    public static void main(String ar[]) {
        compartment cr[] = new compartment[10];
        for(int i=0;i<10;i++) {
            Random rm = new Random();
            int a = rm.nextInt(4) + 1;
            if (a == 1)
                cr[i] = new ladies();
            else if (a == 2)
                cr[i] = new general();
            else if (a == 3)
                cr[i] = new firstclass();
            else if (a == 4)
                cr[i] = new luggage();
        }
        for(int i=0;i<10;i++) {
            System.out.print("Token No "+(i+1) );
            cr[i].notice();
        }

    }
}

