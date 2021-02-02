//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListTotal
{
 public static int total( List<Integer> ray )
 {
  //initialize an int variable to store 0
  int sum = 0;
  //start a for each loop to go through the entire list
  for(int i: ray)
  {
    //add the each value in the list to the int variable created
    sum += i;
  }
  //return sum
  return sum;
 }
}