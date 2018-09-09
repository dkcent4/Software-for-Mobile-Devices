/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SMD_First_Assignment;

/**
 *
 * @author DANI
 */
final public  class German_Shepard extends Dog implements Animal,Mammal {
    private String name;  
    private String ageGroup;

   public void setName(String name) {
        this.name = name;
    }
   
    public String getAgeGroup() {
        return ageGroup;
    }
    
    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

  static final private int no_eyes=2;
   static final private int no_legs=4;
    final public void HasFur()
    {
        System.out.println("Yes");
    }
    final public int getNumberOfEyes()
    {
        return no_eyes;
    }
    final public int getNumberOfLegs()
    {
        return no_legs;
    }
    final public void BasicWayOfTravel()
    {
        System.out.println("walks");
    }            
    final public void meansOfBreathing()
    {
        System.out.println("through nose");   
    }
    final public void hasWings()
    {
        System.out.println("No");
    }
    final public void canCrawlOnWalls()
    {
        System.out.println("No");
    }
    final public void getNumberOfTeeth()
    {
           if(ageGroup.equals("adult"))
               System.out.println("42 teeth");
           else if(ageGroup.equals("pup"))
               System.out.println("28 teeth");
    };
    public class Fighter
    {
      public void eligibility(){
        if(German_Shepard.this.ageGroup.equals("adult"))
            System.out.println("eligible fighter");
        else if(German_Shepard.this.ageGroup.equals("pup"))
                System.out.println("not eligible fighter");
           }
    }
    public static class Pet
    {
        private String levelOfBond;

        public String getLevelOfBond() {
            return levelOfBond;
        }

        public void setLevelOfBond(String leveOfBond) {
            this.levelOfBond = leveOfBond;
        }
      public void remarks()
      {
          if(this.levelOfBond.equals("high"))
              System.out.println("Good pet");
          else if(this.levelOfBond.equals("low"))
              System.out.println("Bad pet");
    }
}
}