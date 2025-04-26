public class EvenNumberExceptionExample{
    public static void checkNumber(int number) throws Exception{
        if (number%2==0){
            throw new Exception("Even number is not allowed: "+number);
        }
        else{
            System.out.println("valid odd number:"+number);
        }
    }
       public static void main(String[] args){
        System.out.println("name:g.l.karthikeya;Roll no:24049;");
            try{
                checkNumber(2);
            }
            catch (Exception e){
                System.out.println("Exception caught:"+e.getMessage());
            }        
        
    }

       }

