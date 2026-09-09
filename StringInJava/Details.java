package StringInJava;

public class Details {

}

/*String :-
  -String is a Predefine class which is represents characters of sequences we can access all 
  character using index .it has length() method for count the characters .
  -if we write anything in the "any words " double quotes . it will consider in java as a String.
  -String class has multiple inbuilt methods (which is coded by the java developer) for manipulations 
  the String .
  
  -> Note : String is a Immutable(Unchangabel) obeject . if we make any changes in the String
     it will generate a new String object . it doesn't change the original String.
     -> Rules for making Immutable Class :-
       1. Make the Class final
       2.Make All properties private and final
       3.Initialized all the properties through the Constructor.
       4.provide only getters , don't provide settes
       
   --------------------------------------------------
  -> Immutable String -> String class
 -> Muttable String -> StringBuilder & StringBuffer
 
 => Strting Constant Pool:-
    -> if we create any String using "Literal" it will store in the SCP.
    SCP doen't store the duplicate values .
    -Example :- 
     String name="Monu"; 
   
    -> if we create any String using new Keyword or using the refrence variable of 
     String class it will store in the Heap memory area.
      -Example :
           String name=new String("Ram");\
           or
           String name1=name+" Monu";
   -----------------------------------------------------------------------------------  
          
 */