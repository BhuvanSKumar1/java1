/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
   class outer{
    void display(){
       System.out.println("Outer class display method");}
    class inner{
        void display(){
        System.out.println("inner class display methods");
    }
   }
}
    public class LAB8{
        public static void main(String[] args){
           String title0="LAB 8 program-nested class";
           String title1="Develop a java program to create an outer class with a function display";
           String title2="Create another class inside the outer class named inner with a function display";
           String title3="Call the two functions in the main class";
           System.out.println(title0+"\n"+title1+"\n"+title2+"\n"+title3+"\n");
           outer o1=new outer();
           o1.display();
           outer.inner i1=o1.new inner();
           i1.display();
            
        }
    }
    
   
    
