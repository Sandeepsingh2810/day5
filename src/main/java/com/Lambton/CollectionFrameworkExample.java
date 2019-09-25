package com.Lambton;

import sun.applet.resources.MsgAppletViewer;

import java.util.*;

public class CollectionFrameworkExample
{
    public static void main(String[] args) {
        ArrayList<String> mStringArrayList = new ArrayList<>();

        mStringArrayList.add("A");
        mStringArrayList.add("B");
        mStringArrayList.add("C");
        mStringArrayList.add("C");

        mStringArrayList.add("A");
        mStringArrayList.add("A");

        System.out.println(mStringArrayList);
        for (int i = 0; i < mStringArrayList.size(); i++) {
            System.out.println(mStringArrayList.get(i));
        }

        for (String s : mStringArrayList) {
            System.out.println(s);
        }

        Iterator<String> iterator = mStringArrayList.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);

        }
        Set<String> mySet = new HashSet<>();
        mySet.add("India");
        mySet.add("China");
        mySet.add("USA");
        mySet.add("Canada");
        System.out.println(mySet);

        mySet.add("India");
        System.out.println(mySet);

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("IND", "India");
        stringMap.put("CAD", "Canada");
        stringMap.put("USA", "United States");
        stringMap.put("PAK", "Pakistan");
        System.out.println(stringMap);
        stringMap.put("CAD", "New Canada");

        System.out.println(stringMap);


        ArrayList<String> Canada = new ArrayList<>();
        Canada.add("Ontario");
        Canada.add("Alberta");
        Canada.add("Winipeg");

        ArrayList<String> India = new ArrayList<>();
        India.add("Punjab");
        India.add("Gujarat");
        India.add("Himachal Pradesh");

        ArrayList<String> USA = new ArrayList<>();
        USA.add("New York");
        USA.add("CAlifornia");
        USA.add("Texas");
        USA.add("New Jersy");

        Map<String, ArrayList<String>> country = new HashMap<>();
        country.put("CAD", Canada);
        country.put("IND", India);
        country.put("US", USA);
        System.out.println(country);


        ArrayList<String> word = new ArrayList<>();
        word.add("abc");
        word.add("cab");
        word.add("cat");
        word.add("mate");
        word.add("atem");
        word.add("bac");
        word.add("tac");
        word.add("atc");
        word.add("pop");
        word.add("pat");
        word.add("123");
        word.add("231");
        word.add("431");

        System.out.println(word);
        Map<String,ArrayList<String>> hm= new HashMap<>();
        for (String s : word)
        {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);

            ArrayList<String> al = hm.get(key);
            if (al == null) ;
            {
                al = new ArrayList<>();

            }

            al.add(s);
            hm.put(key, al);
        }
        System.out.println(hm);

        int n = 3;
         int  ans = 0;
        ans=(2^3)*3+1;

        ans= (1 << n )* n+1;
        System.out.println(ans);




        }




    }




