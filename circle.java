class calculator{
    public void add(int a,int b){
        int add= a+b;
 	System.out.println(+add);
    }
    public void  add(double a,double b){
        double add= a+b;
       System.out.println(+add);

    
}
    public void  add(int a,int b,int c){
        int add= a+b+c;
	System.out.println(+add);
    }

}
 class circle{
    public static void main(String[] args) {
        calculator calc=new calculator();
        calc.add(1,2);
        calc.add(1.4,2.6);
        calc.add(1,2,9);
  } 
}