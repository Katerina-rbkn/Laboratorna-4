package org.example;

public class SystemHouse {
    public void OnLighting(String color) {
        System.out.println("Світло ввімкнено, колір " + color);
    }

    public void OffLighting(){
        System.out.println(" Світло вимкнено");
    }

    public void OnHeating(int temperature) {
        System.out.println("Опалення ввімкнено, температура:" + temperature);
    }

    public void OffHeating() {
        System.out.println("Опалення вимкнено.");
    }

    public void ActivateSafety() {
        System.out.println("Сигналізація ввімкнена.");
    }

    public void DeactivateSafety() {
        System.out.println("Сигналізація вимкнена.");
    }

    public void OrderFood(String food) {
        System.out.println("Ви замовили: "+ food);
    }
}
