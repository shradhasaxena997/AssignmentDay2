import java.util.Optional;

public class Assignment1 {
    public static void main(String[] args) {


        Person person =new Person("shradha",23,Address.class);
        Address address =new Address("bareilly", Optional.of("agra"));
        Optional<Optional<String>> testStringOptional= Optional.of(person.add.secondaryAddressOptional);
        //Optional<Optional<String>> testingStringOptional= Optional.ofNullable(address.secondaryAddressOptional);
        //String test=testStringOptional.orElseGet(person::getDefault);
        System.out.println(address);
    }}
