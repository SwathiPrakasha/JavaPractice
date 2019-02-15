package Collection_Map;

java.util.Hashtable<K,V>;
import java.util.*; 
class HashMap_Demo 
{ 
   public static void main(String args[]) 
   { 
       Map< String,Integer> hm =  
                        new HashMap< String,Integer>(); 
       hm.put("a", new Integer(100)); 
       hm.put("b", new Integer(200)); 
       hm.put("c", new Integer(300)); 
       hm.put("d", new Integer(400)); 
       Hashtable hT = new hashTable<Integer>(); 
  
       // Returns Set view      
       Set< Map.Entry< String,Integer> > st = hm.entrySet();    
  
       for (Map.Entry< String,Integer> me:st) 
       { 
           System.out.print(me.getKey()+":"); 
           System.out.println(me.getValue()); 
       } 
   } 
} 