package core.programs;

public class Product {
	int id=10;
	String name="amul";
	void show(){
		System.out.println("id=" +id);
	}
	 class A extends Product{
		int count=50;
		String category="butter";
		void show(){
			System.out.println("count=" +count);
			System.out.println("category=" +category);
		}	
		}
		 class B extends Product{
			int count=60;
			String category="milk";
			void show(){
				System.out.println("count=" +count);
				System.out.println("category=" +category);
			}
		}
		 class C extends Product{
			int count=70;
			String category="choco";
			 void show(){
		        	System.out.println("id=" +id+ "name=" +name+ "category=" +category+ "count=" +count);
		        	        	
		        }
		}
		 class One extends A{
			int price=70;
	        void totalprice(){
	        System.out.println("totalprice=" +count*price);
	        }
	        void show(){
	        	System.out.println("id=" +id+ "name=" +name+ "category=" +category+ "count=" +count);
	        	        	
	        }
		}
	      class Two extends B{
			int price=40;
	        void totalprice(){
	        System.out.println("totalprice=" +count*price);
	        }
	        void show(){
	System.out.println("id=" +id+ "name=" +name+ "category=" +category+ "count=" +count);
	        	
	        }
		}
		public class test{
			public static void main(String args[]){
			Two b=	new Two();
			One a= new One();
			C c= new C();
			b.show();
			a.show();
			c.show();
			
			
			}
		}
		}
		

	


