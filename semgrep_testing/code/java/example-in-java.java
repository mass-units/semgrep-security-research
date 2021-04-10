//based on rough code from phone screenshot
//this code needs to be redone, find how to access files/do something bad in java?

//good case:

public class Main
{
    public static void good_evaluate(String value)
    {
        String cmd = "";
        switch(value)
        {
            case 'a':
                cmd = "ls public";//do something similar using java 
            case 'b':
                cmd = "cat README";
            default:
                cmd = "echo bad";
        }
    eval(cmd);
    }   

    public static void bad_evaluate(String value)
    {
        String cmd = value;
        switch(value)
        {
            case 'a':
                cmd = "ls /public";//do something similar using Java
            case 'b':
                cmd = "cat README";
        }
        eval(cmd);
    }
    
    public static void main(String[] args)
    {
        good_evaluate("yeet");
        bad_evaluate("yeet");
    }
}



//for the semgrep rule it looks like we are looking for where the variable is set to the value without it being sanitized first
//with eval at the end

//maybe make a more complicated version where it is nested to see how to catch it