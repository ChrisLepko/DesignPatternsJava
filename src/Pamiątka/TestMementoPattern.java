package Pamiątka;

public class TestMementoPattern {
    public static void main(String[] args) {
        System.out.println("Test wzorca projektowego 'Pamiątka'");

        MementosManagement mementosManagement = new MementosManagement();
        Originator originator = new Originator("Pierwszy stan");
        mementosManagement.addMemento(originator.createMemento());

        originator.setState("Drugi stan");
        originator.setState("Trzeci stan");
        mementosManagement.addMemento(originator.createMemento());

        originator.setState("Czwarty stan");
        originator.setState("Piąty stan");
        mementosManagement.addMemento(originator.createMemento());

        System.out.println();
        System.out.println("Zapisane stany:");
        for(Memento currMemento : mementosManagement.getMementos()){
            System.out.println(currMemento.getState());
        }

        originator.restoreMemento(mementosManagement.getMemento(0));
        System.out.println("Przywrócony pierwszy stan: " + originator.getState());

        originator.restoreMemento(mementosManagement.getMemento(mementosManagement.getMementos().size() - 1));
        System.out.println("Przywócono ostatni zapisany stan: " + originator.getState());
    }
}
