import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

    // this day doesn't even teach anything about scopes
    public Difference(final int[] elements){
        this.elements = elements;

        for(final int a : elements)
            for(final int b : elements)
                if(a-b > maximumDifference)
                    maximumDifference = a-b;
    }

    // HackerRank fails to tell us a method must be created
    void computeDifference(){}

} // End of Difference class