/*6. Камни. Определить иерархию драгоценных и полудрагоценных камней.
Отобрать камни для ожерелья. Подсчитать общий вес (в каратах) и стоимость.
Провести сортировку камней ожерелья на основе ценности.
Найти камни в ожерелье, соответствующие заданному диапазону параметров прозрачности.*/



public abstract class Stone implements GetSet, Comparable<Stone>{
    protected double weight;
    protected double price;
    protected double alpha;



    @Override
    public int compareTo(Stone o) {
        return (int) (o.getPrice() - this.getPrice());
    }


}
