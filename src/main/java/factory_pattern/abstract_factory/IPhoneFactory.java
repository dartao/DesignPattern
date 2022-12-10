package main.java.factory_pattern.abstract_factory;

public class IPhoneFactory implements Factory{
    @Override
    public Phone createPhone() {
        return new IPhone();
    }
}
