class Rtri{
    private static int x=0;
   public void triangle(int a){
       if (x<=a){
       printstars(x+1);
        if(a>1){
             x++; 
            triangle(a);
        }
    }
        
   }
}