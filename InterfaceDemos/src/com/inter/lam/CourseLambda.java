package com.inter.lam;

public class CourseLambda {
    public static void main(String[] args) {
        ICourse webCourse=()->{
            String [] web={"html","css","bootstrap"};
            return web;
        };
        System.out.println("Web Courses are : ");
        String[] web=webCourse.showCourse();
        for(String c:web)
            System.out.println(c);
        System.out.println();



        ICourse cloudCourse=()->{
            String [] cloud={"aws","GoogleCloud","Azure"};
            return cloud;
        };
        System.out.println("Cloud Courses are : ");
        String[] cloud=cloudCourse.showCourse();
        for(String c:cloud)
            System.out.println(c);
        System.out.println();


        ICourse javaCourse=()->{
            String [] java={"java","spring","junit"};
            return java;
        };
        System.out.println("Java Courses are : ");
        String [] java=javaCourse.showCourse();
        for(String c:java)
            System.out.println(c);

    }
}
