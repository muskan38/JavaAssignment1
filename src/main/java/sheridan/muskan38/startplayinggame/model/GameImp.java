package sheridan.muskan38.startplayinggame.model;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class GameImp {
    private List<GamePrizes> boxes;

    public GameImp() {
        initializeBoxes();
    }

    private void initializeBoxes() {
        GamePrizes[] prizes = {
                new GamePrizes("Candy"),
                new GamePrizes("iPhone"),
                new GamePrizes("$100"),
                new GamePrizes("Empty"),
                new GamePrizes("Car")
        };

        boxes = new ArrayList<>(Arrays.asList(prizes));
        Collections.shuffle(boxes);
    }

    public List<GamePrizes> getBoxes() {
        return boxes;
    }

    public GamePrizes openBox(int index) {
        return boxes.get(index);
    }
}
