
package ifstatement;

public class If {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int amount =19800;
        int numtransction =0;
        int date =25;
        int ppa = 25;
        int pv = 1;
        
        if(date > 25 && amount ==19800){
            if(ppa>=25 && pv == 1){
            System.out.print("pay corpers their alawe\n");}
            numtransction++;
          
        }else if(date>26)
        {
        System.out.print("we are ready for our alawe");
        }
        
        else if(amount==40000){
             System.out.print("Dont graduate from NYSC");
        
        }
        else{ System.out.print("Stop NySC");}
    }
    
}
