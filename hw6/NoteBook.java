package hw6;
/**
 * В данном классе мы определили 7 полей: брэнд, модель, объем оперативной памяти (ОЗУ),объем жесткого диска (ЖД), операционную систему, цвет и цену. 
 * Также у класса есть конструктор, который принимает значения для этих полей и методы, которые позволяют получить значения этих полей извне.
 */
public class NoteBook {
    private String Brand;
    private String model;
    private int ramSize;
    private int hddSize;
    private String os;
    private String color;
    private Double price;


    public NoteBook(String Brand, String model, int ramSize,
            int hddSize, String os, String color, Double price) {
        this.Brand = Brand;
        this.model = model;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return Brand;
    }
    public String getModel() {
        return model;
    }
    public int getRamSize() {
        return ramSize;
    }
    public int getHddSize() {
        return hddSize;
    }
    public String getOs() {
        return os;
    }
    public String getColor() {
        return color;
    }
    public Double getPrice() {
        return price;
    }
    }

