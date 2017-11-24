package kata5P2.main;

import java.io.IOException;
import java.util.List;
import kata5P2.view.HistogramDisplay;
import kata5P2.model.Histogram;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailListBuilder;

public class Kata5P2 {

    public static void main(String[] args) throws IOException {
        
        Kata5P2 kata = new Kata5P2();
        kata.execute();
    }
    
    private List<String> mailList;
    private Histogram<String> histogram;
    
    private void execute() throws IOException {
        input();
        process();
        output();
    }
    
    private void input() throws IOException {
        String filename = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Kata4\\src\\emails.txt";
        mailList = MailListBuilder.read(filename);
    }
    
    private void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    private void output() {
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
