
package mytimeclient;

public class MyTime 
{
    private String time;
    
    public void setMyTime(String input)
    {
        String stringarray[] = input.split(":|\\.|\\s+");
        System.out.println(stringarray[0]);
        
        int x = Integer.parseInt(stringarray[0]);
        System.out.println(x);
        
        if(0>x || x>12)
        {
            System.out.println("Error1");
        }
        
        String y = stringarray[1].substring(0,2);
        System.out.println(y);
        
        int z = Integer.parseInt(y);
        System.out.println(y);
        
        if(0>x || x>59)
        {
            System.out.println("Error2");
        }
            
        String a = stringarray[1].substring(2);
        System.out.println(a);
        a = a.trim();
        System.out.println(a);
        
        if(!((a.equals("am")) || (a.equals("pm"))))
        {
            System.out.println("Error3");
        }
        
        
        
        
    }
}

//split, index
//parseInt
//substring
//time=input;

//NumberFormatException