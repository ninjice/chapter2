/**
 * Write a description of class Table here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Table
{
    public static void main(String[] args) {
        makeTable();
    }
    
    public static void makeTable() {
        makeHeader();
        labelColumns();
        populateRows();
    }
    
    public static void makeHeader() {
        System.out.println("-----------------------------------");
        System.out.println("==\t Student Grades\t\t==");
        System.out.println("-----------------------------------");
    }
    
    public static void labelColumns() {
        System.out.println("Name\t\tLab\tBonus\tTotal");
    }
    
    public static void populateRows() {
        populateOneRow("Smitty", 1, 1);
        populateOneRow("Werber", 30, 8);
        populateOneRow("Jaeger", 37, 10);
        populateOneRow("Man", 49, 20);
        populateOneRow("Jenson", 50, 7);
    }
    
    public static void populateOneRow(String name, int lab, int bonus) {
        System.out.println(name + "\t\t" + lab + "\t" + bonus + "\t" + (lab + bonus));
    }   
}
