import java.util.Random;
import java.util.Scanner;

public class captchaver {

   
    public static String captchamaker( char captcha[],  String cap){
       Random random = new Random(); 
       for(int i =0;i<5;i++){
        int j = random.nextInt(captcha.length);
        cap = cap+captcha[j];
       }
       
       return cap;
    }
    public static void main(String[] args) {
        char captcha[]="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray ();
        String cap="";
       String capt = captchamaker(captcha, cap);
       System.out.println(capt);
        System.out.println("enter chaptcha");
        Scanner st = new Scanner(System.in);
        String user = st.next();

       
    if(capt.equals(user)){
        System.out.println("VALID");
       }
       else
       System.out.println("INVALID");

    }

       
       
      }
     
      
          


