class Rpal{

   public boolean isPalendrome(String word){
      if (word.length()==1)return true;
      
      if(word.substring(0,1).equals(word.substring(word.length()-1,word.length()))) return isPalendrome(word.substring(1,word.length()-1));
      else return false;
   }
}