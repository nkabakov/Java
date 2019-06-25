package course2.HW.lesson2;

public class MyArrayDataException extends NumberFormatException {
    private int line;
    private int column;

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public MyArrayDataException(String s, int line, int column) {
        super(s);
        this.line = line;
        this.column = column;
    }
}
