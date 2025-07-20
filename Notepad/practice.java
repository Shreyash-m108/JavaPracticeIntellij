class practice{
	class Animal <A>{
		A obj;
		Animal(A obj){
			this.obj=obj;
		}
		public A getObject(){
			return this.obj;
		}
		
	}
	
	public static void main(String args[]){
		practice pract = new practice();
		
		practice.Animal<Integer> animal = pract.new Animal<Integer>(1054848);
		System.out.print(animal.getObject());
	}
}