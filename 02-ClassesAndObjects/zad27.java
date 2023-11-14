public class zad27 {
    boolean isOn;

    zad27() {
        isOn = false;
    }

    public void TurnOn() {
        isOn = true;
    }

    public void TurnOff() {
        isOn = false;
    }

    public void displayLampInfo() {
        System.out.println("Lamp is " + (isOn ? "on" : "off"));
    }

    public static void main(String[] args) {
        zad27 a = new zad27();
        zad27 b = new zad27();

        a.TurnOn();
        b.TurnOff();

        a.displayLampInfo();
        b.displayLampInfo();
    }
}