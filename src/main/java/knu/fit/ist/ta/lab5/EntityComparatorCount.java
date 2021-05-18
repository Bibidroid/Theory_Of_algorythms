/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.Comparator;

public class EntityComparatorCount implements Comparator<Entity> {

    @Override
    public int compare(Entity firstEntity, Entity secondEntity) {
        if (firstEntity.getCount() < secondEntity.getCount()) {
            return -1;
        }
        if (firstEntity.getCount() > secondEntity.getCount()) {
            return 1;
        }
        return 0;
//        return firstEntity.getCount().compareTo(secondEntity.getCount());

//        return Long.compare(firstEntity.getCount(), secondEntity.getCount());
    }

}
