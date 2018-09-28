/*Amir Yousef - Jr Developer Candidate
  Logical Expression Calculator Program
  Evaluates TRUE, FALSE, AND, OR, NOT, (), .
  Returns The Result As TRUE, FALSE, Or INVALID
*/

import java.util.*;                                                    //Java utility library
import javax.script.*;                                                 //Java scriping library

public class LogicalExpressionCalculator                               //Class LogicalExpressionCalculator start  
{

public static void main(String[] args)                                 //Method main() start
{

for(;;)                                                                //for loop restart the program without rerun
{	
//Prompt the user to input logical expression using {TRUE, FALSE, AND, OR, NOT, () and terminated by period "."}
System.out.print("\n\nENTER EXPRESSION USING TRUE, FALSE, AND, OR, NOT, () ENDED BY PERIOD:\n\n");
Scanner scan = new Scanner(System.in);                                 //Scan object to read the input strings
String str = scan.nextLine();                                          //Read the input strings into str
String [] array = str.split(" ");                                      //Initialize array by str 

if (str.endsWith("."))                                                 //Check termination by .
{
System.out.println("\n\nVALIDATING:");                                 //Validating user input
String token = " ";                                                    //Create string token

for (int i = 0; i < array.length; ++i)                                 //Loop array start
{

switch(array[i])                                                       //Switch array start
{
case "TRUE": 
System.out.println("TRUE");                                            //If the user enter TRUE 
token = token + " true ";
break;
case "FALSE": 
System.out.println("FALSE");                                           //If the user enter FALSE
token = token + " false ";
break;
case "NOT": 
System.out.println("NOT");                                             //If the user enter NOT 
token = token + " ! "; 
break; 
case "AND": 
System.out.println("AND");                                             //If the user enter AND 
token = token + " && "; 
break;
case "OR": 
System.out.println("OR");                                              //If the user enter OR 
token = token + " || ";
break;
case "(": 
System.out.println("(");                                                //If the user enter ( 
token = token + " ( "; 
break;
case ")": 
System.out.println(")");                                                //If the user enter ) 
token = token + " ) "; 
break;
case ".": 
System.out.println(".");                                                //If the user enter . 
token = token + " . "; 
break;
case "(TRUE": 
System.out.println("(TRUE");                                            //If the user enter (TRUE 
token = token + " (true "; 
break;
case "(FALSE": 
System.out.println("(FALSE");                                           //If the user enter (FALSE 
token = token + " (false "; 
break;
case "(NOT": 
System.out.println("(NOT");                                             //If the user enter (NOT
token = token + " (! "; 
break;
case "TRUE)": 
System.out.println("TRUE)");                                            //If the user enter TRUE) 
token = token + " true) "; 
break; 
case "FALSE)": 
System.out.println("FALSE)");                                           //If the user enter FALSE) 
token = token + " false) "; 
break;
case "TRUE.": 
System.out.println("TRUE");                                             //If the user enter TRUE. 
token = token + " true "; 
break; 
case "FALSE.": 
System.out.println("FALSE");                                            //If the user enter FALSE.
token = token + " false "; 
break; 
case ").": 
System.out.println(")");                                                //If the user enter ). 
token = token + " ) "; 
break; 
case "TRUE).": 
System.out.println("TRUE)");                                            //If the user enter TRUE). 
token = token + " true) "; 
break; 
case "FALSE).": 
System.out.println("FALSE)");                                           //If the user enter FALSE).
token = token + " false) "; 
break; 
default: 
System.out.println("INVALID");                                          //Default case is INVALID
token = token + " INVALID "; 
System.err.println("\n\nYOU HAVE ENTERED INVALID EXPRESSION!!!\n\n");   //Inform user that his input expression is invalid 
System.exit(1);
}                                                                       //Switch array end

}                                                                       //Loop array end

System.out.print("\n\nEXPRESSION =" + token.toUpperCase() + "\n\n");    //Print the user's expression in logic boolean form 

try                                                                     
{                                                                       //try exception loop start
ScriptEngineManager script = new ScriptEngineManager();                 //Create script object
ScriptEngine evaluate = script.getEngineByName("JavaScript");           //Create evaluate object
if (evaluate.eval(token) == evaluate.eval("true"))                      //Evaluate the expression
{
System.out.print("\n\nRESULT = TRUE\n\n\n");                            //If the value is true print RESULT = TRUE                           
}
else 
if (evaluate.eval(token) == evaluate.eval("false"))                                                                        
{
System.out.print("\n\nRESULT = FALSE\n\n\n");                           //If the value is false print RESULT = FALSE 
}
}                                                                       //try exception loop end                                                                       
catch(ScriptException e)                                                
{                                                                       //catch exception loop start 
System.out.println("\n\nYOU HAVE ENTERED INVALID EXPRESSION!!!\n\n");   //Inform user that his input expression is invalid
}                                                                       //catch exception loop end                                                                    
}                                                                       
else
{
System.out.print("\n\nTERMINATE YOUR EXPRESSION BY PERIOD!!!\n\n");     //Check termination by . end
}

}                                                                       //for loop end

}                                                                       //Method main() end

}                                                                       //Class LogicalExpressionCalculator end