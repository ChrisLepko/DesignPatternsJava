package Mediator;

public class TestMessageMediator {

    public static void main(String[] args) {

        MediatorManagement mediatorManagement = new MediatorManagement();

        GroupUser user1 = new GroupUser("Janusz", mediatorManagement);
        GroupUser user2 = new GroupUser("Stachu12", mediatorManagement);
        GroupUser user3 = new GroupUser("Adam", mediatorManagement);
        GroupUser user4 = new GroupUser("Grazyna", mediatorManagement);
        GroupUser user5 = new GroupUser("Kwiatek213", mediatorManagement);

        mediatorManagement.addNewUser(user1);
        mediatorManagement.addNewUser(user3);
        mediatorManagement.addNewUser(user4);

        user1.sendMessage();
        System.out.println();

        mediatorManagement.addNewUser(user2);
        mediatorManagement.addNewUser(user5);

        user5.sendMessage();
        System.out.println();

        mediatorManagement.removeUser(user1);
        mediatorManagement.removeUser(user4);

        user3.sendMessage();

    }
}
