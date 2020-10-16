import java.util.Optional;

public class Person {

    String name;
    Integer age;
    Address add;
    //Address address =new Address("bareilly",null);
    Person(String inputName, Integer inputAge, Class<Address> address){
        name=inputName;
        age=inputAge;

    }
    public String getName(){return name;}
    public Integer getAge(){return age;}


    public String getDefault(){
        System.out.println("getting default string");
        return getName();
    }

    // Address address =new Address("bareilly",null);
    //Optional<Optional<String>> testStringOptional= Optional.ofNullable(address.secondaryAddressOptional);


}
