public class forloop {
    public static void main(String[] args) {
        
        for(int i = 0; i<6; i++){
            System.out.println(i);
        }
        System.out.println("-----------------------");
                
        String[] auta = {"BMW","Audi","Ford"};
        
        for (String x : auta){
            System.out.println(x);
        }
        System.out.println("--------------");
        //tabliczka mnożenia (pętla w pętli) 
        
        for (int z =1; z < 10; z++)
        {
            for (int x=1; x<10; x++)
            {
                System.out.print(x*z + " ");
            }
            System.out.println();
        }
        
        System.out.println("-------------------------");
        
        //break i continue
        
        for (int y=0; y < 10; y++){
            
            if (y % 2 != 0)
                continue;
            
            System.out.println(y);
        }
    }
}
