package Usefulprograms;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class TerminalOutputs implements Runnable {
	
    private InputStream inputStream;
    private Consumer<String> consumer;

    public TerminalOutputs(InputStream inputStream, Consumer<String> consumer) {
        this.inputStream = inputStream;
        this.consumer = consumer;
    }

    @Override
    public void run() {
        new BufferedReader(new InputStreamReader(inputStream)).lines()
          .forEach(consumer);
    }

}
