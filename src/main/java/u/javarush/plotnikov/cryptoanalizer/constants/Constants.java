package u.javarush.plotnikov.cryptoanalizer.constants;

public class Constants {
    private static final String rus = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String eng = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String cypher = "0123456789";
    private static final String figure ="!@#$%^&*{}[]";
    private static final String ALPHABET = rus+rus.toLowerCase()+eng
            +eng.toLowerCase()+cypher+figure;
}
