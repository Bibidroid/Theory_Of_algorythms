/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab4;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;
import java.util.Map.Entry;

/**
 *
 * @author User
 */
public class Lab4Text {

    private String Text;
    private int CountOfWords;
    private int CountOfUniqueWords;

    public Lab4Text() {
        CountOfWords = 1;
        CountOfUniqueWords = 0;
        Text = "History\n"
                + "The main concept of a network of smart devices was discussed as early as 1982, with a modified Coca-Cola vending machine at Carnegie Mellon University becoming the first Internet-connected appliance, able to report its inventory and whether newly loaded drinks were cold or not. Mark Weiser's 1991 paper on ubiquitous computing, \"The Computer of the 21st Century\", as well as academic venues such as UbiComp and PerCom produced the contemporary vision of the IOT. In 1994, Reza Raji described the concept in IEEE Spectrum as \"[moving] small packets of data to a large set of nodes, so as to integrate and automate everything from home appliances to entire factories\". Between 1993 and 1997, several companies proposed solutions like Microsoft's at Work or Novell's NEST. The field gained momentum when Bill Joy envisioned device-to-device communication as a part of his \"Six Webs\" framework, presented at the World Economic Forum at Davos in 1999. \n"
                + "The term \"Internet of things\" was coined by Kevin Ashton of Procter & Gamble, later MIT's Auto-ID Center, in 1999, though he prefers the phrase \"Internet for things\". At that point, he viewed radio-frequency identification (RFID) as essential to the Internet of things, which would allow computers to manage all individual things. \n"
                + "Defining the Internet of things as \"simply the point in time when more 'things or objects' were connected to the Internet than people\", Cisco Systems estimated that the IoT was \"born\" between 2008 and 2009, with the things/people ratio growing from 0.08 in 2003 to 1.84 in 2010. \n"
                + "Smart home\n"
                + "IoT devices are a part of the larger concept of home automation, which can include lighting, heating and air conditioning, media and security systems and camera systems. Long-term benefits could include energy savings by automatically ensuring lights and electronics are turned off or by making the residents in the home aware of usage. \n"
                + "A smart home or automated home could be based on a platform or hubs that control smart devices and appliances. For instance, using Apple's HomeKit, manufacturers can have their home products and accessories controlled by an application in iOS devices such as the iPhone and the Apple Watch. This could be a dedicated app or iOS native applications such as Siri. This can be demonstrated in the case of Lenovo's Smart Home Essentials, which is a line of smart home devices that are controlled through Apple's Home app or Siri without the need for a Wi-Fi bridge. There are also dedicated smart home hubs that are offered as standalone platforms to connect different smart home products and these include the Amazon Echo, Google Home, Apple's HomePod, and Samsung's SmartThings Hub. In addition to the commercial systems, there are many non-proprietary, open source ecosystems; including Home Assistant, OpenHAB and Domoticz. \n";
        WorkWithText();
        UniqueWords();
        Text = cleanString(Text);
    }

    public String cleanString(String input) {
        input = input.toLowerCase();
        input = input.replaceAll("-{2,}", "");
        input = input.replaceAll("-{2,}", " ");
        input = input.replaceAll("[^\\w -]", "").trim();
        return input;
    }

    public void WorkWithText() {
        for (int i = 0; i < Text.length(); i++) {
            if (Text.charAt(i) == ' ') {
                CountOfWords++;
            }
        }

    }

    public void UniqueWords() {
        List<String> stringsDuplicates = Arrays.asList(Text.split(" "));
        Set<String> cities = new HashSet<>(stringsDuplicates);
        CountOfUniqueWords = cities.size();
    }

    public int GetWords() {
        return CountOfWords;
    }

    public String GetText() {
        return Text;
    }

    public int GetUniqueWords() {
        return CountOfUniqueWords;
    }

    public Map<String, Long> sortByValue(final Map<String, Long> wordCounts) {

        return wordCounts.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    public TreeMap<String, Long> FirstThreeUniqueWords() {
        Map<String, Long> count = Arrays.stream(Text.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        count = sortByValue(count);
        TreeMap<String, Long> myNewMap = count.entrySet().stream()
                .limit(3)
                .collect(TreeMap::new, (m, e) -> m.put(e.getKey(), e.getValue()), Map::putAll);
        return myNewMap;
    }

    public int WordsWithoutZ() {                                                               //h i s t o r y  
        int count = 0;                                                                          //
        String[] str = Text.split(" ");
        for (int i = 0; i < str.length; i++) {
            Boolean flag = false;
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == 'z') {
                    flag = !flag;
                }
            }
            if (!flag) {
                count++;
            }

        }
        return count;
    }

    public int WordsWithTwoLetters() {
        int count = 0;
        String str1 = new String();
        String[] str = Text.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].chars().distinct().count() == 2) {
                count++;
            }
        }
        return count;
    }

    public String MostPopularSequences(int number, int length) {
        String[] words = Text.split(" ");
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        int currentWordLength;
        String sequence;

        for (int i = 0; i < words.length; i++) {
            currentWordLength = words[i].length();
            for (int j = 0; j < currentWordLength - length; j++) {
                sequence = words[i].substring(j, j + length);
                if (dictionary.containsKey(sequence)) {
                    dictionary.put(sequence, dictionary.get(sequence) + 1);
                } else {
                    dictionary.put(sequence, 1);
                }
            }
        }
        List<Entry<String, Integer>> list = new ArrayList<>(dictionary.entrySet());
        list.sort(Entry.comparingByValue());
        Collections.reverse(list);
        Object[] sortedArray = list.toArray();

        return Arrays.toString(Arrays.copyOfRange(sortedArray, 0, number));
    }

}
