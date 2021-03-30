/*
________             _________                      ___________           .__      
\_____  \ ________  /   _____/ ____   ______  _  __ \__    ___/___   ____ |  |__   
 /   |   \\___   /  \_____  \ /    \ /  _ \ \/ \/ /   |    |_/ __ \_/ ___\|  |  \  
/    |    \/    /   /        \   |  (  <_> )     /    |    |\  ___/\  \___|   Y  \ 
\_______  /_____ \ /_______  /___|  /\____/ \/\_/     |____| \___  >\___  >___|  / 
        \/      \/         \/     \/                             \/     \/     \/ 

Copyright (C) OzSnow PTY LTD - All Rights Reserved
Unauthorized copying of this file, via any medium is strictly prohibited
Proprietary and confidential

All software provided to any third party with a separate licence must be used for good and not evil!

Written by Nick Marko <tech@ozsnow.com>
 */

package au.com.ozsnowadventures.questions;

/**
 *
 * @author nickm
 */
        
        //Debug this so it runs correctly 
public class Question2 {
    public static void main(String[] args){  

      System.out.println("I am ready to play!");
      Scanner input = new Scanner(System.in);
      System.out.println("What's your age?");
      String userinput = input.nextLine();
      if (userinput < 13){
         System.out.println("You are allowed to play at your own risk");
      } else
            System.out.println("Play On!");
        }
      System.out.println("You are at an Iggy concert, and you hear this lyric 'Are you ready?, start       running.'");
      System.out.println("Suddenly, Iggy stops and says, 'Who wants to race me at running?'");

      Scanner input = new Scanner(System.in);
        System.out.println("Do you want to race Iggy on stage?");
        String userinput = input.nextLine();
        if (userinput == yes){
            "You and Iggy start racing. It's neck and neck! You win by a shoelace!");
        } else
            System.out.println("Oh no! Iggy shakes his head and sings 'I set a pace, so I can race without pacing.'");

        var feedback = prompt("Rate your game out of 10");
      if(feedback > 8)
      {
        console.log("Thank you! You should race again at the next concert!");
    }
      else
      {
        console.log("I'll keep practicing coding and racing.");
    }
    }
}
