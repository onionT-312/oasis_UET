import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {
    /**
     * Null pointer ex.
     *
     * @throws NullPointerException the null pointer exception
     */
    public void nullPointerEx() throws NullPointerException {
        throw new NullPointerException();
    }

    /**
     * Null pointer ex test string.
     *
     * @return the string
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException x) {
            return "Lỗi Null Pointer";
        }
        return "No error!";
    }

    /**
     * Array index out of bounds ex.
     *
     * @throws ArrayIndexOutOfBoundsException the array index out of bounds exception
     */
    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Array index out of bounds ex test string.
     *
     * @return the string
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException x) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "No error!";
    }

    /**
     * Arithmetic ex.
     *
     * @throws ArithmeticException the arithmetic exception
     */
    public void arithmeticEx() throws ArithmeticException {
        throw new ArithmeticException();
    }

    /**
     * Arithmetic ex test string.
     *
     * @return string
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException x) {
            return "Lỗi Arithmetic";
        }
        return "No error!";
    }

    /**
     * File not found ex.
     *
     * @throws FileNotFoundException the file not found exception
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    /**
     * File not found ex test string.
     *
     * @return the string
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException x) {
            return "Lỗi File Not Found";
        }
        return "No error!";
    }

    /**
     * Io ex.
     *
     * @throws IOException the io exception
     */
    public void ioEx() throws IOException {
        throw new IOException();
    }

    /**
     * Io ex test string.
     *
     * @return the string
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "No error!";
    }
}