package week04.generics;

public class GenericClass<T> {
    //T <T> olduğundan ben main sınıfında hangi türden yazsam  o türe göre çıktı verir

        private T data; //private olduğundan constractor unu oluşturmak lazım

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

}

