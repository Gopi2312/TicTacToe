package assignment.tictactoa;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
class XoBoard
{
    PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
    Scanner is = new Scanner(System.in);
    Check xb;
    char[][] ch;
    int size;
    XoBoard()
    {
        ps.print("Enter the size");
        this.size = is.nextInt();
        ch=new char[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
                {
                    ch[i][j] = ' ';
                }
        }
    }
    void printArray()
    {
	    for(int i=0;i<size;i++)
	    {
	    	ps.print("|");
	        for(int j=0;j<size;j++)
	            {
	                ps.print(ch[i][j]);
	                ps.print("|");
	            }
	        ps.println();
	    }
    }
    public int insert(int index,char x)
    {
        ps.println(index);
        int row = (index-1)/size;
        int col = (index-1)%size;
        if(ch[row][col] == ' ')
        {
        	ch[row][col]=x;
        }
        else {
        	return 1;
        }
        return 0;
    }
    void player()
    {
    	xb = new CheckRight(size,ch);
        xb.check();
		xb = new CheckLeft(size,ch);
		xb.check();
		xb = new CheckDiagnolRight(size,ch);
		xb.check();
		xb = new CheckDiagnolLeft(size,ch);
		xb.check();
    }
}
