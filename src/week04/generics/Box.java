package week04.generics;

public class Box <T>{

    private T item;

    public void addItem(T item){
        this.item= item;
    }

    public T getItem() {
        return item;
    }

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.addItem("merrhabalarrr");
        String message = stringBox.getItem();
        System.out.println(message);

        Box<Integer> integerBox = new Box<>();
        integerBox.addItem(42);
        int number = integerBox.getItem(); //otoboxing işlemi
        System.out.println("sayi: "+number);
    }
}
