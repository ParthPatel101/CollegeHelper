package peddiehacks.collegehelper;
import java.util.Scanner;
public class enclosed {

public static void main(String[] args) {
System.out.println("We are here to help you find the best suited colleges for you. \n "
+ "We use our mathermatical equations to come up with a point system that will help us give you the best results using data you provide.");
System.out.println("");
Scanner in = new Scanner (System.in);
double gpa =0.0;
int gpaRawScore = 0;
int satRawScore = 0;

System.out.println("Please enter if you are in 9, 10, 11 or 12 grade");
int currentGrade = in.nextInt();

if (currentGrade == 9) {
gpa = GpaCalc.gpaCalculator ();
System.out.println("");
System.out.printf("Your final calculated GPA = %.2f", gpa);
System.out.println("");
System.out.println("RAW GPA SCORE " + GpaCalc.rawGpa(gpa));
gpaRawScore = GpaCalc.rawGpa(gpa);
}
else if (currentGrade == 10) {
System.out.println("Now you will enter your freshman year grades \n");
double tempGpa1 = GpaCalc.gpaCalculator ();
System.out.println("Now you will enter your sophomore year grades \n");
double tempGpa2 = GpaCalc.gpaCalculator ();
gpa = (tempGpa1 + tempGpa2) /2;

System.out.printf("Your final calculated GPA = %.2f", gpa);
System.out.println("");
System.out.println("RAW GPA SCORE " + GpaCalc.rawGpa(gpa));
gpaRawScore = GpaCalc.rawGpa(gpa);
}
else if (currentGrade == 11) {
System.out.println("Now you will enter your freshman year grades \n");
double tempGpa1 = GpaCalc.gpaCalculator ();
System.out.println("Now you will enter your sophomore year grades \n");
double tempGpa2 = GpaCalc.gpaCalculator ();
System.out.println("Now you will enter your Junior year grades \n");
double tempGpa3 = GpaCalc.gpaCalculator ();
gpa = (tempGpa1 + tempGpa2 + tempGpa3) /3;

System.out.printf("Your final calculated GPA = %.2f", gpa);
System.out.println("");
System.out.println("RAW GPA SCORE " + GpaCalc.rawGpa(gpa));
gpaRawScore = GpaCalc.rawGpa(gpa);
}
else if (currentGrade == 12) {
System.out.println("Now you will enter your freshman year grades \n");
double tempGpa1 = GpaCalc.gpaCalculator ();
System.out.println("Now you will enter your sophomore year grades \n");
double tempGpa2 = GpaCalc.gpaCalculator ();
System.out.println("Now you will enter your Junior year grades \n");
double tempGpa3 = GpaCalc.gpaCalculator ();
System.out.println("Now you will enter your Senior year grades \n");
double tempGpa4 = GpaCalc.gpaCalculator ();
gpa = (tempGpa1 + tempGpa2 + tempGpa3+ tempGpa4) /4;

System.out.printf("Your final calculated GPA = %.2f", gpa);
System.out.println("");
System.out.println("RAW GPA SCORE " + GpaCalc.rawGpa(gpa));
gpaRawScore = GpaCalc.rawGpa(gpa);
}

System.out.println("------------------------------");
satRawScore = Sat.satRaw();
System.out.println("SAT Raw score = " + satRawScore);
        System.out.println("-------------------------------");

        System.out.println("");
        int apRawScore = ApCalc.rawAp();
        System.out.println ("AP raw score is " +apRawScore);
       
       
        System.out.println("\n ----------------------------");
        int awardsRawScore = awardsCalc.awardsRaw();
        System.out.println("Awards raw score = " + awardsRawScore);
       
        System.out.println("\n");
        Scanner in2 = new Scanner (System.in);
        int genScore = 0;
        System.out.println("Final Question! Are you a first generation college student");
        String gen = in2.nextLine();
        if (gen.equalsIgnoreCase("yes")) { genScore = 20; }
        else { genScore = 0; }
       
        int TotalRawScore = gpaRawScore + satRawScore + apRawScore + awardsRawScore + genScore ;
        System.out.println("Student final raw score = " + TotalRawScore);

     
       
System.out.println("-------------------------R--------------------------------");
System.out.println("-------------------------E--------------------------------");
System.out.println("-------------------------S--------------------------------");
System.out.println("-------------------------U--------------------------------");
System.out.println("-------------------------L--------------------------------");
System.out.println("-------------------------T--------------------------------");
System.out.println("-------------------------S--------------------------------");
if (TotalRawScore > 380) {
System.out.println ("Your recommended college choices are:\n1) Stanford University \n2) Harvard Univesity \n3) Massachusetts Institute of Technology \n4) Princeton University"); }

else if (TotalRawScore > 350 && TotalRawScore <= 380 ) {
System.out.println ("Your recommended college choices are:\n1) Duke University \n2) University of Chicago \n3) Yale Univeristy \n4) Columbia University \n5) University of Pennsylvania");}

else if (TotalRawScore > 320 && TotalRawScore <=350) {
System.out.println ("Your recommended college choices are:\n1) Johns Hopkins University \n2) Vanderbilt University \n3) Dartmouth University \n4) Cornell University"); }

else if (TotalRawScore > 280 && TotalRawScore <= 320) {
System.out.println ("Your recommended college choices are:\n1) Rutgers University \n2) New York University \n3) Georgia Technology Univeristy \n4) University of Texas Austin"); }

else if (TotalRawScore > 200 && TotalRawScore <= 280) {
System.out.println("Your recommended college choices are:\n1) Michigan State University \n2) temple university  \n3) High Point University \n4)Montclair University "); }

else if (TotalRawScore >= 120 && TotalRawScore <= 200) {
System.out.println("Your recommended college choices are:\n1) University of Alabama \n2) Pace University \n3) University of Arizona \n4) UC long beach \n5) UC Sandiego \n6) Monmouth University \n7) kean University \n8) ithica University");}

else {
System.out.println("Unfortunately, your scores are too low. Reccommended path would be to go to Community College for your associates and transfer to a 4 year college. ");
}

System.out.println("---------------------------------------------------------");
if (TotalRawScore > 380) {
System.out.println("Based on the given data and our data base we have came uo with the best fit college for you.");
System.out.println (" Stanford University: \n Stanford is known for its academic achievements, wealth, close proximity to Silicon Valley,\nand selectivity; it ranks as one of the world's top universities. \n --75th percentile SAT Score: 1570 \n --Average GPA admitted: 3.94 \n --Award Preference: National and Inetrnational awards \n --# of AP classes preferred: >8 \n --AP Scores preferred:5"); }

else if (TotalRawScore > 350 && TotalRawScore <= 380 ) {
System.out.println("Based on the given data and our data base we have came uo with the best fit college for you.");
System.out.println (" Duke University: \n This list of Duke University people includes alumni, faculty, presidents, and major philanthropists of Duke University, \n which includes three undergraduate and ten graduate schools. The undergraduate schools include Trinity College of Arts and Sciences, Pratt School of Engineering, and Sanford School of Public Policy. \n --75th percentile SAT Score: 1550 \n --Average GPA admitted: 3.7 \n --Award Preference: National awards \n --# of AP classes preferred: >6 \n --AP Scores preferred:5 & 4");}

else if (TotalRawScore > 320 && TotalRawScore <=350) {
System.out.println("Based on the given data and our data base we have came uo with the best fit college for you.");
System.out.println (" John Hopkins University: \n nDiscover how Johns Hopkins Medicine, headquartered in Baltimore, Maryland, is pushing the boundaries of biomedical discovery, transforming health care. \n --75th percentile SAT Score: 1530 \n --Average GPA admitted: 3.5 \n --Award Preference: State and National awards \n --# of AP classes preferred: >5 \n --AP Scores preferred: 5 & 4"); }

else if (TotalRawScore > 280 && TotalRawScore <= 320) {
System.out.println("Based on the given data and our data base we have came uo with the best fit college for you.");
System.out.println ("Rutgers University: \n The State University of New Jersey, is a leading national research university and the state of New Jersey's preeminent, comprehensive public institution \n --75th percentile SAT Score: 1230\n--Average GPA admitted: 3.2 \n --Award Preference: Regional and state awards \n --# of AP classes preferred: >5 \n --AP Scores preferred: 3,4 and 5"); }

else if (TotalRawScore > 200 && TotalRawScore <= 280) {
System.out.println("Based on the given data and our data base we have came uo with the best fit college for you.");
System.out.println("Michigan State University: \n The nation's pioneer land-grant university, Michigan State University is one of the top research universities in the world.\n --75th percentile SAT Score: 1150 \n --Average GPA admitted: 3.1 \n --Award Preference: Regional and state awards \n --# of AP classes preferred: >5 \n --AP Scores preferred:3,4 and 5"); }

else {
System.out.println("More data will be required to give the best fit for you. We are still working on it. Go with the given recommendation for now.");
}


}

}