package u.javarush.plotnikov.cryptoanalizer;

import u.javarush.plotnikov.cryptoanalizer.Controllers.MainController;
import u.javarush.plotnikov.cryptoanalizer.entity.Result;
import u.javarush.plotnikov.cryptoanalizer.exeption.AppException;

import java.util.Arrays;

public class Application {

    private final MainController mainController;

    public Application() {
        mainController = new MainController();
    }

    public Result run(String[] args) {
        if(args.length>0) {
            String action = args[0];
            String[] parameters = Arrays.copyOfRange(args, 1, args.length);
            Result result = mainController.doAction(action, parameters);
        }
        throw new AppException();
    }
}
