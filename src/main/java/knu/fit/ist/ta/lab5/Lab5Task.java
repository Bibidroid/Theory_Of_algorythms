/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.ArrayList;
import java.util.LinkedList;
import knu.fit.ist.ta.lab3.Lab3Arr;
import knu.fit.ist.ta.lab4.Entity;
import knu.fit.ist.ta.lab4.EntityComparatorCount;
import knu.fit.ist.ta.lab4.EntityComparatorText;
import java.util.Random;
import java.util.Comparator;

public class Lab5Task {

    private final int numberOfItems = 25720;
    private static LinkedList<Entity> list;
    private String Text
            = "History\n"
            + "The main concept of a network of smart devices was discussed as early as 1982, with a modified Coca-Cola vending machine at Carnegie Mellon University becoming the first Internet-connected appliance, able to report its inventory and whether newly loaded drinks were cold or not. Mark Weiser's 1991 paper on ubiquitous computing, \"The Computer of the 21st Century\", as well as academic venues such as UbiComp and PerCom produced the contemporary vision of the IOT. In 1994, Reza Raji described the concept in IEEE Spectrum as \"[moving] small packets of data to a large set of nodes, so as to integrate and automate everything from home appliances to entire factories\". Between 1993 and 1997, several companies proposed solutions like Microsoft's at Work or Novell's NEST. The field gained momentum when Bill Joy envisioned device-to-device communication as a part of his \"Six Webs\" framework, presented at the World Economic Forum at Davos in 1999. \n"
            + "The term \"Internet of things\" was coined by Kevin Ashton of Procter & Gamble, later MIT's Auto-ID Center, in 1999, though he prefers the phrase \"Internet for things\". At that point, he viewed radio-frequency identification (RFID) as essential to the Internet of things, which would allow computers to manage all individual things. \n"
            + "Defining the Internet of things as \"simply the point in time when more 'things or objects' were connected to the Internet than people\", Cisco Systems estimated that the IoT was \"born\" between 2008 and 2009, with the things/people ratio growing from 0.08 in 2003 to 1.84 in 2010. \n"
            + "Smart home\n"
            + "IoT devices are a part of the larger concept of home automation, which can include lighting, heating and air conditioning, media and security systems and camera systems. Long-term benefits could include energy savings by automatically ensuring lights and electronics are turned off or by making the residents in the home aware of usage. \n"
            + "A smart home or automated home could be based on a platform or hubs that control smart devices and appliances. For instance, using Apple's HomeKit, manufacturers can have their home products and accessories controlled by an application in iOS devices such as the iPhone and the Apple Watch. This could be a dedicated app or iOS native applications such as Siri. This can be demonstrated in the case of Lenovo's Smart Home Essentials, which is a line of smart home devices that are controlled through Apple's Home app or Siri without the need for a Wi-Fi bridge. There are also dedicated smart home hubs that are offered as standalone platforms to connect different smart home products and these include the Amazon Echo, Google Home, Apple's HomePod, and Samsung's SmartThings Hub. In addition to the commercial systems, there are many non-proprietary, open source ecosystems; including Home Assistant, OpenHAB and Domoticz. \n";

    public Lab5Task() {
        list = new LinkedList<Entity>();
        Random rand = new Random();
        for (int i = 1; i <= numberOfItems; i++) {
            list.add(new Entity("Entity №" + i, rand.nextInt(30000)));
        }

    }

    public String ShowEntities() {
        String text = new String();

        for (Entity e : list) {
            text += "   | " + e.getText() + " &nbsp;&nbsp;&nbsp;:   " + e.getCount() + " |   <br>";
        }
        return text;
    }

    public void SortList(Comparator<Entity> comporator) {
        Entity s; //temp indexes
        int t;
        LinkedList<Entity> result = new LinkedList< Entity>();
        result.addAll(list);

        int n = result.size() - 1;
        int k = 0;
        Entity entity = new Entity();

        while (k != n) {
            t = k + 1;
            entity = result.get(t);

            while (t > 0 && comporator.compare(result.get(t), result.get(t - 1)) > 1) {
                s = result.get(t);
                result.set(t, result.get(t - 1));
                result.set(t - 1, s);
                t--;
            }

            k++;
        }
    }

    public static int linearSearch(long find) {
        int result = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCount() == find) {
                return i + 1;
            }
        }
        return result;
    }

    public void SortByStringField() {
        EntityComparatorText comparator = new EntityComparatorText();
        SortList(comparator);
    }

    public void SortByLongField() {
        EntityComparatorCount comparator = new EntityComparatorCount();
        SortList(comparator);
    }

}
