//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            
            //declare integers length, width, and height;
            int length, width, height;
            
            //declare integers numberOfDoors and numberOfWindows;
            int numberOfDoors, numberOfWindows;
            
            //declare integers doorArea and windowArea
            int doorArea, windowArea;
            
            //declare double totalSqFt;
            double totalSqFt;
            
            //declare double paintNeeded;
            double paintNeeded;
            
            //Declare and initialize the length of the room
            length = 15;
            
            //Declare and initialize the width of the room
            width = 11;
            
            //Declare and initialize the height of the room
            height = 8;
            
            //Declare and initialize the number of doors in the room
            numberOfDoors = 1;
            numberOfWindows = 2;
            doorArea = 20;
            windowArea = 15;
            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
            totalSqFt = (2*(length * height)+ 2*(width * height) + (length * width));
            
            //Factor in the square feet of the doors and windows, which won't be painted
            totalSqFt -= ((numberOfDoors * doorArea)) + (numberOfWindows * windowArea);
            
            //Compute the amount of paint needed
            paintNeeded = totalSqFt / 350;
            //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
            System.out.println("Painting a room that is "+ length +" feet long, " + width + " feet wide, " + height + " feet high,");
            System.out.println(" has " + numberOfDoors + " doors and " + numberOfWindows + " windows, ");
            System.out.println("requires "+ paintNeeded + " gallons of paint.");
        }
}
