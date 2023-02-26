package assignment.tictactoa;
class CheckDiagnolLeft extends Check
{
	CheckDiagnolLeft(int size,char[][] ch)
	{
		super(size,ch);
	}
    public void check()
    {
    	int p1=0;
    	int p2=0;
    	for(int i=0;i<ch.length;i++) //check left diagnole
    	{
    		if(ch[i][i]=='x')
    		{
    			p1++;
    		}
    		else if(ch[i][i]=='o')
    		{
    			p2++;
    		}
    	}
    	if(p1 == size)
		{
			ps.print(str1);
			System.exit(0);
		}
		if(p2 == size)
		{
			ps.print(str2);
			System.exit(0);
		}
     }
}