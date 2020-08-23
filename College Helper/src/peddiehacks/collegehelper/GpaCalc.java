package peddiehacks.collegehelper;
import java.util.Scanner;
public class GpaCalc {
public static double gpaCalculator() {
Scanner in = new Scanner (System.in);
String Grade1 ; String Grade2 ;String Grade3 ;String Grade4 ;String Grade5 ;String Grade6 ;String Grade7 ;String Grade8 ;
System.out.println ("Enter your grades of 8 of your classes, Make sure you enter your letter Grades. \n Subjects don't matter just put letter grades.");
double gpaPoints = 0.0 ;
System.out.print("1- "); Grade1 = in.nextLine();
System.out.print("2- "); Grade2 = in.nextLine();
System.out.print("3- "); Grade3 = in.nextLine();
System.out.print("4- "); Grade4 = in.nextLine();
System.out.print("5- "); Grade5 = in.nextLine();
System.out.print("6- "); Grade6 = in.nextLine();
System.out.print("7- "); Grade7 = in.nextLine();
System.out.print("8- "); Grade8 = in.nextLine();

String [] grades = {Grade1, Grade2, Grade3, Grade4, Grade5, Grade6, Grade7, Grade8 } ;
for (String e: grades) {

if (e.equalsIgnoreCase("A+") || e.equalsIgnoreCase("A"))
gpaPoints += 4.0;

else if (e.equalsIgnoreCase("A-"))
gpaPoints += 3.7;

else if (e.equalsIgnoreCase("B+"))
gpaPoints += 3.3;

else if (e.equalsIgnoreCase("B"))
gpaPoints += 3.0;

else if (e.equalsIgnoreCase("B-"))
gpaPoints += 2.7;

else if (e.equalsIgnoreCase("C+"))
gpaPoints += 2.3;

else if (e.equalsIgnoreCase("C"))
gpaPoints += 2.0;

else if (e.equalsIgnoreCase("C-"))
gpaPoints += 1.7;

else if (e.equalsIgnoreCase("D+"))
gpaPoints += 1.3;

else if (e.equalsIgnoreCase("D"))
gpaPoints += 1.0;

else if (e.equalsIgnoreCase("F") || e.equalsIgnoreCase("D-") ) {
gpaPoints += 0.0; }
else {
gpaPoints += -1;
}
}

return gpaPoints /8 ;

}
public static int rawGpa(double gpa) {
if (gpa>3.0) {
return (int) (gpa * 25) ;
} else {
int gpaPenalty =   (int)( (3.0 - gpa)*10 );
return  (int) (gpa * 25) - gpaPenalty   ;
}

}
}
