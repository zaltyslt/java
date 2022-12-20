package pvz.patterns.decorator2;

public interface DataSource {
    void writeData(String data);

    String readData();
}