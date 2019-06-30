package course2.HW.lesson2;

public class Arrays {

    static   String[][] testArrRight = {
            {"1", "2", "3", "4"},
            {"2", "4", "6", "8"},
            {"3", "6", "9", "12"},
            {"4", "8", "12", "16"}
    };

    static String[][] testArrWrongSize = {
            {"1", "2", "3", "4"},
            {"2", "4"},
            {"4", "8", "12"}
    };

    static String[][] testArrWrongData = {
            {"1", "2", "3", "4"},
            {"a", "b", "c", "d"},
            {"3", "6", "9", "12"},
            {"e", "8", "f", "16"}
    };
}
