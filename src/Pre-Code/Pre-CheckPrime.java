public class CheckPrime{
     public static void main(String []args){
     
        int i,m=0,flag=0;      
        int n=10;//it is the number to be checked    
        m=n/2;
        
        if(n==0||n==1){  
            System.out.println(n+" is not prime number");      
        }
        else{
            for(i=2;i<=m;i++){      
                if(n%i==0){      
                System.out.println(n+" is not prime number");      
                flag=1;      
                break;      
                }      
              } //End of if else
        
            if(flag==0){
            System.out.println(n+" is prime number");
            } 
            
        }//End of if 
    }// public static void main 
}

