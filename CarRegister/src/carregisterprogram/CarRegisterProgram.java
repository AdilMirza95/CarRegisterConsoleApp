package carregisterprogram;

import Bean.Car;
import Util.CarUtil;
import Util.InputUtil;
import config.Base;
import java.util.Scanner;

public class CarRegisterProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int menu = InputUtil.ededAl("Menudan secim edin:"
                    + "\n1.Masin elave et"
                    + "\n2.Masinlari goster"
                    + "\n3.Masin axtar"
                    + "\n4.Duzelis et"
                    + "\n5.Sil"
                    + "\n6.Cix");
            switch (menu) {
                case 1:
                    CarUtil.registerCar();
                    break;
                case 2:
                    CarUtil.showAllCar();
                    break;
                case 3:
                    CarUtil.searchAndPrintCar();
                    break;
                case 4:
                    CarUtil.editCar();
                    break;
                case 5:
                    CarUtil.deleteCar();
                    break;
                case 6:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Melumatlari duzgun daxil edin!");
            }
        }
    }
}
