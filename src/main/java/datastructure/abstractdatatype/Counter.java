package datastructure.abstractdatatype;

import sun.plugin2.gluegen.runtime.CPU;

public final class Counter {
    private int counter;
    private String name;
    public Counter(String name){
        this.name = name;
    }

    public void increment(){
        this.counter++;
    }

    public int getCounter(){
        return this.counter;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "counter=" + counter +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Counter counter = new Counter("Test");
        System.out.println("Counter created! "+counter);
        for (int i=0;i<100;i++){
            counter.increment();
        }
        System.out.println("Counter Increment! "+counter);
    }
}
