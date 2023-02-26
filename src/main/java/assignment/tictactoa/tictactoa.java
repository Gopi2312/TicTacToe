package assignment.tictactoa;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Logger;
public class Tictactoa
{
    public static void main( String[] args )
    {
        Logger l = Logger.getLogger("hi");
        Scanner sc = new Scanner(System.in);
        XoBoard obj = new XoBoard();
        Check xb;
        int position;
        int size=obj.size;
        char[][] ch = obj.ch;
        int i=0;
        obj.printArray();
        l.info("Player 1  x");
        l.info("Player 2  o");
        while(i<size*size)
        {
            if(i%2==0)
            {
                l.info("Enter the position");
                position = sc.nextInt();
                int x = obj.insert(position,'x');
                if(x==1)
                {
                	i--;
                }
                obj.printArray();
                xb = new CheckRight(size,ch);
                xb.check();
				xb = new CheckLeft(size,ch);
				xb.check();
				xb = new CheckDiagnolRight(size,ch);
				xb.check();
				xb = new CheckDiagnolLeft(size,ch);
				xb.check();
            }
            else
            {
                l.info("Enter the position");
                position = sc.nextInt();
                int x = obj.insert(position,'o');
                if(x==1)
                {
                	i--;
                }
                obj.printArray();
                xb = new CheckRight(size,ch);
                xb.check();
				xb = new CheckLeft(size,ch);
				xb.check();
				xb = new CheckDiagnolRight(size,ch);
				xb.check();
				xb = new CheckDiagnolLeft(size,ch);
				xb.check();
            }
            i++;
            if(i>=9)
            {
            	l.info("Draw");
            }
        }  
    }  
}
