package Simplifica;

/**
 *
 * @author @Patricio Fernandez <patricio.fernandez.florez@gmail.com>
 */
public class Main {

    public static void main(String[] args) {
        
        simplifica(30, 27);
        
    }

   public static void simplifica(int n,int m)
   {
       int dividir=0;
       
       for (int i =2 ; i < n; i++) {
           
           if(n%i==0)
           {
               if(m%i==0)
               {
                   dividir=i;
                   break;
               } 
           }
       }
       
       if(dividir!=0)
       {
            simplifica(n/dividir,m/dividir);
       }
       else
       {
            System.out.println( n+"/"+m);
       }
   }

}
