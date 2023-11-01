public class StringBuff {
   public static void main(String[] args) {
      StringBuffer sb = new StringBuffer("Hello");
      StringBuffer k = new StringBuffer(""); 
      System.out.println("Capasity before append:"+k.capacity());
      System.out.println();   
      k.append("Java");
      k.append(" I love java."); 
      System.out.println("Capasity after appends:"+k.capacity());
      System.out.println(); 

      sb.append(" Java");  
      System.out.println("Append:"+sb);
      System.out.println();   

      sb.replace(0,5,"Program");
      System.out.println("Replace :"+sb);      
      System.out.println(); 

      sb.insert(0,"Fun ");
      System.out.println("Insert :"+sb);      
      System.out.println();

      sb.delete(0,5);
      System.out.println("Delete :"+sb);  
      System.out.println();

      sb.reverse();
      System.out.println("Reverse:"+sb);  
      System.out.println();

      k.reverse();
      System.out.println("Reverse:"+k);   
   }
}
      
      
