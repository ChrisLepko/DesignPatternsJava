package Fasada;

public class CashMachineFacade {

    private CashMachine cashMachine;
    private CashMachineSystem cashMachineSystem;

    public CashMachineFacade(){
        cashMachine = new CashMachine();
        cashMachineSystem = new CashMachineSystem();
    }

    public void moneyCashOut(){
        cashMachine.getUserData();
        if(cashMachineSystem.isUserDataValidated() && cashMachineSystem.isCashMachineSecured()){
            cashMachine.cashOut();
        }
    }
}
