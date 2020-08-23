package peddiehacks.collegehelper;
import java.util.Scanner;
public class Sat {


public static int satRaw () {
Scanner in = new Scanner (System.in);
System.out.println("Enter your highest SAT score");
int satScore = in.nextInt();

int farAway = 1600 - satScore;
int satPenalty = farAway / 20 ;

return (100-satPenalty);
}

}