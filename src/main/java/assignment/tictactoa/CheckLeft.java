package assignment.tictactoa;

class CheckLeft extends Check
{
	CheckLeft(int size,char[][] ch)
	{
		super(size,ch);
	}
    public void check()
    {
    	for(int j=0;j<ch.length;j++) //checkcolumn
    	{
    		int flagleft = 0;
        	int flagleft1 = 0;
    		for(int i=0;i<ch.length;i++)
    		{
    			if(ch[i][j]== 'x')
    			{
    				flag++;
    			}
    			else if(ch[i][j]== 'o')
    			{
    				flag1++;
    			}
    		}
    		if(flagleft == size)
    		{
    			ps.print(str1);
    			System.exit(0);
    		}
    		if(flagleft1 == size)
    		{
    			ps.print(str2);
    			System.exit(0);
    		}
    	}
    }
}   
