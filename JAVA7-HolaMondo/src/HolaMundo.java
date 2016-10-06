/*
 * This program is part of my learning Java series
 * This one looks at if statements and switches
 * 
 * Find the blog here,
 * http://testsheepnz.blogspot.co.nz/2016/08/java-7-conditional-world-of-ifs.html
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Aug 2016
 */

public class HolaMundo {
 
       public static void helloWorld (int langID)
       {
              if (langID == 1)
              {
                     System.out.println("Spanish selected");
                     System.out.println("Hola Mundo!");
              }
              else if (langID == 2)
              {
                     System.out.println("German selected");
                     System.out.println("Hallo Welt!");
              }
              else if (langID == 3)
              {
                     System.out.println("French selected");
                     System.out.println("Bonjour le monde!");
              }     
              else
              {
                     System.out.println("English default");
                     System.out.println("Hello world!");            
              }
       }
      
       public static void improvedHelloWorld (int langID)
       {
			  switch (langID)
			  {
			         case 1:
			               System.out.println("Spanish selected");
			               System.out.println("Hola Mundo!");
			               break;
			         case 2:
			               System.out.println("German selected");
			               System.out.println("Hallo Welt!");                    
			         case 3:
			               System.out.println("French selected");
			               System.out.println("Bonjour le monde!");
			               break;
			         default:
			               System.out.println("English default");
			               System.out.println("Hello world!");     
			  }
       }
      
       public static void main(String[] args) {
             
              System.out.println("USING IF STATEMENTS");
             
              helloWorld(0);
              helloWorld(1);
              helloWorld(2);
              helloWorld(3);
              helloWorld(4);
             
              System.out.println();
              System.out.println();
              System.out.println("SWITCH STATEMENT");
              improvedHelloWorld(0);
              improvedHelloWorld(1);
              improvedHelloWorld(2);
              improvedHelloWorld(3);
              improvedHelloWorld(4);
       }
      
}