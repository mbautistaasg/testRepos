package hello;

public class CarNotFoundException extends RuntimeException {
    public CarNotFoundException(){super();}
    public CarNotFoundException(String msg){super(msg);}
}