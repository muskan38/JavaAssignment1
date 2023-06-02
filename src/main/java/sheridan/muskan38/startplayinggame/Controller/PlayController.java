package sheridan.muskan38.startplayinggame.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sheridan.muskan38.startplayinggame.model.GameImp;
import sheridan.muskan38.startplayinggame.model.GamePrizes;

@Controller

public class PlayController {





    private GameImp gameImp;

    public PlayController() {
        gameImp = new GameImp();
    }

    @GetMapping("/")
    public String play() {
        return "play";
    }

    @PostMapping("/result")
    public String result(@RequestParam("box") int boxIndex, Model model) {
        GamePrizes  chosenPrize = gameImp.openBox(boxIndex);
        model.addAttribute("chosenPrize", chosenPrize);
        model.addAttribute("boxes", gameImp.getBoxes());
        return "result";
    }
}
