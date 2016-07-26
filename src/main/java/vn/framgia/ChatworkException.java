package vn.framgia;

public class ChatworkException extends RuntimeException{
    public ChatworkException(){
    }

    public ChatworkException(String message){
        super(message);
    }
}
