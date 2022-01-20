package core.programs;

abstract class Vehicle {
	int speed;
	long distance;
	abstract void run();
	abstract void stop();
	public void fuel(int n){
		System.out.println("n=" +n);
	}
	public void fuel(float n , String m ){
		System.out.println("n=" +n+ "m=" +m);
	}
	Vehicle(){
		speed=60;
		distance=90;
	}
	Vehicle(int x, long y){
		speed=x;
		distance=y;
	}
	void display(){
		System.out.println("abstract");
	}
	 class 2W extends Vehicle{
		int speed=50;
		long distance=30;;
		int tyres=2;	
	void run1(){
		System.out.println("running");
	}
		 void stop1(){
			 System.out.println("stop"); 
		 }
		void display1(){
			System.out.println("no.of tyres=" + tyres+ "speed=" +speed+ "distance=" +distance);
		}
	 }
	 class 3W extends Vehicle{
			int speed1;
			long distance1;
			int tyres=3;
		Vehicle(int c, long d){
				speed1=c;
				distance1=d;
			}	
		void run2(){
			System.out.println("running");
		}
			 void stop2(){
				 System.out.println("stop"); 
			 }
			void display2(){
				System.out.println("no.of tyres=" + tyres+ "speed=" +speed1+ "distance=" +distance1);
			}
		 }
	 class 4W extends Vehicle{
			int speed2;
			long distance2;
			int tyres=4;
		Vehicle(int e, long f){
				speed2=e;
				distance2=f;
			}	
		void run3(){
			system.out.println("running");
		}
			 void stop3(){
				 System.out.println("stop"); 
			 }
			void display3(){
				System.out.println("no.of tyres=" + tyres+ "speed=" +speed2+ "distance=" +distance2);
			}
	 }
			 class 8W extends Vehicle{
					int speed3;
					long distance3;
					int tyres=8;
				Vehicle(){
						speed3=50;
						distance3=60;
					}	
				void run4(){
					System.out.println("running");
				}
					 void stop4(){
						 System.out.println("stop"); 
					 }
					void display4(){
						System.out.println("no.of tyres=" + tyres+ "speed=" +speed3+ "distance=" +distance3);
					}
			 }
			public   class test{
				 public static void main(String args){
					Vehicle v=new 8W();
					v.run1();
					v.run2();
					v.run3();
					v.run4();
					v.stop1();
					v.stop2();
					v.stop3();
					v.stop4();
					v.display4();
					v.display1();
					v.display2();
					v.display3();
					
				 }
			 
				 
			 }
			 

