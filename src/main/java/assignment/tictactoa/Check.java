package assignment.tictactoa;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

abstract class Check
{
	PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
	int size;
	char[][] ch;
	String str1 = "Player 1 Winner";
	String str2 = "Player 2 Winner";
	Check(int size,char[][] ch)
	{
		this.size = size;
		this.ch = ch;
	}
	public void winner(int flag,int flag1)
	{
		if(flag == size)
		{
			ps.print(str1);
			System.exit(0);
		}
		if(flag1 == size)
		{
			ps.print(str2);
			System.exit(0);
		}
	}
    public abstract void check();
}
