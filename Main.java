import javax.naming.Name;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static  void main(String[] args) throws IOException {
            FileReader filereader = new FileReader("E:\\2\\data.csv");
            char separator = ';';
            CSVReader csvreader = new CSVReader(filereader, ';');
            String[] temp;
            List<Person> persons = new ArrayList<Person>();
            List<Subdivision> subdivisions = new ArrayList<Subdivision>();
            //int i = 0;
            //Subdivision a = new Subdivision(3, "1111");
            //String[] columns = new String[] {"1", "2", "3", "4", "5","6"};
            //persons.add(0,new Person(1,columns[1],columns[2],a,5,columns[5]));
            ////System.out.println(persons.get(0).getId()); ! ! ! ! ! ! ! ! ! ! ! ! !
            //List<String> Names = new ArrayList<>();
            //String data ="";
            Random rand = new Random();
            while ((temp = csvreader.readNext()) != null) {
                persons.add(new Person(temp[0], temp[1], temp[2], temp[3], new Subdivision(rand.nextInt(30000), temp[4]), (temp[5])));
            }
            for (int i = 1; i < persons.size(); i++) {
                System.out.print(persons.get(i).getId() + "\t \t");
                System.out.print(persons.get(i).getName() + "\t \t");
                System.out.print(persons.get(i).getSex() + "\t \t");
                System.out.print(persons.get(i).getDate() + "\t \t");
                System.out.print(persons.get(i).getSd().sdGetName() + "\t \t");
                System.out.print(persons.get(i).getSd().sdGetId() + "\t \t");
                System.out.print(persons.get(i).getZP() + "\t \t");
                System.out.println();
            }
        }
}

