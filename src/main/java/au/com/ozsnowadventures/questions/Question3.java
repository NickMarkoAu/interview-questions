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
//Write a method that detects if a string is a palindrome.
//Tip: Use word.charAt(i) to get the character at position i.
public class Question3 {

  public static void main(String[] args) {
    System.out.println(isPalindrome("racecar")); //True
    System.out.println(isPalindrome("wow")); //True
    System.out.println(isPalindrome("ozsnow")); //False
    System.out.println(isPalindrome("rotator")); //True
    System.out.println(isPalindrome("java")); //False
  }

  private static boolean isPalindrome(String word) {
    boolean result = false;
    //Your code here
    return result;
  }
}
