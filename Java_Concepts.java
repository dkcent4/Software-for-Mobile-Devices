/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SMD_First_Assignment;

import java.util.Scanner;

/**
 *
 * @author DANI
 */
public class Java_Concepts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int shift=0;
        while(shift==0)
        try{
        Scanner input=new Scanner(System.in);
       German_Shepard gs=new German_Shepard();
       String name;
        System.out.println("Enter the name of your German Shepard");
        name=input.next();
        System.out.println("Enter the age group of your German Shepard e.g adult or pup");
        String ageGroup=input.next();int temp=0;
        while(temp==0)
        {
            if(ageGroup.equals("adult")||ageGroup.equals("pup"))
                temp=1;
            else{
                System.out.println("Wrong input try again");
            ageGroup=input.next();
            }
         }
        temp=0;
        gs.setAgeGroup(ageGroup);
        German_Shepard.Fighter fighter=gs.new Fighter();
        German_Shepard.Pet pet=new German_Shepard.Pet();
        System.out.println("Enter your level of bond with the German Shepard e.g high or low");
        String levelOfBond=input.next();
         while(temp==0)
        {
            if(levelOfBond.equals("high")||levelOfBond.equals("low"))
                temp=1;
            else{
                 System.out.println("Wrong input try again");
            levelOfBond=input.next();      }   
         }
         temp=0;
        pet.setLevelOfBond(levelOfBond);
            System.out.println("");
        System.out.println("The Biodata and other info of your German Shepard is displayed below");
            System.out.println("");
        System.out.println("The name of the German Shepard is "+name);
        System.out.print("Does the German Shepard have fur: ");gs.HasFur();
        System.out.println("The number of eyes the German Shepard has are "+gs.getNumberOfEyes());
        System.out.println("The number of legs the German Shepard has are "+gs.getNumberOfLegs());
        System.out.print("The German Shepard ");
        gs.BasicWayOfTravel();
        System.out.print("The German Shepard breathes ");
        gs.meansOfBreathing();
        System.out.print("Does the German Shepard have wings: ");gs.hasWings();
        System.out.print("Can the German Shepard crawl on walls: ");gs.canCrawlOnWalls();
        System.out.print("The German Shepard ");gs.makeSound();   
         System.out.println("The age group of the German Shepard is "+gs.getAgeGroup());
        System.out.println("Your level of bond with your pet is "+pet.getLevelOfBond());
            System.out.print("The German Shepard has ");gs.getNumberOfTeeth();
        System.out.print("The German Shepard is a ");pet.remarks();
        System.out.print("The German Shepard is ");fighter.eligibility();
        shift=1;
        }
        catch(Exception e)
        {
            System.out.println("Error:  try again");
        }
    }
}
