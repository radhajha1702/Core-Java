class RadhaException extends RuntimeException{
    public RadhaException(String string){}

}
public class CustomException {

        public static void main(String[] args)
        {
       

           int i=20;
           int j=0;
       
            try{
               j=18/i;
               if(j==0)
               throw new RadhaException(" I dont want to print zero");
              System.out.println("thats the default O/P");
            }
            catch(RadhaException e )
            {
               System.out.println("Something went wrong" +e);
            }
            System.out.println(j);
            System.out.println("Bye");
        }   
       }
       
