package com.company;

public class Main {
    private String name;

    public Main(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof String) return name.equals((String) o);
        if (o instanceof Main) return name.equals(((Main) o).name);
        return false;
    }

    public static void main(String[] args) {
	    Main p1 = new Main("Java");
        String p2 = "Java";
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));
    }
}
