package ourpack;

import mypack.FisrtFunInterface;

public class FirstFunClass //implements FisrtFunIterface 
{

	

	public static void main(String[] args) 
	{
		FisrtFunInterface  obj=(i,j)->System.out.println(i+j);
		obj.funshow(2,5);

	}

}
