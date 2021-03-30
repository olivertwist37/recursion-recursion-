class Rstr{

   public String reverse(String word){
      if (word.length()==1)return word.substring(0,1);

      return reverse(word.substring(1,word.length()));
       
   }
}