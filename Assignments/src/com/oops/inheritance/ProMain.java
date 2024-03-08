package com.oops.inheritance;

public class ProMain {
   public static void main(String[] args) {
      TeamTwo teamTwo = new TeamTwo("IB",
              16,
              "Banking",
              "Rahul",
              new String[]{"junit", "Maven", "git", "docker"});
      teamTwo.showProjectDetails();
      teamTwo.showSupportTools();

      System.out.println();
      TeamOne teamOne=new TeamOne("ISRTC",
              25,
              "Transport",
              "Rahul","Java");
      teamOne.showProjectDetails();
      String[] techStack=teamOne.showTechStack();
      for(String tech:techStack)
         System.out.println(tech);
   }
}
