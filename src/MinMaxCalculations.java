import java.util.*;

import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

/**
 * A simple class to compute min and max of an array of numbers
 */
public class MinMaxCalculations{
  public static double min(double ... numbers ){
    double min = Double.POSITIVE_INFINITY;
    for( double num: numbers){
      if(num < min ){
        min = num;
      }
    }
    
    return min;
  }
  public static double max(double ... numbers ){
    double max = Double.NEGATIVE_INFINITY;
    for( double num: numbers){
      if(num > max ){
        max = num;
      }
    }
    
    return max;
  }
}
