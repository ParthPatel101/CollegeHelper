package peddiehacks.collegehelper;
import java.util.Scanner;
public class awardsCalc {

public static int awardsRaw() {
Scanner in = new Scanner (System.in);
System.out.println ("Enter number of regional awards");
int awardsScore = 0;

int awardRegional = in.nextInt();
awardsScore += (awardRegional * 5);

System.out.println ("Enter number of state awards");
int awardState = in.nextInt();
awardsScore += (awardState * 15);

System.out.println ("Enter number of national awards");
int awardNational = in.nextInt();
awardsScore += (awardNational * 40);

System.out.println ("Enter number of International awards");
int awardInternational = in.nextInt();
awardsScore += (awardInternational * 60);
 if (awardsScore <100)
return awardsScore ;
 
 else {
awardsScore = 100;
return awardsScore;
 }
}

}
