package Mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorManagement implements Mediator {

    private List<GroupUser> groupUsers = new ArrayList<>();

    public void addNewUser(GroupUser newGroupUser){
        groupUsers.add(newGroupUser);
    }

    public void removeUser(GroupUser groupUser){
        groupUsers.remove(groupUser);
    }

    @Override
    public void sendMessage(String message) {
        for(GroupUser currUser : groupUsers){
            currUser.receiveMessage(message);
        }
    }
}
