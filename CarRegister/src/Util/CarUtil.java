package Util;

import Bean.Car;
import config.Base;

public class CarUtil {

    public static Car fillCar() {
        String marka = InputUtil.TextAl("Masinin markasini daxil edin:");
        String model = InputUtil.TextAl("Modelini daxil edin:");
        String reng = InputUtil.TextAl("Rengini daxil edin:");
        String suretqut = InputUtil.TextAl("Suretler qutusunu daxil edin:"
                + "\n1.Avtomat"
                + "\n2.Mexanika");
        int il = InputUtil.ededAl("Ilini daxil edin");
        return new Car(marka, model, reng, suretqut, il);
        
    }

    public static void registerCar() {
        int say = InputUtil.ededAl("Qeydiyyat etmek istediyiniz masinlarin sayini yazin:");
        Base.car = new Car[say];
        for (int i = 0; i < say; i++) {
            System.out.println((i + 1) + ".Qeydiyyat");
            Base.car[i] = CarUtil.fillCar();
        }
    }

    public static void showAllCar() {
        if (Base.car == null) {
            return;
        }
        for (int i = 0; i < Base.car.length; i++) {
            if (Base.car[i] != null) {
                System.out.println((i + 1) + "." + Base.car[i]);
            }
        }
    }

    public static void searchAndPrintCar() {
        String text = InputUtil.TextAl("Axtarmaq istediyiniz sozu daxil edin:");
        Car c[] = Base.car;

        for (int i = 0; i < c.length; i++) {
            if (c[i].getMarka().contains(text) || c[i].getModel().contains(text)
                    || c[i].getReng().contains(text) || c[i].getSuretqut().contains(text) ) {
                System.out.println(c[i]);
            }
        }
    }

    public static void editCar() {
        CarUtil.showAllCar();
        int nom = InputUtil.ededAl("Melumatini deyismek istediyiniz masini secin:") - 1;
        Car c = Base.car[nom];
        String param = InputUtil.TextAl("Deyis: marka,model,reng,suretler qutusu,il");
        if (param.equals("marka")) {
            c.setMarka(InputUtil.TextAl("Yeni markani daxil edin:"));
        } else if (param.equals("model")) {
            c.setModel(InputUtil.TextAl("Yeni modeli daxil edin:"));
        } else if (param.equals("reng")) {
            c.setReng(InputUtil.TextAl("Yeni rengi daxil edin:"));
        } else if (param.equals("suretler qutusu")) {
            c.setSuretqut(InputUtil.TextAl("Yeni suretler qutusunu daxil edin:"));
        } else if (param.equals("il")) {
            c.setIl(InputUtil.ededAl("Masinin ilini daxil edin:"));
        }
    }
    
    public static void deleteCar(){
         CarUtil.showAllCar();
                    int sil = InputUtil.ededAl("Melumatlarini silmek istediyiniz masini secin:")-1;
                    Car c = Base.car[sil];
                    Base.car[sil] = null;
                    

    }
}
