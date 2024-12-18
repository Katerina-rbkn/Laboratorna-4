package org.example;

public class Controller {
    private static final Controller INSTANCE = new Controller();

    public static Controller getInstance() {
        return INSTANCE;
    }
    private Controller() {
        systemHouse = new SystemHouse();
        view = new View();
    }

    private final SystemHouse systemHouse;
    private final View view;

    private boolean turnOnLights = false;
    private boolean turnOnHeating = false;
    private boolean activeSecurity = false;



    public void OnLighting(){
        if (!turnOnLights){
            String color = view.ChoiceColor();
            systemHouse.OnLighting(color);
            turnOnLights = true;
        }else{
            view.displayInfo("Світло вже ввімкнено. Бажаєте змінити колір? (1 - так, 2 - ні)");
            int changeColor = view.InputAnswer(1, 2);
            if (changeColor == 1) {
                String color = view.ChoiceColor();
                systemHouse.OnLighting(color);
            }
        }
    }

    public void OffLighting(){
        if (turnOnLights){
            systemHouse.OffLighting();
            turnOnLights = false;
        }else{
            view.displayInfo("Світло вже вимкнено");
        }
    }


    public void OnHeating(){
        if (!turnOnHeating){
            int temperature = view.ChoiceTemperature();
            systemHouse.OnHeating(temperature);
            turnOnHeating = true;
        }else{
            view.displayInfo("Опалення вже ввімкнено. Бажаєте змінити температуру? (1 - так, 2 - ні)");
            int changeTemperature = view.InputAnswer(1, 2);
            if (changeTemperature == 1) {
                int temperature = view.ChoiceTemperature();
                systemHouse.OnHeating(temperature);
            }
        }

    }

    public void OffHeating(){
        if (turnOnHeating){
            systemHouse.OffHeating();
            turnOnHeating = false;
        }else{
            view.displayInfo("Опалення вже вимкнено");
        }
    }

    public void ActivateSafety(){
        if (!activeSecurity){
            systemHouse.ActivateSafety();
            activeSecurity = true;
        }else{
            view.displayInfo("Сигналізація вже активована");
        }
    }

    public void DeactivateSafety(){
        if (activeSecurity){
            systemHouse.DeactivateSafety();
            activeSecurity = false;
        }else{
            view.displayInfo("Сигналізація вже вимкнена");
        }
    }
    public void OrderFood(){
        String food = view.ChoiceFood();
        systemHouse.OrderFood(food);
    }


    public View getView() {
        return view;
    }

}
