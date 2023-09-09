package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyList {
    private List<Toy> toyList;

    /**
     * генератор списка игрушек ()
     * @param toyList список игрушек
     */
    // public ToyList(List<Toy> toyList, Integer idToyList) {
    public ToyList(List<Toy> toyList) {
        this.toyList = toyList;
    }

    public List<Toy> getToyList() {
        return toyList;
    }

    public void setToyList(List<Toy> toyList) {
        this.toyList = toyList;
    }

    public void removeToy() {
        
    }

    @Override
    public String toString() {
        return "ToyList [ toyList = " + toyList + " ] \n";
    }

    public List<Toy> playGame(int count) {
        List<Toy> winners = new ArrayList<>();
        double weightSum =0;
        for (Toy t : toyList){
            weightSum += t.getToy_frequency();
        }
        Random random = new Random();

        for (int i =0; i < count; i++) {
            double randomNumber = random.nextDouble()*weightSum;
            double currentSum = 0;
            for (Toy t: toyList) {
                currentSum += t.getToy_frequency();
                if (currentSum >= randomNumber) {
                    if (t.getToy_count()>0) {
                        winners.add(t);
                        t.setToy_count(t.getToy_count()-1);
                        weightSum -= t.getToy_frequency();
                    }
                    break;
                }
            }
        }
        return winners;
    }    

}
