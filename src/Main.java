public class Main {
    public static void main(String[] args) {

        //TODO
        WeatherAPI first = new WeatherAPI();
        GUI screen = new GUI(first);
        screen.createWindow();
        screen.setUpButton();
        screen.cyanBackground(); 

    }
}
