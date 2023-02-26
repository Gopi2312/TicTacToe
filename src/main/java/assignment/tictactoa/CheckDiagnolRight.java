package assignment.tictactoa;

class CheckDiagnolRight extends Check
{
	CheckDiagnolRight(int size,char[][] ch)
	{
		super(size,ch);
	}
	public void check()
	{
    	int play1=0;
    	int play2=0;
    	for(int j=0;j<ch.length;j++) //check right diagnole
    	{
    		for(int i=0;i<ch.length;i++)
    		{
    			if((i+j)== size-1)
    			{
	    			if(ch[i][j]== 'x')
	    			{
	    				play1++;
	    			}
	    			else if(ch[i][j]== 'o')
	    			{
	    				play2++;
	    			}
    			}
    		}
    	}
		if(play1 == size)
		{
			ps.print(str1);
			System.exit(0);
		}
		if(play2 == size)
		{
			ps.print(str2);
			System.exit(0);
		}
    }
}