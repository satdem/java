package Odevler.InterFace.Odev2;

public class EXEFile implements ReadFile{
    @Override
    public String open() {
        return "opening.exe";
    }

    @Override
    public String read() {
        return "reading.exe";
    }

    @Override
    public String save() {
        return "saveing.exe";
    }

    @Override
    public String close() {
        return "closing.exe";
    }
}
