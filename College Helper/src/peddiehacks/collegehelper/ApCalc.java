package peddiehacks.collegehelper;
import java.util.Scanner;
public class ApCalc {
public static int rawAp () {
Scanner in = new Scanner (System.in);
System.out.println ("Enter number of Ap classes you took in 4 years of high school");
int apCount = in.nextInt();
int [] apScores = new int [apCount];

int tempFor = 1;
for (int i=0; i<apCount ; i++, tempFor ++) {
System.out.println ("Enter AP test score " + tempFor + ", score is either 5, 4, 3, 2, 1");
apScores [i] = in.nextInt();
}
int apScoreSum = 0;
for (int i=0; i<apCount ; i++) {
       if ( apScores [i] == 5 ) { apScoreSum += 5;  }
       else if ( apScores [i] == 4 ) { apScoreSum += 4;  }
       else if ( apScores [i] == 3 ) { apScoreSum += 3;  }
       else if ( apScores [i] == 2 ) { apScoreSum += 2;  }
       else { apScoreSum += 1;  }
}

return apScoreSum ;  
}
}