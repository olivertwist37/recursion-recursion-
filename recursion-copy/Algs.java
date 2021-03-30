class Algs{
   public int Gcf(int a, int b){
        if (a==b){
         return a; 
        }
        
        if (a>b)return Gcf(a-b,b);
        else return Gcf(a,b-a);
        
   }
}