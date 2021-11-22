package OOP_Interfaces;

public class SmsLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Sms Gönderildi : " +message);
    }
}
