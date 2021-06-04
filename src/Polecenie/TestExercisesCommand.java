package Polecenie;

import java.util.ArrayList;

public class TestExercisesCommand {

    public static void main(String[] args) {
        TestExercisesCommand.doTraining();
    }

    static void doTraining (){

        ArrayList<Command> exercisesQueue = new ArrayList<>();

        exercisesQueue.add(new PushUp());
        exercisesQueue.add(new PushUp());
        exercisesQueue.add(new SitUp());
        exercisesQueue.add(new Squat());
        exercisesQueue.add(new Bend());
        exercisesQueue.add(new SitUp());
        exercisesQueue.add(new Bend());
        exercisesQueue.add(new SitUp());
        exercisesQueue.add(new Squat());
        exercisesQueue.add(new PushUp());

        System.out.println("Trening rozpoczyna się...");

        for(Command currExercise : exercisesQueue){
            if(currExercise != null){
                try {
                    currExercise.execute();
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Trening został zakończony");
    }
}
