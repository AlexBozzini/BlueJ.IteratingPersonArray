 

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // assume there is a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
            Integer counter = 0;
            while (counter < personArray.length){
                Person currentPerson = personArray[counter];
                String stringRepresentation = String.valueOf(currentPerson);
                result += stringRepresentation;
                counter ++;
            }
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        for (Integer i = 0; i < personArray.length; i++){
           Person currentPerson = personArray[i];
                String stringRepresentation = String.valueOf(currentPerson);
                result += stringRepresentation; 
        }    

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        for (Person currentPerson : personArray){
            String stringRepresentation = String.valueOf(currentPerson);
                result += stringRepresentation; 
        }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
