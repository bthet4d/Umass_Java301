
package bryanThetford.utilities;
/**
 *
 * @author Bryan
 */
public class Logger {
    private static int logLevel;
    private static boolean loggerEnabled;
    
    public static void setDetailDebug(){
        logLevel = 1;
    }
    public static void setDetailInfo (){
        logLevel = 2;
    }
    
    public static void setDetailWarning(){
        logLevel = 3;
    }
    
    public static void setDetailError (){
        logLevel = 4;
    }

       
    public static void logDebug(String strMessage)
    {
        if((loggerEnabled == true) && (logLevel == 1))
        {
            System.out.println(strMessage);
        }
    }
     
    public static void logInfo(String strMessage){
        if((loggerEnabled == true) && (logLevel <= 2))
        {
            System.out.println(strMessage);
        }
    }
     
     public static void logWarning(String strMessage)
     {
         if((loggerEnabled == true) && (logLevel <=3))
            {
                System.out.println(strMessage);
            }
     }
     
     public static void logError(String strMessage)
     {
        if((loggerEnabled == true) && (logLevel <= 4))
            {
                System.out.println(strMessage);
            }
     }
     
     public static void enableLogging()
     {
         loggerEnabled = true;
     }
     public static void disableLogging()
     {
         loggerEnabled = false;
     }
}//end main

 

