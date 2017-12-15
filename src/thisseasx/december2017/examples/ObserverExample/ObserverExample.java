package thisseasx.december2017.examples.ObserverExample;

public class ObserverExample {

    public static void main(String[] args) {
        Person Person1 = new Person("Nick");
        Person Person2 = new Person("Anna");
        Product huaweiPhone = new Product("Huawei", "Phone", "Not available");
        huaweiPhone.registerObserver(Person1);
        huaweiPhone.registerObserver(Person2);
        huaweiPhone.setAvailability("Available");
    }
}
