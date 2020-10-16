import java.util.Optional;

public class Address {
    String primaryAddress;

    Optional<String> secondaryAddressOptional;
    Address(String inputPrimaryAddress,Optional<String> inputSecondaryAddressOptionalAddress){
        primaryAddress=inputPrimaryAddress;
        secondaryAddressOptional=inputSecondaryAddressOptionalAddress;

    }




}
