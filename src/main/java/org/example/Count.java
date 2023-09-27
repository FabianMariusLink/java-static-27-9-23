package org.example;

import java.util.Objects;

public class Count {
    private static int totalCount = 0;
    private int instanceCount = 0;

    public static int getTotalCount() {
        return totalCount;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Count count = (Count) o;
        return instanceCount == count.instanceCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceCount);
    }

    @Override
    public String toString() {
        return "Count " +
                "totalCount = " + totalCount +
                ", instanceCount = " + instanceCount;
    }

    public static void incrementTotalCount(){
        totalCount++;
    }

    public void incrementInstanceCount(){
        this.instanceCount++;
    }

}

