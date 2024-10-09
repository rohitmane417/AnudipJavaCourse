package prac1;
public class sample1 {
    public static void main(String[] args) {
        // Integer types
        
        // byte (1 byte) (8 bits)
        byte byteVar = 127;   
        
        // short (2 bytes)
        short shortVar = 32767; 
        
        // int (4 bytes)
        int intVar = 2147483647;  
        
        // long (8 bytes)
        long longVar = 9223372036854775807L;  

        // Floating-point types
        
        // float (4 bytes)
        float floatVar = 3.14f; 
        
        // double (8 bytes)
        double doubleVar = 3.141592653589793; 

       
        // char (2 bytes)
        char charVar = 'A';  

        // Boolean type
        
        // boolean (1 byte, but JVM-specific)
        boolean boolVar = true;  

        // Print all variables
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);
       
    }
}
