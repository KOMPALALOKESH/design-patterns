package TemplatePattern;

public class Main {

    public static void main(String[] args) {
        DataMiner pdfDataMiner = new PdfDataMiner();
        pdfDataMiner.mineData();

        System.out.println();

        DataMiner csvDataMiner = new CsvDataMiner();
        csvDataMiner.mineData();
    }

}
