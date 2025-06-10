public class LoopsNThings {
    public static void main(String[] args) {
        Thing thing1 = new Thing();
        thing1.setId("1234");
        thing1.setType("foo");
        thing1.setColor("red");
        thing1.setCount(45);

        Thing thing2 = new Thing();
        thing2.setId("5678");
        thing2.setType("bar");
        thing2.setColor("blue");
        thing2.setCount(75);

        Thing thing3 = new Thing();
        thing3.setId("123abc");
        thing3.setType("baz");
        thing3.setColor("yellow");
        thing3.setCount(123);

        Thing[] things = {
          thing1,
          thing2,
          thing3
        };

        System.out.println("Hello, World!" + thing1.getId());
    }
}

// Loop array 'things' and output the fields in a table form
// Sum the field 'count' and output the value
// Add a row at the beginning of the output with the field names

/*
Some basic java commands 
$ javac *.java
$ java LoopsNThings
*/
