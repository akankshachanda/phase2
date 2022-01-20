package core.programs.accessmodifiers;

public class Y extends N {
	public static void main(String args[]){
		M objM = new M();
		objM.publicmethod();
		objM.defaultmethod();
		
		N objN = new N();
		objN.publicmethod();
		objN.defaultmethod();
		objN.protectedmethod();
		
		X objX=new X();
		System.out.println("long variable of X=" +objX.y);
		  System.out.println("float variable of X=" +objX.z);
		  System.out.println("char variable=" +objX.a);
	}

}
