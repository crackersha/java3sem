package prak27.task2;

import java.util.HashSet;
import java.util.HashMap;

public class Map {
    private String[] FirstName;
    private String[] SecondName;
    private int n;

    public Map() {
        FirstName = new String[10];
        SecondName = new String[10];
    };

    public void Add(String B,String A) {
        if (n == 10) {
            System.out.println("Elements not added, more than 10!");
        }
        else {
            FirstName[n] = A;
            SecondName[n] = B;
            ++n;
        }
    }

    public int getSameFirstNameCount() {
        if (n < 10) {
            System.out.println("Not enough items to count uniqueness! Returning -1");
            return -1;
        }
        else {
            HashSet<String> hashSet = new HashSet<String>();
            for (int i = 0; i < 10; ++i) {
                hashSet.add(FirstName[i]);
            }
            return (10 - hashSet.size());
        }
    }

    public int getSameLastNameCount() {
        if (n < 10) {
            System.out.println("Not enough items to count uniqueness! Returning -1");
            return -1;
        }
        else {
            HashSet<String> hashSet = new HashSet<String>();
            for (int i = 0; i < 10; ++i) {
                hashSet.add(SecondName[i]);
            }
            return (10 - hashSet.size());
        }
    }

    public HashMap<String, String> CreateMap() {
        HashMap<String, String> hashMap = null;
        hashMap = new HashMap<String, String>();
        System.out.println("Table created!");
        for (int i = 0; i < 10; ++i) {
            System.out.println(SecondName[i] + " " + FirstName[i]);
        }
        return hashMap;
    }
}

