package u.javarush.plotnikov.cryptoanalizer.command;

import u.javarush.plotnikov.cryptoanalizer.entity.Result;

public interface Actiion {
    Result execut(String[] parameters);
}
