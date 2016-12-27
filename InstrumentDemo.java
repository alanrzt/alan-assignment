
import java.util.*;
abstract class Instrument
{

    public abstract void play();

}

class Piano extends Instrument
{

    public void play()
    {
        System.out.println("Piano is playing tan tan tan tan:");
    }

}

class Flute extends Instrument
{

    public void play()
    {
        System.out.println("Flute is playing toot toot toot toot");
    }

}

class Guitar extends Instrument {

    public void play() {
        System.out.println("Guitar is playing tin tin tin ");
    }

}
public class InstrumentDemo{
    public static void main(String args[])
    {
Instrument[] In=new Instrument[10];
In[0]=new Piano();
        In[1]=new Guitar();
        In[2]=new Flute();
        In[3]=new Piano();
        In[4]=new Guitar();
        In[5]=new Flute();
        In[6]=new Piano();
        In[7]=new Guitar();
        In[8]=new Flute();
        In[9]=new Flute();
for(int i=0;i<10;i++)
{
    In[i].play();
}

    }

}

