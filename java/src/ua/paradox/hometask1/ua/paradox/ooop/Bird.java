package ua.paradox.hometask1.ua.paradox.ooop;

public class Bird extends Pet {
    private boolean canSpeak;

    public boolean isCanSpeak() {
        return canSpeak;
    }

    public void setCanSpeak(boolean canSpeak) {
        this.canSpeak = canSpeak;
    }
    @Override
    public void move (){
        System.out.println("This bird is flying.");
    }

}
