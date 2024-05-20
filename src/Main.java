
/*6. Камни. Определить иерархию драгоценных и полудрагоценных камней.
Отобрать камни для ожерелья. Подсчитать общий вес (в каратах) и стоимость.
Провести сортировку камней ожерелья на основе ценности.
Найти камни в ожерелье, соответствующие заданному диапазону параметров прозрачности.*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Stone> stoneList = new ArrayList<Stone>();
        int i = 0;
        double totalPreciousWeight = 0, totalPreciousPrice = 0;
        double totalSemiPreciousWeight = 0, totalSemiPreciousPrice = 0;
        double max_alpha = 100; double min_alpha = 20;
        for (i = 0; i < 20; i += 2)
            stoneList.add(new PreciousStone("preciousStone #" + i, i / 10 + i / 100, i * 5,i*10));
        for (i = 1; i < 20; i += 2)
            stoneList.add(new SemiPreciousStone("semiPreciousStone #" + i, i / 5 + i / 150, i * 2 + i / 7,i*10));
        for (Stone stone : stoneList)
            if (stone instanceof PreciousStone) {
                totalPreciousWeight += stone.getWeight();
                totalPreciousPrice += stone.getPrice();
            } else if (stone instanceof SemiPreciousStone) {
                totalSemiPreciousWeight += stone.getWeight();
                totalSemiPreciousPrice += stone.getPrice();
            }
        System.out.println("Precious stones:\nTotal weight: " + totalPreciousWeight
                + ";\nTotal price: " + totalPreciousPrice + "\n");

        System.out.println("Semiprecious stones:\nTotal weight: " + totalSemiPreciousWeight
                + ";\nTotal price: " + totalSemiPreciousPrice);
        System.out.println("\n Sorted stones: \n");
       Collections.sort(stoneList);
       for (i = 0; i<20; i++) {
           System.out.println(stoneList.get(i).getName() + " ");
           System.out.println(stoneList.get(i).getPrice() + "\n");
       }
        System.out.println("\n Stone by alpha: \n");
        for (i = 0; i<20; i++) {
            if(stoneList.get(i).getAlpha() > min_alpha && stoneList.get(i).getAlpha() < max_alpha) {
                System.out.println(stoneList.get(i).getName() + " ");
                System.out.println(stoneList.get(i).getPrice() + "\n");
                System.out.println(stoneList.get(i).getAlpha() + "\n");
            }
        }
    }

    }
