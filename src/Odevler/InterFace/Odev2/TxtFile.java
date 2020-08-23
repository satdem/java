package Odevler.InterFace.Odev2;

public class TxtFile implements ReadFile{
    @Override
    public String open() {
        return "opening.txt";
    }

    @Override
    public String read() {
        return "reading.txt";
    }

    @Override
    public String save() {
        return "saveing.txt";
    }

    @Override
    public String close() {
        return "closing.txt";
    }
}
