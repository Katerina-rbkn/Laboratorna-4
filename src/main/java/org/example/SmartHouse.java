package org.example;

public class SmartHouse {
    public static void main(String[] args) {
        Controller controller = Controller.getInstance();
        controller.getView().displayInfo("Вітаю, Вас, в програмі розумного будинку.");

        while (true) {
            controller.getView().displayMenu();
            int command = controller.getView().InputAnswer(0, 7);
            switch (command) {
                case 1:
                    controller.OnLighting();
                    break;
                case 2:
                    controller.OffLighting();
                    break;
                case 3:
                    controller.OnHeating();
                    break;
                case 4:
                    controller.OffHeating();
                    break;
                case 5:
                    controller.ActivateSafety();
                    break;
                case 6:
                    controller.DeactivateSafety();
                    break;
                case 7:
                    controller.OrderFood();
                    break;
                case 0:
                    controller.getView().displayInfo("Дякую за увагу.");
                    return;
                default:
                    controller.getView().displayInfo("Сталася помилка. Спробуйте ще раз.");
            }
        }
    }
}
