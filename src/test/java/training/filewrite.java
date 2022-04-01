package training;

import training.PageObjects.WebFunctions;
import training.webPageObjects.bookingConfirmation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class filewrite {

    public void whenWriteStringUsingBufferedWritter_thenCorrect() throws IOException{


        String str = "Hello";
        BufferedWriter writer = new BufferedWriter(new FileWriter("ordernumber.txt"));
        writer.write(str);

        writer.close();
    }
}
