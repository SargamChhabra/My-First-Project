import java.util.*; 
  
class SortStack 
{ 

    public static Stack<Integer> sortstack(Stack<Integer>  
                                             input) 
    { 
        Stack<Integer> tmpStack = new Stack<Integer>(); 
        while(!input.isEmpty()) 
        { 
            
            int tmp = input.pop(); 
          
             
            while(!tmpStack.isEmpty() && tmpStack.peek()  
                                                 > tmp) 
            { 
                
            input.push(tmpStack.pop()); 
            } 
              
        
        } 
        return tmpStack; 
    } 
}