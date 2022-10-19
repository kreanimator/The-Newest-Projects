public class WrongPasswordException extends Exception{

    private String detail;

    public WrongPasswordException(){
        detail ="Incorrect password!";
    }
    public WrongPasswordException(String message){
        super(message);
        detail = message;
    }
    @Override
    public String toString(){
        return "Wrong password exception: " + detail;
    }
}
