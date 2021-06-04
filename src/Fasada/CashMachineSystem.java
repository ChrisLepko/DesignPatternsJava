package Fasada;

public class CashMachineSystem {

    public void sendNotification(){
        System.out.println("Przykładowa wiadomość wysłana do klienta");
    }

    public boolean isCashMachineSecured(){
        System.out.println("Bankomat jest bezpieczny");
        return true;
    }

    public boolean isUserDataValidated(){
        System.out.println("Dane użytkownika zostały poprawnie wprowadzone");
        return true;
    }

    public void scheduleService(){
        System.out.println("Serwis bankomatu został zaplanowany");
    }
}
