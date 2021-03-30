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
//From a given array of natural numbers, return the distance between the two closest numbers.
public class Question1 {
  // Returns the distance between the two closest numbers.

  static int distClosestNumbers(int[] numbers) {
    int result = 0;
    // try to implement it!
    return result;
  }

  public static void main(String[] args) {
    int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65};
    int result = distClosestNumbers(testArray);
    System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
  }
}
