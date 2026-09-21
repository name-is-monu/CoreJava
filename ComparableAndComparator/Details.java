package ComparableAndComparator;

public class Details {

}

/*Comparable & Comparator both are interface with is use to sort the userdefine object 
  Based on the specific object instance variables .
  
  => Different Betweent Comparable and Comparator :-
    -Comparable class ka ek hi default (natural) sorting rule define karta hai.
    -Comparator aapko multiple/custom sorting rules banane ki azaadi deta hai 
       (jaise kabhi age se sort karna, kabhi name se, kabhi marks se).
       
    -Comparable Interface ko jis Object ko sort karna hai use class ko esko implements 
     karna pardta hai aue eske method ko override karna padta hai jisse class change ho jati hai.
    -Comaparable Interface ko koe other class Implemets kar skti hai aur Collections.sort() me 
     ham jis object's list ko sort karna hai use and use class ka object pass
     kar skte hai jiske hisab se ye sort hoga .
 */