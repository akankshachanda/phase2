package core.programs.accessmodifiers;

public class Z  extends M{
	public static void main(String args[]){
		Z objZ= new Z();
		objZ.protectedmethod();
		objZ.publicmethod();
		objZ.defaultmethod();
		N objN = new N();
		objN.publicmethod();
		objN.defaultmethod();
		P objP=new P();
		objP.publicmethod();
		objP.defaultmethod();
		
		X objx=new X();
		System.out.println("long variable of X=" +objx.y);
		  System.out.println("float variable of X=" +objx.z);
		  System.out.println("char variable=" +objx.a);
	}
	}


