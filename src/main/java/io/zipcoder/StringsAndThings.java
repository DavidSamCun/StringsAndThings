package io.zipcoder;


import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){           //DONE

        String[] arr = input.split(" ");
        int count = 0;
        char last;
        for (String ss : arr)  {
            System.out.println(ss);
            last = ss.charAt(ss.length()-1);
            if ((last == 'y') || (last == 'Y')) {
                count++;

                //(last == 'y' || (last == 'Y') || last == 'z' || last ='Z')
            } else if ((last == 'z') || (last == 'Z')){
                count++;

            } else {}
        }

        System.out.println("Count = " + count);
        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){         //DONE

        String output;
        //String[] arr = base.split(" "); //sort words into an array
        output = base.replace(remove, "");

        System.out.println(output);

        return output;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        Boolean result = false;
        int count1 = 0;
        int count2 = 0;
        Pattern pattern1 = Pattern.compile("is");
        Pattern pattern2 = Pattern.compile("not");
        Matcher match1 = pattern1.matcher(input);
        Matcher match2 = pattern2.matcher(input);
        while (match1.find())
            count1++;

        while (match2.find())
            count2++;

        System.out.println("is "+ count1 + " - not " + count2);
        if (count1 == count2){
            result = true;
        } else {}

        return result;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        boolean happy = false;

        char[] letters = input.toCharArray();


        for ( int i = 0; i < letters.length; i++){
            if( (letters[i] == 'g') && (letters[i+1] == 'g')){
                happy = true;
            } else if (i < 0 && (letters[i-1] !='g') && (letters[i] == 'g') && (letters[i+1] != 'g')){
                happy = false;
            } else {
            }
        }

//        for ( char letter : input.toCharArray())
//            if (letter.)


        return happy;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){

        int count1 = 0;
        Pattern pattern1 = Pattern.compile("is");
        Pattern pattern2 = Pattern.compile("not");
        Matcher match1 = pattern1.matcher(input);
        Matcher match2 = pattern2.matcher(input);
        while (match1.find())
            count1++;

        int length = input.length();

        for ( int i = 0; i <= length; i ++){
            
        }

        return null;
    }
}
