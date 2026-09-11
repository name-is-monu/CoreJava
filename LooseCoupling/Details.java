package LooseCoupling;

public class Details {

}

/*1.Inheritance (IS-A Relationship):-
                 -Esme ham Parent class ko extends karke use methods and Properties ko use kar skte hai 
                  child class me jo Tight Coupling hota hai.
                  
  2.Composition (HAS-A Relationship):-
            -Esme ham jis class me jis kisi class ke methods and properties ka use karna chahate hai
             us class ka object banake other class me us class ke method and properties ka use 
             kar skte hai
             -Ye bhi tight coupling ho jata hai
             
  3.Assotion (USES-A Relationship):-
             -Esme ham Es Interface banate hai aur jo chije common hoti hai multiple
              class me use method ko ham interface me abstract likh dete hai
              aur esko o sabhi class implements karti hai aur us method ko override
              karke apne apne hisab se implements karti hai 
              -Aue jaisa hi ham jante hai ki Run Time Polymorephism achieved karne ke liye 
               Parent class ka reference and aur parent class ka method override hona chahiey 
               child me usi ka use karke ham Parent interface ka Reference variable bana lege 
               jisme ham kisi bhi class ka object pass karke uske andar ke Implemented methdo 
               ko easily class kar sket hai 
               -Yese achieved hota hai Loose Coupling ..
 
 */