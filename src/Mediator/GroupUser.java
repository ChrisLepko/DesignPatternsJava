package Mediator;

public class GroupUser {

    private String username;
    private Mediator mediator;

    public GroupUser(String username, Mediator mediator) {
        this.username = username;
        this.mediator = mediator;
    }

    public void sendMessage(){
        this.mediator.sendMessage("Użytkownik: " + username + " wysłał wiadomość");
    }

    public void receiveMessage(String message){
        System.out.println("Nowa wiadomość: " + message + " do użytkownika: " + username);
    }
}
