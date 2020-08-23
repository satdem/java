package Odevler.InterFace.Odev2;

public class DMGFile implements ReadFile{
    @Override
    public String open() {
        return "opening.dmg";
    }

    @Override
    public String read() {
        return "reading.dmg";
    }

    @Override
    public String save() {
        return "saveing.dmg";
    }

    @Override
    public String close() {
        return "closing.dmg";
    }
}
